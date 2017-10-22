package org.javacream.util.ws.asc_ag;

import org.javacream.asc_ag.types.DMSHeaderType;
import org.javacream.asc_ag.types.E1EDK01Type;
import org.javacream.asc_ag.types.IDOCType;
import org.javacream.asc_ag.types.ORDERS05Type;
import org.javacream.asc_ag.types.PurchaseRequestType;
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
		PurchaseRequestType purchaseRequestType = new PurchaseRequestType();
		ORDERS05Type order05 = new ORDERS05Type();
		IDOCType idocType = new IDOCType();
		E1EDK01Type e1edk01Type = new E1EDK01Type();
		e1edk01Type.setSEGMENT("1");
		order05.setIDOC(idocType);
		idocType.setBEGIN("1");
		idocType.setE1EDK01(e1edk01Type);
		DMSHeaderType dmsHeaderType = new DMSHeaderType();
		dmsHeaderType.setCustomerNum("0000050389");
		dmsHeaderType.setCustOrderDate("20171014");
		dmsHeaderType.setCustOrderNo("MAN1_" + Math.random());
		dmsHeaderType.setPartnerCode("0000050389");
		dmsHeaderType.setISServerID("IS01");
		dmsHeaderType.setISServiceID("REQ_PARTSPURCHASEORDER");
		dmsHeaderType.setUserID("Z6141");
		purchaseRequestType.setDMSHeader(dmsHeaderType);
		purchaseRequestType.setORDERS05(order05);
		PurchaseRequestType result = wsClient.callWebService(purchaseRequestType);
		System.out.println(result);
	}
}
