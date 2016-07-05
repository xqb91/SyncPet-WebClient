
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleUsuarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleUsuarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://servicios/}sucursal" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://servicios/}usuarios" minOccurs="0"/>
 *         &lt;element name="veterinario" type="{http://servicios/}veterinario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleUsuarios", propOrder = {
    "id",
    "sucursal",
    "usuario",
    "veterinario"
})
public class DetalleUsuarios {

    protected Integer id;
    protected Sucursal sucursal;
    protected Usuarios usuario;
    protected Veterinario veterinario;

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
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuarios }
     *     
     */
    public Usuarios getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuarios }
     *     
     */
    public void setUsuario(Usuarios value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad veterinario.
     * 
     * @return
     *     possible object is
     *     {@link Veterinario }
     *     
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Define el valor de la propiedad veterinario.
     * 
     * @param value
     *     allowed object is
     *     {@link Veterinario }
     *     
     */
    public void setVeterinario(Veterinario value) {
        this.veterinario = value;
    }

}
