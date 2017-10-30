package org.javacream.asc_ag.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class WebServiceClientHelper {
	public static WebServiceClient getWebServiceClient() {
		SpringApplication application = new SpringApplication(WebServiceClientConfiguration.class);
		application.setWebEnvironment(false);
		String[] args = new String[0];
		ConfigurableApplicationContext context = application.run(args);
		return context.getBean(WebServiceClient.class);
	}
	
}
