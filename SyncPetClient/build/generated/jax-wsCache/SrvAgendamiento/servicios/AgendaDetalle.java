
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para agendaDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agendaDetalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventoAgenda" type="{http://servicios/}agenda" minOccurs="0"/>
 *         &lt;element name="idDetalle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mascota" type="{http://servicios/}mascota" minOccurs="0"/>
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
@XmlType(name = "agendaDetalle", propOrder = {
    "eventoAgenda",
    "idDetalle",
    "mascota",
    "veterinario"
})
public class AgendaDetalle {

    protected Agenda eventoAgenda;
    protected Integer idDetalle;
    protected Mascota mascota;
    protected Veterinario veterinario;

    /**
     * Obtiene el valor de la propiedad eventoAgenda.
     * 
     * @return
     *     possible object is
     *     {@link Agenda }
     *     
     */
    public Agenda getEventoAgenda() {
        return eventoAgenda;
    }

    /**
     * Define el valor de la propiedad eventoAgenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Agenda }
     *     
     */
    public void setEventoAgenda(Agenda value) {
        this.eventoAgenda = value;
    }

    /**
     * Obtiene el valor de la propiedad idDetalle.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDetalle() {
        return idDetalle;
    }

    /**
     * Define el valor de la propiedad idDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDetalle(Integer value) {
        this.idDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad mascota.
     * 
     * @return
     *     possible object is
     *     {@link Mascota }
     *     
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * Define el valor de la propiedad mascota.
     * 
     * @param value
     *     allowed object is
     *     {@link Mascota }
     *     
     */
    public void setMascota(Mascota value) {
        this.mascota = value;
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
