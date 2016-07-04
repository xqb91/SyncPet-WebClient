
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listadoMascotasPorPropietario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listadoMascotasPorPropietario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="propietario" type="{http://servicios/}propietario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listadoMascotasPorPropietario", propOrder = {
    "propietario"
})
public class ListadoMascotasPorPropietario {

    protected Propietario propietario;

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

}
