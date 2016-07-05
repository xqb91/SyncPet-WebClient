
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para veterinario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="veterinario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="especialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idVeterinario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "veterinario", propOrder = {
    "amaterno",
    "apaterno",
    "dv",
    "especialidad",
    "idVeterinario",
    "nombres",
    "rut"
})
public class Veterinario {

    protected String amaterno;
    protected String apaterno;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dv;
    protected String especialidad;
    protected Integer idVeterinario;
    protected String nombres;
    protected String rut;

    /**
     * Obtiene el valor de la propiedad amaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmaterno() {
        return amaterno;
    }

    /**
     * Define el valor de la propiedad amaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmaterno(String value) {
        this.amaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApaterno() {
        return apaterno;
    }

    /**
     * Define el valor de la propiedad apaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApaterno(String value) {
        this.apaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad dv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDv() {
        return dv;
    }

    /**
     * Define el valor de la propiedad dv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDv(Integer value) {
        this.dv = value;
    }

    /**
     * Obtiene el valor de la propiedad especialidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Define el valor de la propiedad especialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidad(String value) {
        this.especialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad idVeterinario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVeterinario() {
        return idVeterinario;
    }

    /**
     * Define el valor de la propiedad idVeterinario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVeterinario(Integer value) {
        this.idVeterinario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad rut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRut(String value) {
        this.rut = value;
    }

}
