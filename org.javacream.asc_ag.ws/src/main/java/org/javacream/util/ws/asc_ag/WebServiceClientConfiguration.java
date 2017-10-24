package org.javacream.util.ws.asc_ag;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
@ComponentScan(basePackages = "org.javacream.util")
public class WebServiceClientConfiguration {

	@Value("${client.ssl.keystore.path}")
	private String keystorePath;
	@Value("${client.ssl.keystore.password}")
	private String keystorePassword;
	@Value("${client.ssl.keystore.type}")
	private String keystoreType;
	@Value("${jaxb.package}")
	private String jaxbPackage;
	@Value("${client.default-uri}")
	private String defaultUri;

	@PostConstruct
	public void init() {
		System.setProperty("javax.net.ssl.keyStore", keystorePath);
		System.setProperty("javax.net.ssl.keyStorePassword", keystorePassword);
		System.setProperty("javax.net.ssl.keyStoreType", keystoreType);

	}

	@Bean
	Jaxb2Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan(jaxbPackage);
		return jaxb2Marshaller;
	}

	@Bean
	public WebServiceTemplate webServiceTemplate() throws Exception {
		WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
		webServiceTemplate.setMarshaller(jaxb2Marshaller());
		webServiceTemplate.setUnmarshaller(jaxb2Marshaller());
		webServiceTemplate.setDefaultUri(defaultUri);
		return webServiceTemplate;
	}

	@Bean
	public JAXBContext jaxbContext() throws Exception {
		return JAXBContext.newInstance(jaxbPackage);
	}

	@Bean
	@Scope("prototype")
	public SaajSoapMessage saajSoapMessage() throws Exception {
		return soapMessageFactory().createWebServiceMessage();
	}

	@Bean
	public SaajSoapMessageFactory soapMessageFactory() throws Exception {
		MessageFactory messageFactory = MessageFactory.newInstance();
		return new SaajSoapMessageFactory(messageFactory);
	}

	@Bean
	public Marshaller marshaller() {
		try {
			return jaxbContext().createMarshaller();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	@Bean
	public Unmarshaller unmarshaller() {
		try {
			return jaxbContext().createUnmarshaller();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
}
