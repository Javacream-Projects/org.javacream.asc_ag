package org.javacream.util.ws.asc_ag;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.javacream.asc_ag.types.DMSHeaderType;
import org.javacream.asc_ag.types.E1EDK01Type;
import org.javacream.asc_ag.types.IDOCType;
import org.javacream.asc_ag.types.ORDERS05Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { WebServiceClientConfiguration.class })
public class WebServiceClientTest {
	@Autowired
	private WebServiceClient wsClient;

	@Test
	public void testSoapMessageGeneration() throws Exception {
		ORDERS05Type order05 = new ORDERS05Type();
		IDOCType idocType = new IDOCType();
		E1EDK01Type e1edk01Type = new E1EDK01Type();
		e1edk01Type.setSEGMENT("1");
		order05.setIDOC(idocType);
		idocType.setBEGIN("1");
		idocType.setE1EDK01(e1edk01Type);
		DMSHeaderType dmsHeader = new DMSHeaderType();
		dmsHeader.setCustomerNum("0000050389");
		dmsHeader.setCustOrderDate("20171014");
		dmsHeader.setCustOrderNo("MAN1_" + Math.random());
		dmsHeader.setPartnerCode("0000050389");
		dmsHeader.setISServerID("IS01");
		dmsHeader.setISServiceID("REQ_PARTSPURCHASEORDER");
		dmsHeader.setUserID("Z6141");
		DOMResult result = wsClient.callWebService(dmsHeader, order05);
		StreamResult streamResult = new StreamResult(System.out);
		Transformer transformer = TransformerFactory.newInstance().newTransformer();
		transformer.transform(new DOMSource(result.getNode()), streamResult);
	}
}
