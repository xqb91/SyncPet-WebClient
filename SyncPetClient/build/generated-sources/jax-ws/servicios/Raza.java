
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para raza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="raza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="especie" type="{http://servicios/}especie" minOccurs="0"/>
 *         &lt;element name="idRaza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "raza", propOrder = {
    "especie",
    "idRaza",
    "nombre"
})
public class Raza {

    protected Especie especie;
    protected Integer idRaza;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad especie.
     * 
     * @return
     *     possible object is
     *     {@link Especie }
     *     
     */
    public Especie getEspecie() {
        return especie;
    }

    /**
     * Define el valor de la propiedad especie.
     * 
     * @param value
     *     allowed object is
     *     {@link Especie }
     *     
     */
    public void setEspecie(Especie value) {
        this.especie = value;
    }

    /**
     * Obtiene el valor de la propiedad idRaza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRaza() {
        return idRaza;
    }

    /**
     * Define el valor de la propiedad idRaza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRaza(Integer value) {
        this.idRaza = value;
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

}
