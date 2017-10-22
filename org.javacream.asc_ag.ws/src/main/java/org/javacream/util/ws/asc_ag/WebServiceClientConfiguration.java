package org.javacream.util.ws.asc_ag;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

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

}
