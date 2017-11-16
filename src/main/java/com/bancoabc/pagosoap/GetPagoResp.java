
package com.bancoabc.pagosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuoteResp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getQuoteResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="price" type="{http://aira.sample.com/quote/}Quote" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuoteResp", propOrder = {
    "price"
})
public class GetPagoResp {

    protected Pago price;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Pago }
     *     
     */
    public Pago getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pago }
     *     
     */
    public void setPrice(Pago value) {
        this.price = value;
    }

}
