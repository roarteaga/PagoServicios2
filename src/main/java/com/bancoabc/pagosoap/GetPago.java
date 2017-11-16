
package com.bancoabc.pagosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getQuote" type="{http://aira.sample.com/quote/}getQuoteRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPago"
})
@XmlRootElement(name = "getQuote")
public class GetPago {

    @XmlElement(required = true)
    protected GetPagoRequest getPago;

    /**
     * Gets the value of the getQuote property.
     * 
     * @return
     *     possible object is
     *     {@link GetPagoRequest }
     *     
     */
    public GetPagoRequest getGetQuote() {
        return getPago;
    }

    /**
     * Sets the value of the getQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPagoRequest }
     *     
     */
    public void setGetQuote(GetPagoRequest value) {
        this.getPago = value;
    }

}
