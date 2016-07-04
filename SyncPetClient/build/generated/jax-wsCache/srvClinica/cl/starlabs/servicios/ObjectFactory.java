
package cl.starlabs.servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.starlabs.servicios package. 
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

    private final static QName _ListadoSucursalByClinica_QNAME = new QName("http://servicios/", "listadoSucursalByClinica");
    private final static QName _ListadoClinicas_QNAME = new QName("http://servicios/", "listadoClinicas");
    private final static QName _Provincia_QNAME = new QName("http://servicios/", "provincia");
    private final static QName _Pais_QNAME = new QName("http://servicios/", "pais");
    private final static QName _GetSucursal_QNAME = new QName("http://servicios/", "getSucursal");
    private final static QName _Comuna_QNAME = new QName("http://servicios/", "comuna");
    private final static QName _ListadoSucursalesResponse_QNAME = new QName("http://servicios/", "listadoSucursalesResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios/", "hello");
    private final static QName _Region_QNAME = new QName("http://servicios/", "region");
    private final static QName _GetSucursalResponse_QNAME = new QName("http://servicios/", "getSucursalResponse");
    private final static QName _ListadoClinicasResponse_QNAME = new QName("http://servicios/", "listadoClinicasResponse");
    private final static QName _ListadoSucursalByClinicaResponse_QNAME = new QName("http://servicios/", "listadoSucursalByClinicaResponse");
    private final static QName _ListadoSucursales_QNAME = new QName("http://servicios/", "listadoSucursales");
    private final static QName _Clinica_QNAME = new QName("http://servicios/", "clinica");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios/", "helloResponse");
    private final static QName _Sucursal_QNAME = new QName("http://servicios/", "sucursal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.starlabs.servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSucursal }
     * 
     */
    public GetSucursal createGetSucursal() {
        return new GetSucursal();
    }

    /**
     * Create an instance of {@link ListadoSucursalByClinica }
     * 
     */
    public ListadoSucursalByClinica createListadoSucursalByClinica() {
        return new ListadoSucursalByClinica();
    }

    /**
     * Create an instance of {@link ListadoClinicas }
     * 
     */
    public ListadoClinicas createListadoClinicas() {
        return new ListadoClinicas();
    }

    /**
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link ListadoSucursales }
     * 
     */
    public ListadoSucursales createListadoSucursales() {
        return new ListadoSucursales();
    }

    /**
     * Create an instance of {@link Clinica }
     * 
     */
    public Clinica createClinica() {
        return new Clinica();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Sucursal }
     * 
     */
    public Sucursal createSucursal() {
        return new Sucursal();
    }

    /**
     * Create an instance of {@link Comuna }
     * 
     */
    public Comuna createComuna() {
        return new Comuna();
    }

    /**
     * Create an instance of {@link ListadoSucursalesResponse }
     * 
     */
    public ListadoSucursalesResponse createListadoSucursalesResponse() {
        return new ListadoSucursalesResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link GetSucursalResponse }
     * 
     */
    public GetSucursalResponse createGetSucursalResponse() {
        return new GetSucursalResponse();
    }

    /**
     * Create an instance of {@link ListadoClinicasResponse }
     * 
     */
    public ListadoClinicasResponse createListadoClinicasResponse() {
        return new ListadoClinicasResponse();
    }

    /**
     * Create an instance of {@link ListadoSucursalByClinicaResponse }
     * 
     */
    public ListadoSucursalByClinicaResponse createListadoSucursalByClinicaResponse() {
        return new ListadoSucursalByClinicaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoSucursalByClinica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoSucursalByClinica")
    public JAXBElement<ListadoSucursalByClinica> createListadoSucursalByClinica(ListadoSucursalByClinica value) {
        return new JAXBElement<ListadoSucursalByClinica>(_ListadoSucursalByClinica_QNAME, ListadoSucursalByClinica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoClinicas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoClinicas")
    public JAXBElement<ListadoClinicas> createListadoClinicas(ListadoClinicas value) {
        return new JAXBElement<ListadoClinicas>(_ListadoClinicas_QNAME, ListadoClinicas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Provincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "provincia")
    public JAXBElement<Provincia> createProvincia(Provincia value) {
        return new JAXBElement<Provincia>(_Provincia_QNAME, Provincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "pais")
    public JAXBElement<Pais> createPais(Pais value) {
        return new JAXBElement<Pais>(_Pais_QNAME, Pais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSucursal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getSucursal")
    public JAXBElement<GetSucursal> createGetSucursal(GetSucursal value) {
        return new JAXBElement<GetSucursal>(_GetSucursal_QNAME, GetSucursal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comuna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "comuna")
    public JAXBElement<Comuna> createComuna(Comuna value) {
        return new JAXBElement<Comuna>(_Comuna_QNAME, Comuna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoSucursalesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoSucursalesResponse")
    public JAXBElement<ListadoSucursalesResponse> createListadoSucursalesResponse(ListadoSucursalesResponse value) {
        return new JAXBElement<ListadoSucursalesResponse>(_ListadoSucursalesResponse_QNAME, ListadoSucursalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Region }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "region")
    public JAXBElement<Region> createRegion(Region value) {
        return new JAXBElement<Region>(_Region_QNAME, Region.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSucursalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "getSucursalResponse")
    public JAXBElement<GetSucursalResponse> createGetSucursalResponse(GetSucursalResponse value) {
        return new JAXBElement<GetSucursalResponse>(_GetSucursalResponse_QNAME, GetSucursalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoClinicasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoClinicasResponse")
    public JAXBElement<ListadoClinicasResponse> createListadoClinicasResponse(ListadoClinicasResponse value) {
        return new JAXBElement<ListadoClinicasResponse>(_ListadoClinicasResponse_QNAME, ListadoClinicasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoSucursalByClinicaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoSucursalByClinicaResponse")
    public JAXBElement<ListadoSucursalByClinicaResponse> createListadoSucursalByClinicaResponse(ListadoSucursalByClinicaResponse value) {
        return new JAXBElement<ListadoSucursalByClinicaResponse>(_ListadoSucursalByClinicaResponse_QNAME, ListadoSucursalByClinicaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListadoSucursales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listadoSucursales")
    public JAXBElement<ListadoSucursales> createListadoSucursales(ListadoSucursales value) {
        return new JAXBElement<ListadoSucursales>(_ListadoSucursales_QNAME, ListadoSucursales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Clinica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "clinica")
    public JAXBElement<Clinica> createClinica(Clinica value) {
        return new JAXBElement<Clinica>(_Clinica_QNAME, Clinica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sucursal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "sucursal")
    public JAXBElement<Sucursal> createSucursal(Sucursal value) {
        return new JAXBElement<Sucursal>(_Sucursal_QNAME, Sucursal.class, null, value);
    }

}
