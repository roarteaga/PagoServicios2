
package com.bancoabc.pagorest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQuoteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getQuoteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQuoteRequest", propOrder = {
    "IdFactura",
    "Pago"
})
public class GetPagoRequest {

    @XmlElement(required = true)
    protected String IdFactura;
    @XmlElement(required = true)
    protected Double ValorPago;
    
    public String getFactura() {
        return IdFactura;
    }

    public void setFactura(String value) {
        this.IdFactura = value;
    }

    public Double getValorPago() {
        return ValorPago;
    }

    public void setValorPago(Double value) {
        this.ValorPago = value;
    }
}
