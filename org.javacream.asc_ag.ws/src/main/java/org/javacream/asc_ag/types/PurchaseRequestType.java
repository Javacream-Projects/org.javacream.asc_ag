package org.javacream.asc_ag.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseRequestType", propOrder = {
    "dmsHeader",
    "orders05"
})
@XmlRootElement
public class PurchaseRequestType {

    @XmlElement(name = "DMS_Header", required = true)
    protected DMSHeaderType dmsHeader;
    @XmlElement(name = "ORDERS05", required = true)
    protected ORDERS05Type orders05;

    public DMSHeaderType getDMSHeader() {
        return dmsHeader;
    }

    public void setDMSHeader(DMSHeaderType value) {
        this.dmsHeader = value;
    }

    public ORDERS05Type getORDERS05() {
        return orders05;
    }

    public void setORDERS05(ORDERS05Type value) {
        this.orders05 = value;
    }

}
