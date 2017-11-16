
package com.bancoabc.pagorest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pago", propOrder = {
    "idFactura",
    "precio"
})
public class Pago {

    protected String idFactura;
    protected Double precio;

    /**
     * Gets the value of the airLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactura() {
        return idFactura;
    }

    /**
     * Sets the value of the airLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactura(String value) {
        this.idFactura = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPrice() {
        return precio;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(Double value) {
        this.precio = value;
    }

}
