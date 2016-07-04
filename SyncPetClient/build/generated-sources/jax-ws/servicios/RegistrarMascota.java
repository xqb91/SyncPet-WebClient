
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para registrarMascota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registrarMascota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecnac" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="nroChip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="propietario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="raza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caracter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="habitad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="grupoSanguineo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarMascota", propOrder = {
    "nombre",
    "fecnac",
    "sexo",
    "nroChip",
    "propietario",
    "raza",
    "caracter",
    "habitad",
    "grupoSanguineo"
})
public class RegistrarMascota {

    protected String nombre;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecnac;
    @XmlSchemaType(name = "unsignedShort")
    protected int sexo;
    protected int nroChip;
    protected int propietario;
    protected int raza;
    protected int caracter;
    protected int habitad;
    protected String grupoSanguineo;

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
     * Obtiene el valor de la propiedad fecnac.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecnac() {
        return fecnac;
    }

    /**
     * Define el valor de la propiedad fecnac.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecnac(XMLGregorianCalendar value) {
        this.fecnac = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     */
    public int getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     */
    public void setSexo(int value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroChip.
     * 
     */
    public int getNroChip() {
        return nroChip;
    }

    /**
     * Define el valor de la propiedad nroChip.
     * 
     */
    public void setNroChip(int value) {
        this.nroChip = value;
    }

    /**
     * Obtiene el valor de la propiedad propietario.
     * 
     */
    public int getPropietario() {
        return propietario;
    }

    /**
     * Define el valor de la propiedad propietario.
     * 
     */
    public void setPropietario(int value) {
        this.propietario = value;
    }

    /**
     * Obtiene el valor de la propiedad raza.
     * 
     */
    public int getRaza() {
        return raza;
    }

    /**
     * Define el valor de la propiedad raza.
     * 
     */
    public void setRaza(int value) {
        this.raza = value;
    }

    /**
     * Obtiene el valor de la propiedad caracter.
     * 
     */
    public int getCaracter() {
        return caracter;
    }

    /**
     * Define el valor de la propiedad caracter.
     * 
     */
    public void setCaracter(int value) {
        this.caracter = value;
    }

    /**
     * Obtiene el valor de la propiedad habitad.
     * 
     */
    public int getHabitad() {
        return habitad;
    }

    /**
     * Define el valor de la propiedad habitad.
     * 
     */
    public void setHabitad(int value) {
        this.habitad = value;
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

}
