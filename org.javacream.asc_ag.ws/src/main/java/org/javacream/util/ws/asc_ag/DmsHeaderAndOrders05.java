package org.javacream.util.ws.asc_ag;

import org.javacream.asc_ag.types.DMSHeaderType;
import org.javacream.asc_ag.types.ORDERS05Type;

public class DmsHeaderAndOrders05 {

	private DMSHeaderType dmsHeader;
	private ORDERS05Type order05;
	public DMSHeaderType getDmsHeader() {
		return dmsHeader;
	}
	public ORDERS05Type getOrder05() {
		return order05;
	}
	public DmsHeaderAndOrders05() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setDmsHeader(DMSHeaderType dmsHeader) {
		this.dmsHeader = dmsHeader;
	}
	public void setOrder05(ORDERS05Type order05) {
		this.order05 = order05;
	}
	public DmsHeaderAndOrders05(DMSHeaderType dmsHeader, ORDERS05Type order05) {
		super();
		this.dmsHeader = dmsHeader;
		this.order05 = order05;
	}
	@Override
	public String toString() {
		return "DmsHeaderAndOrders05 [dmsHeader=" + dmsHeader + ", order05=" + order05 + "]";
	}
}
