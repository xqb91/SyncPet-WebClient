
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para propietario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="propietario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comuna" type="{http://servicios/}comuna" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idPropietario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sucursal" type="{http://servicios/}sucursal" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propietario", propOrder = {
    "amaterno",
    "apaterno",
    "celular",
    "comuna",
    "direccion",
    "dv",
    "email",
    "idPropietario",
    "nombres",
    "rut",
    "sucursal",
    "telefono"
})
public class Propietario {

    protected String amaterno;
    protected String apaterno;
    protected Integer celular;
    protected Comuna comuna;
    protected String direccion;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dv;
    protected String email;
    protected Integer idPropietario;
    protected String nombres;
    protected int rut;
    protected Sucursal sucursal;
    protected Integer telefono;

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
     * Obtiene el valor de la propiedad celular.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCelular(Integer value) {
        this.celular = value;
    }

    /**
     * Obtiene el valor de la propiedad comuna.
     * 
     * @return
     *     possible object is
     *     {@link Comuna }
     *     
     */
    public Comuna getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     * @param value
     *     allowed object is
     *     {@link Comuna }
     *     
     */
    public void setComuna(Comuna value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
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
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad idPropietario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPropietario() {
        return idPropietario;
    }

    /**
     * Define el valor de la propiedad idPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPropietario(Integer value) {
        this.idPropietario = value;
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
     */
    public int getRut() {
        return rut;
    }

    /**
     * Define el valor de la propiedad rut.
     * 
     */
    public void setRut(int value) {
        this.rut = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setSucursal(Sucursal value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTelefono(Integer value) {
        this.telefono = value;
    }

}
