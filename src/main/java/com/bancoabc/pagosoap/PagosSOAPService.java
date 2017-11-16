package com.bancoabc.pagosoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "PagosSOAPQuoteService", 
                  wsdlLocation = "http://40.117.190.232:7070/w1-soap-svr/PagosServiceService?wsdl",
                  targetNamespace = "http://pagos.servicios.com/quote/") 
public class PagosSOAPService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://pagos.servicios.com/quote/", "PagosSOAPQuoteService");
    public final static QName PagosSOAP = new QName("http://pagos.servicios.com/quote/", "PagosSOAPQuoteSOAP");
    static {
        URL url = null;
        try {
            url = new URL("http://40.117.190.232:7070/w1-soap-svr/PagosServiceService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PagosSOAPService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://40.117.190.232:7070/w1-soap-svr/PagosServiceService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PagosSOAPService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PagosSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PagosSOAPService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @WebEndpoint(name = "PagosSOAP")
    public ServiciosSoapPago getPagosSOAP() {
        return super.getPort(PagosSOAP, ServiciosSoapPago.class);
    }

    @WebEndpoint(name = "PagosSOAP")
    public ServiciosSoapPago getPagosSOAP(WebServiceFeature... features) {
        return super.getPort(PagosSOAP, ServiciosSoapPago.class, features);
    }

}
