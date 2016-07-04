
package servicios;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para mascota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mascota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caracter" type="{http://servicios/}caracter" minOccurs="0"/>
 *         &lt;element name="defuncion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habitad" type="{http://servicios/}habitad" minOccurs="0"/>
 *         &lt;element name="idMascota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="madre" type="{http://servicios/}mascota" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroChip" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="padre" type="{http://servicios/}mascota" minOccurs="0"/>
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="propietario" type="{http://servicios/}propietario" minOccurs="0"/>
 *         &lt;element name="raza" type="{http://servicios/}raza" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mascota", propOrder = {
    "caracter",
    "defuncion",
    "fechaNacimiento",
    "foto",
    "grupoSanguineo",
    "habitad",
    "idMascota",
    "madre",
    "nombre",
    "numeroChip",
    "padre",
    "peso",
    "propietario",
    "raza",
    "sexo"
})
public class Mascota {

    protected Caracter caracter;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defuncion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String foto;
    protected String grupoSanguineo;
    protected Habitad habitad;
    protected Integer idMascota;
    protected Mascota madre;
    protected String nombre;
    protected Integer numeroChip;
    protected Mascota padre;
    protected BigInteger peso;
    protected Propietario propietario;
    protected Raza raza;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer sexo;

    /**
     * Obtiene el valor de la propiedad caracter.
     * 
     * @return
     *     possible object is
     *     {@link Caracter }
     *     
     */
    public Caracter getCaracter() {
        return caracter;
    }

    /**
     * Define el valor de la propiedad caracter.
     * 
     * @param value
     *     allowed object is
     *     {@link Caracter }
     *     
     */
    public void setCaracter(Caracter value) {
        this.caracter = value;
    }

    /**
     * Obtiene el valor de la propiedad defuncion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefuncion() {
        return defuncion;
    }

    /**
     * Define el valor de la propiedad defuncion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefuncion(XMLGregorianCalendar value) {
        this.defuncion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoSanguineo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    /**
     * Define el valor de la propiedad grupoSanguineo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoSanguineo(String value) {
        this.grupoSanguineo = value;
    }

    /**
     * Obtiene el valor de la propiedad habitad.
     * 
     * @return
     *     possible object is
     *     {@link Habitad }
     *     
     */
    public Habitad getHabitad() {
        return habitad;
    }

    /**
     * Define el valor de la propiedad habitad.
     * 
     * @param value
     *     allowed object is
     *     {@link Habitad }
     *     
     */
    public void setHabitad(Habitad value) {
        this.habitad = value;
    }

    /**
     * Obtiene el valor de la propiedad idMascota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMascota() {
        return idMascota;
    }

    /**
     * Define el valor de la propiedad idMascota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMascota(Integer value) {
        this.idMascota = value;
    }

    /**
     * Obtiene el valor de la propiedad madre.
     * 
     * @return
     *     possible object is
     *     {@link Mascota }
     *     
     */
    public Mascota getMadre() {
        return madre;
    }

    /**
     * Define el valor de la propiedad madre.
     * 
     * @param value
     *     allowed object is
     *     {@link Mascota }
     *     
     */
    public void setMadre(Mascota value) {
        this.madre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroChip.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroChip() {
        return numeroChip;
    }

    /**
     * Define el valor de la propiedad numeroChip.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroChip(Integer value) {
        this.numeroChip = value;
    }

    /**
     * Obtiene el valor de la propiedad padre.
     * 
     * @return
     *     possible object is
     *     {@link Mascota }
     *     
     */
    public Mascota getPadre() {
        return padre;
    }

    /**
     * Define el valor de la propiedad padre.
     * 
     * @param value
     *     allowed object is
     *     {@link Mascota }
     *     
     */
    public void setPadre(Mascota value) {
        this.padre = value;
    }

    /**
     * Obtiene el valor de la propiedad peso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPeso() {
        return peso;
    }

    /**
     * Define el valor de la propiedad peso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPeso(BigInteger value) {
        this.peso = value;
    }

    /**
     * Obtiene el valor de la propiedad propietario.
     * 
     * @return
     *     possible object is
     *     {@link Propietario }
     *     
     */
    public Propietario getPropietario() {
        return propietario;
    }

    /**
     * Define el valor de la propiedad propietario.
     * 
     * @param value
     *     allowed object is
     *     {@link Propietario }
     *     
     */
    public void setPropietario(Propietario value) {
        this.propietario = value;
    }

    /**
     * Obtiene el valor de la propiedad raza.
     * 
     * @return
     *     possible object is
     *     {@link Raza }
     *     
     */
    public Raza getRaza() {
        return raza;
    }

    /**
     * Define el valor de la propiedad raza.
     * 
     * @param value
     *     allowed object is
     *     {@link Raza }
     *     
     */
    public void setRaza(Raza value) {
        this.raza = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSexo(Integer value) {
        this.sexo = value;
    }

}
