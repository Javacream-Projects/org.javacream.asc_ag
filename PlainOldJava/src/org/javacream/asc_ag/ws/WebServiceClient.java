package org.javacream.asc_ag.ws;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.TransformerException;

import org.javacream.asc_ag.types.DMSHeaderType;
import org.javacream.asc_ag.types.ORDERS05Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Node;

@Component
public class WebServiceClient {

	@Autowired
	private WebServiceTemplate webServiceTemplate;
	@Autowired
	private Marshaller marshaller;
	@Autowired
	private Unmarshaller unmarshaller;

	public DmsHeaderAndOrders05 callWebService(DmsHeaderAndOrders05 dmsHeaderAndOrders05) {
		try {
			final DmsHeaderAndOrders05 result = new DmsHeaderAndOrders05();
			WebServiceMessageCallback webServiceRequestMessageCallback = new WebServiceMessageCallback() {

				@Override
				public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
					SaajSoapMessage soapMessage = (SaajSoapMessage) message;
					try {
						Node body = (Node) soapMessage.getSaajMessage().getSOAPBody();
						marshaller.marshal(new JAXBElement<DMSHeaderType>(new QName("DMS_Header"), DMSHeaderType.class,
								dmsHeaderAndOrders05.getDmsHeader()), body);
						marshaller.marshal(new JAXBElement<ORDERS05Type>(new QName("ORDERS05"), ORDERS05Type.class,
								dmsHeaderAndOrders05.getOrder05()), body);
					} catch (Exception e) {
						throw new RuntimeException(e);

					}
				}
			};
			WebServiceMessageCallback webServiceResponseMessageCallback = new WebServiceMessageCallback() {

				@Override
				public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
					SaajSoapMessage soapMessage = (SaajSoapMessage) message;
					try {
						Node body = (Node) soapMessage.getSaajMessage().getSOAPBody();
						JAXBElement<DMSHeaderType> resultDmsHeader = unmarshaller.unmarshal(body.getFirstChild(),
								DMSHeaderType.class);
						JAXBElement<ORDERS05Type> resultOrders05 = unmarshaller.unmarshal(body.getLastChild(),
								ORDERS05Type.class);
						result.setDmsHeader(resultDmsHeader.getValue());
						result.setOrder05(resultOrders05.getValue());
					} catch (Exception e) {
						throw new RuntimeException(e);

					}
				}
			};
			webServiceTemplate.sendAndReceive(webServiceRequestMessageCallback, webServiceResponseMessageCallback);

			return result;
		} catch (Exception e) {
			throw new RuntimeException(e);

		}
	}

}
