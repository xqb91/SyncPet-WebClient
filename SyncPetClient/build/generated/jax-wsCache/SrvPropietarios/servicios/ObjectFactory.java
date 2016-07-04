
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
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

    private final static QName _RetornaInformacionPropietarioResponse_QNAME = new QName("http://servicios/", "retornaInformacionPropietarioResponse");
    private final static QName _RetornaInformacionPropietario_QNAME = new QName("http://servicios/", "retornaInformacionPropietario");
    private final static QName _Provincia_QNAME = new QName("http://servicios/", "provincia");
    private final static QName _Pais_QNAME = new QName("http://servicios/", "pais");
    private final static QName _RegistraPropietario_QNAME = new QName("http://servicios/", "registraPropietario");
    private final static QName _RegistraPropietarioResponse_QNAME = new QName("http://servicios/", "registraPropietarioResponse");
    private final static QName _Propietario_QNAME = new QName("http://servicios/", "propietario");
    private final static QName _Comuna_QNAME = new QName("http://servicios/", "comuna");
    private final static QName _Hello_QNAME = new QName("http://servicios/", "hello");
    private final static QName _Region_QNAME = new QName("http://servicios/", "region");
    private final static QName _Clinica_QNAME = new QName("http://servicios/", "clinica");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios/", "helloResponse");
    private final static QName _Sucursal_QNAME = new QName("http://servicios/", "sucursal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistraPropietario }
     * 
     */
    public RegistraPropietario createRegistraPropietario() {
        return new RegistraPropietario();
    }

    /**
     * Create an instance of {@link RegistraPropietarioResponse }
     * 
     */
    public RegistraPropietarioResponse createRegistraPropietarioResponse() {
        return new RegistraPropietarioResponse();
    }

    /**
     * Create an instance of {@link Propietario }
     * 
     */
    public Propietario createPropietario() {
        return new Propietario();
    }

    /**
     * Create an instance of {@link RetornaInformacionPropietarioResponse }
     * 
     */
    public RetornaInformacionPropietarioResponse createRetornaInformacionPropietarioResponse() {
        return new RetornaInformacionPropietarioResponse();
    }

    /**
     * Create an instance of {@link RetornaInformacionPropietario }
     * 
     */
    public RetornaInformacionPropietario createRetornaInformacionPropietario() {
        return new RetornaInformacionPropietario();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornaInformacionPropietarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "retornaInformacionPropietarioResponse")
    public JAXBElement<RetornaInformacionPropietarioResponse> createRetornaInformacionPropietarioResponse(RetornaInformacionPropietarioResponse value) {
        return new JAXBElement<RetornaInformacionPropietarioResponse>(_RetornaInformacionPropietarioResponse_QNAME, RetornaInformacionPropietarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornaInformacionPropietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "retornaInformacionPropietario")
    public JAXBElement<RetornaInformacionPropietario> createRetornaInformacionPropietario(RetornaInformacionPropietario value) {
        return new JAXBElement<RetornaInformacionPropietario>(_RetornaInformacionPropietario_QNAME, RetornaInformacionPropietario.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPropietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "registraPropietario")
    public JAXBElement<RegistraPropietario> createRegistraPropietario(RegistraPropietario value) {
        return new JAXBElement<RegistraPropietario>(_RegistraPropietario_QNAME, RegistraPropietario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistraPropietarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "registraPropietarioResponse")
    public JAXBElement<RegistraPropietarioResponse> createRegistraPropietarioResponse(RegistraPropietarioResponse value) {
        return new JAXBElement<RegistraPropietarioResponse>(_RegistraPropietarioResponse_QNAME, RegistraPropietarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Propietario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "propietario")
    public JAXBElement<Propietario> createPropietario(Propietario value) {
        return new JAXBElement<Propietario>(_Propietario_QNAME, Propietario.class, null, value);
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
