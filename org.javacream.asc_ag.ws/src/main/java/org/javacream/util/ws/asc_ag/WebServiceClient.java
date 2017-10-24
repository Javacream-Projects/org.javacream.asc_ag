package org.javacream.util.ws.asc_ag;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;

import org.javacream.asc_ag.types.DMSHeaderType;
import org.javacream.asc_ag.types.ORDERS05Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Node;

@Component
public class WebServiceClient {

	@Autowired
	private WebServiceTemplate webServiceTemplate;
	@Autowired
	private Marshaller marshaller;

	@Autowired SaajSoapMessage message;
	public DOMResult callWebService(DMSHeaderType dmsHeader, ORDERS05Type orders05) {
		try {
			DOMSource domSource = new DOMSource(message.getDocument());
			DOMResult domResult = new DOMResult();
			marshaller.marshal(new JAXBElement<DMSHeaderType>(new QName("DMS_Header"), DMSHeaderType.class, dmsHeader), (Node)message.getSaajMessage().getSOAPBody());
			marshaller.marshal(new JAXBElement<ORDERS05Type>(new QName("ORDERS05"), ORDERS05Type.class, orders05), (Node)message.getSaajMessage().getSOAPBody());
			webServiceTemplate.sendSourceAndReceiveToResult(domSource, domResult);
			return domResult;
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}

}
