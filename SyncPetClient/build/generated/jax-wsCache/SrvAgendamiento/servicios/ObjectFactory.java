
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

    private final static QName _Perfiles_QNAME = new QName("http://servicios/", "perfiles");
    private final static QName _AgendarHorarioResponse_QNAME = new QName("http://servicios/", "agendarHorarioResponse");
    private final static QName _Provincia_QNAME = new QName("http://servicios/", "provincia");
    private final static QName _Usuarios_QNAME = new QName("http://servicios/", "usuarios");
    private final static QName _Agenda_QNAME = new QName("http://servicios/", "agenda");
    private final static QName _ListaVeterinariosResponse_QNAME = new QName("http://servicios/", "listaVeterinariosResponse");
    private final static QName _HorasOcupadas_QNAME = new QName("http://servicios/", "horasOcupadas");
    private final static QName _Pais_QNAME = new QName("http://servicios/", "pais");
    private final static QName _Veterinario_QNAME = new QName("http://servicios/", "veterinario");
    private final static QName _AgendarHorario_QNAME = new QName("http://servicios/", "agendarHorario");
    private final static QName _DetalleUsuarios_QNAME = new QName("http://servicios/", "detalleUsuarios");
    private final static QName _Comuna_QNAME = new QName("http://servicios/", "comuna");
    private final static QName _HorasOcupadasResponse_QNAME = new QName("http://servicios/", "horasOcupadasResponse");
    private final static QName _Hello_QNAME = new QName("http://servicios/", "hello");
    private final static QName _Region_QNAME = new QName("http://servicios/", "region");
    private final static QName _ListaVeterinarios_QNAME = new QName("http://servicios/", "listaVeterinarios");
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
     * Create an instance of {@link Veterinario }
     * 
     */
    public Veterinario createVeterinario() {
        return new Veterinario();
    }

    /**
     * Create an instance of {@link AgendarHorario }
     * 
     */
    public AgendarHorario createAgendarHorario() {
        return new AgendarHorario();
    }

    /**
     * Create an instance of {@link DetalleUsuarios }
     * 
     */
    public DetalleUsuarios createDetalleUsuarios() {
        return new DetalleUsuarios();
    }

    /**
     * Create an instance of {@link Perfiles }
     * 
     */
    public Perfiles createPerfiles() {
        return new Perfiles();
    }

    /**
     * Create an instance of {@link AgendarHorarioResponse }
     * 
     */
    public AgendarHorarioResponse createAgendarHorarioResponse() {
        return new AgendarHorarioResponse();
    }

    /**
     * Create an instance of {@link Provincia }
     * 
     */
    public Provincia createProvincia() {
        return new Provincia();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link Agenda }
     * 
     */
    public Agenda createAgenda() {
        return new Agenda();
    }

    /**
     * Create an instance of {@link ListaVeterinariosResponse }
     * 
     */
    public ListaVeterinariosResponse createListaVeterinariosResponse() {
        return new ListaVeterinariosResponse();
    }

    /**
     * Create an instance of {@link HorasOcupadas }
     * 
     */
    public HorasOcupadas createHorasOcupadas() {
        return new HorasOcupadas();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

    /**
     * Create an instance of {@link ListaVeterinarios }
     * 
     */
    public ListaVeterinarios createListaVeterinarios() {
        return new ListaVeterinarios();
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
     * Create an instance of {@link HorasOcupadasResponse }
     * 
     */
    public HorasOcupadasResponse createHorasOcupadasResponse() {
        return new HorasOcupadasResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Perfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "perfiles")
    public JAXBElement<Perfiles> createPerfiles(Perfiles value) {
        return new JAXBElement<Perfiles>(_Perfiles_QNAME, Perfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendarHorarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "agendarHorarioResponse")
    public JAXBElement<AgendarHorarioResponse> createAgendarHorarioResponse(AgendarHorarioResponse value) {
        return new JAXBElement<AgendarHorarioResponse>(_AgendarHorarioResponse_QNAME, AgendarHorarioResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Usuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "usuarios")
    public JAXBElement<Usuarios> createUsuarios(Usuarios value) {
        return new JAXBElement<Usuarios>(_Usuarios_QNAME, Usuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agenda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "agenda")
    public JAXBElement<Agenda> createAgenda(Agenda value) {
        return new JAXBElement<Agenda>(_Agenda_QNAME, Agenda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaVeterinariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaVeterinariosResponse")
    public JAXBElement<ListaVeterinariosResponse> createListaVeterinariosResponse(ListaVeterinariosResponse value) {
        return new JAXBElement<ListaVeterinariosResponse>(_ListaVeterinariosResponse_QNAME, ListaVeterinariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HorasOcupadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "horasOcupadas")
    public JAXBElement<HorasOcupadas> createHorasOcupadas(HorasOcupadas value) {
        return new JAXBElement<HorasOcupadas>(_HorasOcupadas_QNAME, HorasOcupadas.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Veterinario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "veterinario")
    public JAXBElement<Veterinario> createVeterinario(Veterinario value) {
        return new JAXBElement<Veterinario>(_Veterinario_QNAME, Veterinario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgendarHorario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "agendarHorario")
    public JAXBElement<AgendarHorario> createAgendarHorario(AgendarHorario value) {
        return new JAXBElement<AgendarHorario>(_AgendarHorario_QNAME, AgendarHorario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "detalleUsuarios")
    public JAXBElement<DetalleUsuarios> createDetalleUsuarios(DetalleUsuarios value) {
        return new JAXBElement<DetalleUsuarios>(_DetalleUsuarios_QNAME, DetalleUsuarios.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link HorasOcupadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "horasOcupadasResponse")
    public JAXBElement<HorasOcupadasResponse> createHorasOcupadasResponse(HorasOcupadasResponse value) {
        return new JAXBElement<HorasOcupadasResponse>(_HorasOcupadasResponse_QNAME, HorasOcupadasResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaVeterinarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicios/", name = "listaVeterinarios")
    public JAXBElement<ListaVeterinarios> createListaVeterinarios(ListaVeterinarios value) {
        return new JAXBElement<ListaVeterinarios>(_ListaVeterinarios_QNAME, ListaVeterinarios.class, null, value);
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
