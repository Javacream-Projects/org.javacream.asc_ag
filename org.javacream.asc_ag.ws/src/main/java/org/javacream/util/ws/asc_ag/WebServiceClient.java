package org.javacream.util.ws.asc_ag;

import org.javacream.asc_ag.types.PurchaseRequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

@Component
public class WebServiceClient {

	@Autowired
	private WebServiceTemplate webServiceTemplate;

	@SuppressWarnings("unchecked")
	public <T> T callWebService(PurchaseRequestType purchaseRequestType) {
		return (T)webServiceTemplate.marshalSendAndReceive(purchaseRequestType);
	}


}
