
package com.bancoabc.pagosoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Quote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "idPago",
    "valor"
})
public class Pago {

    @XmlElement(required = true)
    protected String idPago;
    @XmlElement(required = true)
    protected Double valor;

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String value) {
        this.idPago = value;
    }

    public Double getValor() {
        return valor;
    }

    public void setPago(Double value) {
        this.valor = value;
    }

}
