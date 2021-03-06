
package servicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SrvAgendamiento", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/SyncPetServices/SrvAgendamiento?wsdl")
public class SrvAgendamiento_Service
    extends Service
{

    private final static URL SRVAGENDAMIENTO_WSDL_LOCATION;
    private final static WebServiceException SRVAGENDAMIENTO_EXCEPTION;
    private final static QName SRVAGENDAMIENTO_QNAME = new QName("http://servicios/", "SrvAgendamiento");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SyncPetServices/SrvAgendamiento?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SRVAGENDAMIENTO_WSDL_LOCATION = url;
        SRVAGENDAMIENTO_EXCEPTION = e;
    }

    public SrvAgendamiento_Service() {
        super(__getWsdlLocation(), SRVAGENDAMIENTO_QNAME);
    }

    public SrvAgendamiento_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SRVAGENDAMIENTO_QNAME, features);
    }

    public SrvAgendamiento_Service(URL wsdlLocation) {
        super(wsdlLocation, SRVAGENDAMIENTO_QNAME);
    }

    public SrvAgendamiento_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SRVAGENDAMIENTO_QNAME, features);
    }

    public SrvAgendamiento_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SrvAgendamiento_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SrvAgendamiento
     */
    @WebEndpoint(name = "SrvAgendamientoPort")
    public SrvAgendamiento getSrvAgendamientoPort() {
        return super.getPort(new QName("http://servicios/", "SrvAgendamientoPort"), SrvAgendamiento.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SrvAgendamiento
     */
    @WebEndpoint(name = "SrvAgendamientoPort")
    public SrvAgendamiento getSrvAgendamientoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "SrvAgendamientoPort"), SrvAgendamiento.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SRVAGENDAMIENTO_EXCEPTION!= null) {
            throw SRVAGENDAMIENTO_EXCEPTION;
        }
        return SRVAGENDAMIENTO_WSDL_LOCATION;
    }

}
