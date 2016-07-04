
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
@WebServiceClient(name = "SrvPropietarios", targetNamespace = "http://servicios/", wsdlLocation = "http://localhost:8080/SyncPetWebSource/SrvPropietarios?wsdl")
public class SrvPropietarios_Service
    extends Service
{

    private final static URL SRVPROPIETARIOS_WSDL_LOCATION;
    private final static WebServiceException SRVPROPIETARIOS_EXCEPTION;
    private final static QName SRVPROPIETARIOS_QNAME = new QName("http://servicios/", "SrvPropietarios");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SyncPetWebSource/SrvPropietarios?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SRVPROPIETARIOS_WSDL_LOCATION = url;
        SRVPROPIETARIOS_EXCEPTION = e;
    }

    public SrvPropietarios_Service() {
        super(__getWsdlLocation(), SRVPROPIETARIOS_QNAME);
    }

    public SrvPropietarios_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SRVPROPIETARIOS_QNAME, features);
    }

    public SrvPropietarios_Service(URL wsdlLocation) {
        super(wsdlLocation, SRVPROPIETARIOS_QNAME);
    }

    public SrvPropietarios_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SRVPROPIETARIOS_QNAME, features);
    }

    public SrvPropietarios_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SrvPropietarios_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SrvPropietarios
     */
    @WebEndpoint(name = "SrvPropietariosPort")
    public SrvPropietarios getSrvPropietariosPort() {
        return super.getPort(new QName("http://servicios/", "SrvPropietariosPort"), SrvPropietarios.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SrvPropietarios
     */
    @WebEndpoint(name = "SrvPropietariosPort")
    public SrvPropietarios getSrvPropietariosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicios/", "SrvPropietariosPort"), SrvPropietarios.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SRVPROPIETARIOS_EXCEPTION!= null) {
            throw SRVPROPIETARIOS_EXCEPTION;
        }
        return SRVPROPIETARIOS_WSDL_LOCATION;
    }

}
