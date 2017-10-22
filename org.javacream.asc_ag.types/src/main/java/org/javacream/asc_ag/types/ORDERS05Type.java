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
 * <p>Java-Klasse für ORDERS05Type complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ORDERS05Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDOC" type="{http://org.javacream.asc}IDOCType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ORDERS05Type", propOrder = {
    "idoc"
})
public class ORDERS05Type {

    @XmlElement(name = "IDOC", required = true)
    protected IDOCType idoc;

    /**
     * Ruft den Wert der idoc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IDOCType }
     *     
     */
    public IDOCType getIDOC() {
        return idoc;
    }

    /**
     * Legt den Wert der idoc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOCType }
     *     
     */
    public void setIDOC(IDOCType value) {
        this.idoc = value;
    }

}
