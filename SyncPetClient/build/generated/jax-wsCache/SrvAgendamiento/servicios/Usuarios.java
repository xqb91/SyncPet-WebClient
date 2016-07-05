
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloqueado" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfil" type="{http://servicios/}perfiles" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarios", propOrder = {
    "amaterno",
    "apaterno",
    "bloqueado",
    "contrasena",
    "correo",
    "id",
    "nombres",
    "perfil",
    "usuario"
})
public class Usuarios {

    protected String amaterno;
    protected String apaterno;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer bloqueado;
    protected String contrasena;
    protected String correo;
    protected Integer id;
    protected String nombres;
    protected Perfiles perfil;
    protected String usuario;

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
     * Obtiene el valor de la propiedad bloqueado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBloqueado() {
        return bloqueado;
    }

    /**
     * Define el valor de la propiedad bloqueado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBloqueado(Integer value) {
        this.bloqueado = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link Perfiles }
     *     
     */
    public Perfiles getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link Perfiles }
     *     
     */
    public void setPerfil(Perfiles value) {
        this.perfil = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
