
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para agendarHorario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="agendarHorario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="veterinario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paciente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agendarHorario", propOrder = {
    "fecha",
    "sucursal",
    "veterinario",
    "paciente"
})
public class AgendarHorario {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected int sucursal;
    protected int veterinario;
    protected int paciente;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     */
    public void setSucursal(int value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad veterinario.
     * 
     */
    public int getVeterinario() {
        return veterinario;
    }

    /**
     * Define el valor de la propiedad veterinario.
     * 
     */
    public void setVeterinario(int value) {
        this.veterinario = value;
    }

    /**
     * Obtiene el valor de la propiedad paciente.
     * 
     */
    public int getPaciente() {
        return paciente;
    }

    /**
     * Define el valor de la propiedad paciente.
     * 
     */
    public void setPaciente(int value) {
        this.paciente = value;
    }

}
