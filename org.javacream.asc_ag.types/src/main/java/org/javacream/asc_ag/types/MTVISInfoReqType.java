//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.22 um 12:23:03 PM CEST 
//


package org.javacream.asc_ag.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MT_VISInfoReqType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MT_VISInfoReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DMS_Header" type="{http://org.javacream.asc}DMS_HeaderType"/&gt;
 *         &lt;element name="Request_Details" type="{http://org.javacream.asc}Request_DetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT_VISInfoReqType", propOrder = {
    "dmsHeader",
    "requestDetails"
})
public class MTVISInfoReqType {

    @XmlElement(name = "DMS_Header", required = true)
    protected DMSHeaderType dmsHeader;
    @XmlElement(name = "Request_Details", required = true)
    protected RequestDetailsType requestDetails;

    /**
     * Ruft den Wert der dmsHeader-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DMSHeaderType }
     *     
     */
    public DMSHeaderType getDMSHeader() {
        return dmsHeader;
    }

    /**
     * Legt den Wert der dmsHeader-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSHeaderType }
     *     
     */
    public void setDMSHeader(DMSHeaderType value) {
        this.dmsHeader = value;
    }

    /**
     * Ruft den Wert der requestDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetailsType }
     *     
     */
    public RequestDetailsType getRequestDetails() {
        return requestDetails;
    }

    /**
     * Legt den Wert der requestDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetailsType }
     *     
     */
    public void setRequestDetails(RequestDetailsType value) {
        this.requestDetails = value;
    }

}
