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
 * <p>Java-Klasse für E1EDPT1Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="E1EDPT1Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSSPRAS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TSSPRAS_ISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="E1EDPT2" type="{http://org.javacream.asc}E1EDPT2Type"/&gt;
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
@XmlType(name = "E1EDPT1Type", propOrder = {
    "tdid",
    "tsspras",
    "tssprasiso",
    "e1EDPT2"
})
public class E1EDPT1Type {

    @XmlElement(name = "TDID", required = true)
    protected String tdid;
    @XmlElement(name = "TSSPRAS", required = true)
    protected String tsspras;
    @XmlElement(name = "TSSPRAS_ISO", required = true)
    protected String tssprasiso;
    @XmlElement(name = "E1EDPT2", required = true)
    protected E1EDPT2Type e1EDPT2;
    @XmlAttribute(name = "SEGMENT")
    protected String segment;

    /**
     * Ruft den Wert der tdid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDID() {
        return tdid;
    }

    /**
     * Legt den Wert der tdid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDID(String value) {
        this.tdid = value;
    }

    /**
     * Ruft den Wert der tsspras-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSPRAS() {
        return tsspras;
    }

    /**
     * Legt den Wert der tsspras-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSPRAS(String value) {
        this.tsspras = value;
    }

    /**
     * Ruft den Wert der tssprasiso-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSSPRASISO() {
        return tssprasiso;
    }

    /**
     * Legt den Wert der tssprasiso-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSSPRASISO(String value) {
        this.tssprasiso = value;
    }

    /**
     * Ruft den Wert der e1EDPT2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDPT2Type }
     *     
     */
    public E1EDPT2Type getE1EDPT2() {
        return e1EDPT2;
    }

    /**
     * Legt den Wert der e1EDPT2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDPT2Type }
     *     
     */
    public void setE1EDPT2(E1EDPT2Type value) {
        this.e1EDPT2 = value;
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
