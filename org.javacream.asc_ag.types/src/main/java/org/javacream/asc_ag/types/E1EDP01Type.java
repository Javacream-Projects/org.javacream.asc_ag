//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.22 um 12:23:03 PM CEST 
//


package org.javacream.asc_ag.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für E1EDP01Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="E1EDP01Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POSEX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MENGE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="E1EDP19" type="{http://org.javacream.asc}E1EDP19Type"/&gt;
 *         &lt;element name="E1EDPT1" type="{http://org.javacream.asc}E1EDPT1Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="SEGMENT" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E1EDP01Type", propOrder = {
    "posex",
    "menge",
    "e1EDP19",
    "e1EDPT1"
})
public class E1EDP01Type {

    @XmlElement(name = "POSEX", required = true)
    protected String posex;
    @XmlElement(name = "MENGE", required = true)
    protected String menge;
    @XmlElement(name = "E1EDP19", required = true)
    protected E1EDP19Type e1EDP19;
    @XmlElement(name = "E1EDPT1")
    protected E1EDPT1Type e1EDPT1;
    @XmlAttribute(name = "SEGMENT")
    protected String segment;

    /**
     * Ruft den Wert der posex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSEX() {
        return posex;
    }

    /**
     * Legt den Wert der posex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSEX(String value) {
        this.posex = value;
    }

    /**
     * Ruft den Wert der menge-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMENGE() {
        return menge;
    }

    /**
     * Legt den Wert der menge-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMENGE(String value) {
        this.menge = value;
    }

    /**
     * Ruft den Wert der e1EDP19-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDP19Type }
     *     
     */
    public E1EDP19Type getE1EDP19() {
        return e1EDP19;
    }

    /**
     * Legt den Wert der e1EDP19-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDP19Type }
     *     
     */
    public void setE1EDP19(E1EDP19Type value) {
        this.e1EDP19 = value;
    }

    /**
     * Ruft den Wert der e1EDPT1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDPT1Type }
     *     
     */
    public E1EDPT1Type getE1EDPT1() {
        return e1EDPT1;
    }

    /**
     * Legt den Wert der e1EDPT1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDPT1Type }
     *     
     */
    public void setE1EDPT1(E1EDPT1Type value) {
        this.e1EDPT1 = value;
    }

    /**
     * Ruft den Wert der segment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENT() {
        return segment;
    }

    /**
     * Legt den Wert der segment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENT(String value) {
        this.segment = value;
    }

}
