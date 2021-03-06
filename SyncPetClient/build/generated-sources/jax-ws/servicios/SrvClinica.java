
package servicios;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "srvClinica", targetNamespace = "http://servicios/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SrvClinica {


    /**
     * 
     * @param idClinica
     * @return
     *     returns java.util.List<servicios.Sucursal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listadoSucursalByClinica", targetNamespace = "http://servicios/", className = "servicios.ListadoSucursalByClinica")
    @ResponseWrapper(localName = "listadoSucursalByClinicaResponse", targetNamespace = "http://servicios/", className = "servicios.ListadoSucursalByClinicaResponse")
    @Action(input = "http://servicios/srvClinica/listadoSucursalByClinicaRequest", output = "http://servicios/srvClinica/listadoSucursalByClinicaResponse")
    public List<Sucursal> listadoSucursalByClinica(
        @WebParam(name = "idClinica", targetNamespace = "")
        Integer idClinica);

    /**
     * 
     * @return
     *     returns java.util.List<servicios.Sucursal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listadoSucursales", targetNamespace = "http://servicios/", className = "servicios.ListadoSucursales")
    @ResponseWrapper(localName = "listadoSucursalesResponse", targetNamespace = "http://servicios/", className = "servicios.ListadoSucursalesResponse")
    @Action(input = "http://servicios/srvClinica/listadoSucursalesRequest", output = "http://servicios/srvClinica/listadoSucursalesResponse")
    public List<Sucursal> listadoSucursales();

    /**
     * 
     * @return
     *     returns java.util.List<servicios.Clinica>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listadoClinicas", targetNamespace = "http://servicios/", className = "servicios.ListadoClinicas")
    @ResponseWrapper(localName = "listadoClinicasResponse", targetNamespace = "http://servicios/", className = "servicios.ListadoClinicasResponse")
    @Action(input = "http://servicios/srvClinica/listadoClinicasRequest", output = "http://servicios/srvClinica/listadoClinicasResponse")
    public List<Clinica> listadoClinicas();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://servicios/", className = "servicios.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://servicios/", className = "servicios.HelloResponse")
    @Action(input = "http://servicios/srvClinica/helloRequest", output = "http://servicios/srvClinica/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param idClinica
     * @return
     *     returns servicios.Sucursal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSucursal", targetNamespace = "http://servicios/", className = "servicios.GetSucursal")
    @ResponseWrapper(localName = "getSucursalResponse", targetNamespace = "http://servicios/", className = "servicios.GetSucursalResponse")
    @Action(input = "http://servicios/srvClinica/getSucursalRequest", output = "http://servicios/srvClinica/getSucursalResponse")
    public Sucursal getSucursal(
        @WebParam(name = "idClinica", targetNamespace = "")
        Integer idClinica);

}
