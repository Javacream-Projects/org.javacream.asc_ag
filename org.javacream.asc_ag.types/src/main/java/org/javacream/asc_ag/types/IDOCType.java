//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.22 um 12:23:03 PM CEST 
//


package org.javacream.asc_ag.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IDOCType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IDOCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="E1EDK01" type="{http://org.javacream.asc}E1EDK01Type"/&gt;
 *         &lt;element name="E1EDK03" type="{http://org.javacream.asc}E1EDK03Type"/&gt;
 *         &lt;element name="E1EDKA1" type="{http://org.javacream.asc}E1EDKA1Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="E1EDK02" type="{http://org.javacream.asc}E1EDK02Type"/&gt;
 *         &lt;element name="E1EDK35" type="{http://org.javacream.asc}E1EDK35Type"/&gt;
 *         &lt;element name="E1EDKT1" type="{http://org.javacream.asc}E1EDKT1Type"/&gt;
 *         &lt;element name="E1EDKT2" type="{http://org.javacream.asc}E1EDKT2Type"/&gt;
 *         &lt;element name="E1EDP01" type="{http://org.javacream.asc}E1EDP01Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BEGIN" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDOCType", propOrder = {
    "e1EDK01",
    "e1EDK03",
    "e1EDKA1",
    "e1EDK02",
    "e1EDK35",
    "e1EDKT1",
    "e1EDKT2",
    "e1EDP01"
})
public class IDOCType {

    @XmlElement(name = "E1EDK01", required = true)
    protected E1EDK01Type e1EDK01;
    @XmlElement(name = "E1EDK03", required = true)
    protected E1EDK03Type e1EDK03;
    @XmlElement(name = "E1EDKA1")
    protected List<E1EDKA1Type> e1EDKA1;
    @XmlElement(name = "E1EDK02", required = true)
    protected E1EDK02Type e1EDK02;
    @XmlElement(name = "E1EDK35", required = true)
    protected E1EDK35Type e1EDK35;
    @XmlElement(name = "E1EDKT1", required = true)
    protected E1EDKT1Type e1EDKT1;
    @XmlElement(name = "E1EDKT2", required = true)
    protected E1EDKT2Type e1EDKT2;
    @XmlElement(name = "E1EDP01")
    protected List<E1EDP01Type> e1EDP01;
    @XmlAttribute(name = "BEGIN")
    protected String begin;

    /**
     * Ruft den Wert der e1EDK01-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDK01Type }
     *     
     */
    public E1EDK01Type getE1EDK01() {
        return e1EDK01;
    }

    /**
     * Legt den Wert der e1EDK01-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDK01Type }
     *     
     */
    public void setE1EDK01(E1EDK01Type value) {
        this.e1EDK01 = value;
    }

    /**
     * Ruft den Wert der e1EDK03-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDK03Type }
     *     
     */
    public E1EDK03Type getE1EDK03() {
        return e1EDK03;
    }

    /**
     * Legt den Wert der e1EDK03-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDK03Type }
     *     
     */
    public void setE1EDK03(E1EDK03Type value) {
        this.e1EDK03 = value;
    }

    /**
     * Gets the value of the e1EDKA1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDKA1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDKA1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1EDKA1Type }
     * 
     * 
     */
    public List<E1EDKA1Type> getE1EDKA1() {
        if (e1EDKA1 == null) {
            e1EDKA1 = new ArrayList<E1EDKA1Type>();
        }
        return this.e1EDKA1;
    }

    /**
     * Ruft den Wert der e1EDK02-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDK02Type }
     *     
     */
    public E1EDK02Type getE1EDK02() {
        return e1EDK02;
    }

    /**
     * Legt den Wert der e1EDK02-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDK02Type }
     *     
     */
    public void setE1EDK02(E1EDK02Type value) {
        this.e1EDK02 = value;
    }

    /**
     * Ruft den Wert der e1EDK35-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDK35Type }
     *     
     */
    public E1EDK35Type getE1EDK35() {
        return e1EDK35;
    }

    /**
     * Legt den Wert der e1EDK35-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDK35Type }
     *     
     */
    public void setE1EDK35(E1EDK35Type value) {
        this.e1EDK35 = value;
    }

    /**
     * Ruft den Wert der e1EDKT1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDKT1Type }
     *     
     */
    public E1EDKT1Type getE1EDKT1() {
        return e1EDKT1;
    }

    /**
     * Legt den Wert der e1EDKT1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDKT1Type }
     *     
     */
    public void setE1EDKT1(E1EDKT1Type value) {
        this.e1EDKT1 = value;
    }

    /**
     * Ruft den Wert der e1EDKT2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link E1EDKT2Type }
     *     
     */
    public E1EDKT2Type getE1EDKT2() {
        return e1EDKT2;
    }

    /**
     * Legt den Wert der e1EDKT2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link E1EDKT2Type }
     *     
     */
    public void setE1EDKT2(E1EDKT2Type value) {
        this.e1EDKT2 = value;
    }

    /**
     * Gets the value of the e1EDP01 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the e1EDP01 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getE1EDP01().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link E1EDP01Type }
     * 
     * 
     */
    public List<E1EDP01Type> getE1EDP01() {
        if (e1EDP01 == null) {
            e1EDP01 = new ArrayList<E1EDP01Type>();
        }
        return this.e1EDP01;
    }

    /**
     * Ruft den Wert der begin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBEGIN() {
        return begin;
    }

    /**
     * Legt den Wert der begin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBEGIN(String value) {
        this.begin = value;
    }

}
