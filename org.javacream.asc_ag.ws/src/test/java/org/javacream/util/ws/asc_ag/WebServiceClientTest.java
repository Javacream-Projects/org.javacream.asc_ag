package org.javacream.util.ws.asc_ag;

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
		dmsHeader.setCustOrderNo("MAN1_2" + Math.random());
		dmsHeader.setPartnerCode("0000050389");
		dmsHeader.setISServerID("IS01");
		dmsHeader.setISServiceID("REQ_PARTSPURCHASEORDER");
		dmsHeader.setUserID("Z6141");
		DmsHeaderAndOrders05 result = wsClient.callWebService(new DmsHeaderAndOrders05(dmsHeader, order05));
		System.out.println(result.getDmsHeader().getISServiceID());
		System.out.println(result.getOrder05().getIDOC().getBEGIN());
		
	}
}
