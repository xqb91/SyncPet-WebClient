
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ultimoEventoRegistrado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ultimoEventoRegistrado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pro" type="{http://servicios/}propietario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ultimoEventoRegistrado", propOrder = {
    "pro"
})
public class UltimoEventoRegistrado {

    protected Propietario pro;

    /**
     * Obtiene el valor de la propiedad pro.
     * 
     * @return
     *     possible object is
     *     {@link Propietario }
     *     
     */
    public Propietario getPro() {
        return pro;
    }

    /**
     * Define el valor de la propiedad pro.
     * 
     * @param value
     *     allowed object is
     *     {@link Propietario }
     *     
     */
    public void setPro(Propietario value) {
        this.pro = value;
    }

}
