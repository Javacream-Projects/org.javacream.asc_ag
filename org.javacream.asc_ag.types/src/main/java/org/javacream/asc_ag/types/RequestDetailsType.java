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
 * <p>Java-Klasse für Request_DetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Request_DetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VehicleNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VehicleRegNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CountryKeyISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceInfoFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaintenancePlanFlag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request_DetailsType", propOrder = {
    "vin",
    "vehicleNum",
    "vehicleRegNum",
    "countryKeyISO",
    "serviceInfoFlag",
    "maintenancePlanFlag"
})
public class RequestDetailsType {

    @XmlElement(name = "VIN", required = true)
    protected String vin;
    @XmlElement(name = "VehicleNum", required = true)
    protected String vehicleNum;
    @XmlElement(name = "VehicleRegNum", required = true)
    protected String vehicleRegNum;
    @XmlElement(name = "CountryKeyISO", required = true)
    protected String countryKeyISO;
    @XmlElement(name = "ServiceInfoFlag", required = true)
    protected String serviceInfoFlag;
    @XmlElement(name = "MaintenancePlanFlag", required = true)
    protected String maintenancePlanFlag;

    /**
     * Ruft den Wert der vin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Legt den Wert der vin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Ruft den Wert der vehicleNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNum() {
        return vehicleNum;
    }

    /**
     * Legt den Wert der vehicleNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNum(String value) {
        this.vehicleNum = value;
    }

    /**
     * Ruft den Wert der vehicleRegNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNum() {
        return vehicleRegNum;
    }

    /**
     * Legt den Wert der vehicleRegNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNum(String value) {
        this.vehicleRegNum = value;
    }

    /**
     * Ruft den Wert der countryKeyISO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryKeyISO() {
        return countryKeyISO;
    }

    /**
     * Legt den Wert der countryKeyISO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryKeyISO(String value) {
        this.countryKeyISO = value;
    }

    /**
     * Ruft den Wert der serviceInfoFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInfoFlag() {
        return serviceInfoFlag;
    }

    /**
     * Legt den Wert der serviceInfoFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInfoFlag(String value) {
        this.serviceInfoFlag = value;
    }

    /**
     * Ruft den Wert der maintenancePlanFlag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenancePlanFlag() {
        return maintenancePlanFlag;
    }

    /**
     * Legt den Wert der maintenancePlanFlag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenancePlanFlag(String value) {
        this.maintenancePlanFlag = value;
    }

}
