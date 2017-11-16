
package com.bancoabc.pagorest;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sample.air.quote package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sample.air.quote
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPagoFault }
     * 
     */
    public GetPagoFault createGetQuoteFault() {
        return new GetPagoFault();
    }

    /**
     * Create an instance of {@link GetPago }
     * 
     */
    public GetPago createGetQuote() {
        return new GetPago();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createQuote() {
        return new Pago();
    }

    /**
     * Create an instance of {@link GetPagoRequest }
     * 
     */
    public GetPagoRequest createGetQuoteRequest() {
        return new GetPagoRequest();
    }

    /**
     * Create an instance of {@link GetPagoResp }
     * 
     */
    public GetPagoResp createGetQuoteResp() {
        return new GetPagoResp();
    }

    /**
     * Create an instance of {@link GetPagoResponse }
     * 
     */
    public GetPagoResponse createGetQuoteResponse() {
        return new GetPagoResponse();
    }

}