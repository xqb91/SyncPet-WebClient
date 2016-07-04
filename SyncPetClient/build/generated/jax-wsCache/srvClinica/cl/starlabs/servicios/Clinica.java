
package cl.starlabs.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clinica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clinica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dv" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="idClinica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreFantasia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreReal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clinica", propOrder = {
    "dv",
    "idClinica",
    "nombreFantasia",
    "nombreReal",
    "rut"
})
public class Clinica {

    @XmlSchemaType(name = "unsignedShort")
    protected Integer dv;
    protected Integer idClinica;
    protected String nombreFantasia;
    protected String nombreReal;
    protected int rut;

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
     * Obtiene el valor de la propiedad idClinica.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClinica() {
        return idClinica;
    }

    /**
     * Define el valor de la propiedad idClinica.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClinica(Integer value) {
        this.idClinica = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFantasia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFantasia() {
        return nombreFantasia;
    }

    /**
     * Define el valor de la propiedad nombreFantasia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFantasia(String value) {
        this.nombreFantasia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreReal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReal() {
        return nombreReal;
    }

    /**
     * Define el valor de la propiedad nombreReal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReal(String value) {
        this.nombreReal = value;
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

}
