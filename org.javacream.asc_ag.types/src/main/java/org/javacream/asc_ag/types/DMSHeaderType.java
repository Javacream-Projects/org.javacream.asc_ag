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
 * <p>Java-Klasse für DMS_HeaderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DMS_HeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDocTyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MesTyp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ISServerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RespNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RespIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ISServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PLType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PLCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDocType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MesType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Werks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PartnerCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustOrderNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustOrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DMSToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMS_HeaderType", propOrder = {
    "iDocTyp",
    "mesTyp",
    "timeStamp",
    "customerNum",
    "isServerID",
    "respNo",
    "respIndex",
    "isServiceID",
    "plType",
    "plCategory",
    "region",
    "language",
    "iDocType",
    "mesType",
    "werks",
    "userID",
    "partnerCode",
    "custOrderNo",
    "custOrderDate",
    "password",
    "dmsToken"
})
public class DMSHeaderType {

    @XmlElement(name = "IDocTyp", required = true)
    protected String iDocTyp;
    @XmlElement(name = "MesTyp", required = true)
    protected String mesTyp;
    @XmlElement(name = "TimeStamp", required = true)
    protected String timeStamp;
    @XmlElement(name = "CustomerNum", required = true)
    protected String customerNum;
    @XmlElement(name = "ISServerID", required = true)
    protected String isServerID;
    @XmlElement(name = "RespNo")
    protected int respNo;
    @XmlElement(name = "RespIndex")
    protected int respIndex;
    @XmlElement(name = "ISServiceID", required = true)
    protected String isServiceID;
    @XmlElement(name = "PLType", required = true)
    protected String plType;
    @XmlElement(name = "PLCategory", required = true)
    protected String plCategory;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "IDocType", required = true)
    protected String iDocType;
    @XmlElement(name = "MesType", required = true)
    protected String mesType;
    @XmlElement(name = "Werks", required = true)
    protected String werks;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "PartnerCode", required = true)
    protected String partnerCode;
    @XmlElement(name = "CustOrderNo", required = true)
    protected String custOrderNo;
    @XmlElement(name = "CustOrderDate", required = true)
    protected String custOrderDate;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "DMSToken", required = true)
    protected String dmsToken;

    /**
     * Ruft den Wert der iDocTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDocTyp() {
        return iDocTyp;
    }

    /**
     * Legt den Wert der iDocTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDocTyp(String value) {
        this.iDocTyp = value;
    }

    /**
     * Ruft den Wert der mesTyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesTyp() {
        return mesTyp;
    }

    /**
     * Legt den Wert der mesTyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesTyp(String value) {
        this.mesTyp = value;
    }

    /**
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Ruft den Wert der customerNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNum() {
        return customerNum;
    }

    /**
     * Legt den Wert der customerNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNum(String value) {
        this.customerNum = value;
    }

    /**
     * Ruft den Wert der isServerID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISServerID() {
        return isServerID;
    }

    /**
     * Legt den Wert der isServerID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISServerID(String value) {
        this.isServerID = value;
    }

    /**
     * Ruft den Wert der respNo-Eigenschaft ab.
     * 
     */
    public int getRespNo() {
        return respNo;
    }

    /**
     * Legt den Wert der respNo-Eigenschaft fest.
     * 
     */
    public void setRespNo(int value) {
        this.respNo = value;
    }

    /**
     * Ruft den Wert der respIndex-Eigenschaft ab.
     * 
     */
    public int getRespIndex() {
        return respIndex;
    }

    /**
     * Legt den Wert der respIndex-Eigenschaft fest.
     * 
     */
    public void setRespIndex(int value) {
        this.respIndex = value;
    }

    /**
     * Ruft den Wert der isServiceID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISServiceID() {
        return isServiceID;
    }

    /**
     * Legt den Wert der isServiceID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISServiceID(String value) {
        this.isServiceID = value;
    }

    /**
     * Ruft den Wert der plType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLType() {
        return plType;
    }

    /**
     * Legt den Wert der plType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLType(String value) {
        this.plType = value;
    }

    /**
     * Ruft den Wert der plCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLCategory() {
        return plCategory;
    }

    /**
     * Legt den Wert der plCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLCategory(String value) {
        this.plCategory = value;
    }

    /**
     * Ruft den Wert der region-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Legt den Wert der region-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der iDocType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDocType() {
        return iDocType;
    }

    /**
     * Legt den Wert der iDocType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDocType(String value) {
        this.iDocType = value;
    }

    /**
     * Ruft den Wert der mesType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesType() {
        return mesType;
    }

    /**
     * Legt den Wert der mesType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesType(String value) {
        this.mesType = value;
    }

    /**
     * Ruft den Wert der werks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWerks() {
        return werks;
    }

    /**
     * Legt den Wert der werks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWerks(String value) {
        this.werks = value;
    }

    /**
     * Ruft den Wert der userID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Legt den Wert der userID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Ruft den Wert der partnerCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * Legt den Wert der partnerCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * Ruft den Wert der custOrderNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustOrderNo() {
        return custOrderNo;
    }

    /**
     * Legt den Wert der custOrderNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustOrderNo(String value) {
        this.custOrderNo = value;
    }

    /**
     * Ruft den Wert der custOrderDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustOrderDate() {
        return custOrderDate;
    }

    /**
     * Legt den Wert der custOrderDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustOrderDate(String value) {
        this.custOrderDate = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Ruft den Wert der dmsToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMSToken() {
        return dmsToken;
    }

    /**
     * Legt den Wert der dmsToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMSToken(String value) {
        this.dmsToken = value;
    }

}
