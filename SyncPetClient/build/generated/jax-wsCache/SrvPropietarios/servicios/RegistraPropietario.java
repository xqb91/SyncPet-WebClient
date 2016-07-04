
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registraPropietario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registraPropietario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registraPropietario", propOrder = {
    "rut",
    "nombres",
    "apaterno",
    "amaterno",
    "correo",
    "telefono",
    "celular",
    "direccion",
    "comuna",
    "arg9"
})
public class RegistraPropietario {

    protected String rut;
    protected String nombres;
    protected String apaterno;
    protected String amaterno;
    protected String correo;
    protected int telefono;
    protected int celular;
    protected String direccion;
    protected int comuna;
    protected int arg9;

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
     * Obtiene el valor de la propiedad correo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Define el valor de la propiedad correo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     */
    public void setTelefono(int value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad celular.
     * 
     */
    public int getCelular() {
        return celular;
    }

    /**
     * Define el valor de la propiedad celular.
     * 
     */
    public void setCelular(int value) {
        this.celular = value;
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
     * Obtiene el valor de la propiedad comuna.
     * 
     */
    public int getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     */
    public void setComuna(int value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad arg9.
     * 
     */
    public int getArg9() {
        return arg9;
    }

    /**
     * Define el valor de la propiedad arg9.
     * 
     */
    public void setArg9(int value) {
        this.arg9 = value;
    }

}
