
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

    private final static QName _Comuna_QNAME = new QName("http://servicios/", "comuna");
    private final static QName _Hello_QNAME = new QName("http://servicios/", "hello");
    private final static QName _Provincia_QNAME = new QName("http://servicios/", "provincia");
    private final static QName _Region_QNAME = new QName("http://servicios/", "region");
    private final static QName _Pais_QNAME = new QName("http://servicios/", "pais");
    private final static QName _ListaCiudades_QNAME = new QName("http://servicios/", "listaCiudades");
    private final static QName _ListaCiudadesResponse_QNAME = new QName("http://servicios/", "listaCiudadesResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://servicios/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaCiudades }
     * 
     */
    public ListaCiudades createListaCiudades() {
        return new ListaCiudades();
    }

    /**
     * Create an instance of {@link ListaCiudadesResponse }
     * 
     */
    public ListaCiudadesResponse createListaCiudadesResponse() {
        return new ListaCiudadesResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
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
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Provincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "provincia")
    public JAXBElement<Provincia> createProvincia(Provincia value) {
        return new JAXBElement<Provincia>(_Provincia_QNAME, Provincia.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Pais }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "pais")
    public JAXBElement<Pais> createPais(Pais value) {
        return new JAXBElement<Pais>(_Pais_QNAME, Pais.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCiudades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaCiudades")
    public JAXBElement<ListaCiudades> createListaCiudades(ListaCiudades value) {
        return new JAXBElement<ListaCiudades>(_ListaCiudades_QNAME, ListaCiudades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaCiudadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaCiudadesResponse")
    public JAXBElement<ListaCiudadesResponse> createListaCiudadesResponse(ListaCiudadesResponse value) {
        return new JAXBElement<ListaCiudadesResponse>(_ListaCiudadesResponse_QNAME, ListaCiudadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
