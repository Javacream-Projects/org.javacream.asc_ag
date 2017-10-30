package org.javacream.asc_ag.ws;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

@Configuration
@ComponentScan(basePackages = "org.javacream.asc_ag.ws")
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

	@Bean Transformer transformer() {
		try {
			return TransformerFactory.newInstance().newTransformer();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
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
		ClientInterceptor clientInterceptor = new ClientInterceptor() {
			@Override
			public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
				return true;
			}

			@Override
			public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
				return true;
			}

			@Override
			public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
				return true;
			}

			@Override
			public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
				try {
					System.out.println("Request :");
					messageContext.getRequest().writeTo(System.out);
					System.out.println("\nResponse : ");
					messageContext.getResponse().writeTo(System.out);
					System.out.println();
				} catch (IOException ignored) {
				}
			}
		};

		webServiceTemplate.setInterceptors(new ClientInterceptor[] { clientInterceptor });
		return webServiceTemplate;
	}

	@Bean
	public JAXBContext jaxbContext() throws Exception {
		return JAXBContext.newInstance(jaxbPackage);
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
