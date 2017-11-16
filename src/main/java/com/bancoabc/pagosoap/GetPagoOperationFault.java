
package com.bancoabc.pagosoap;

import javax.xml.ws.WebFault;


@WebFault(name = "getQuoteFault", targetNamespace = "http://pagos.servicios.com/quote/")
public class GetPagoOperationFault extends Exception {
    
    private com.bancoabc.pagosoap.GetPagoFault getQuoteFault;

    public GetPagoOperationFault() {
        super();
    }
    
    public GetPagoOperationFault(String message) {
        super(message);
    }
    
    public GetPagoOperationFault(String message, Throwable cause) {
        super(message, cause);
    }

    public GetPagoOperationFault(String message, com.bancoabc.pagosoap.GetPagoFault getQuoteFault) {
        super(message);
        this.getQuoteFault = getQuoteFault;
    }

    public GetPagoOperationFault(String message, com.bancoabc.pagosoap.GetPagoFault getQuoteFault, Throwable cause) {
        super(message, cause);
        this.getQuoteFault = getQuoteFault;
    }

    public com.bancoabc.pagosoap.GetPagoFault getFaultInfo() {
        return this.getQuoteFault;
    }
}
