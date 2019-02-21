//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.09.19 a las 01:47:46 PM CDT 
//


package xyz.oeste.springbootsoap.region;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegionDetails" type="{http://springbootsoap.oeste.xyz/region}RegionDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "regionDetails"
})
@XmlRootElement(name = "GetRegionDetailsResponse")
public class GetRegionDetailsResponse {

    @XmlElement(name = "RegionDetails", required = true)
    protected RegionDetails regionDetails;

    /**
     * Obtiene el valor de la propiedad regionDetails.
     * 
     * @return
     *     possible object is
     *     {@link RegionDetails }
     *     
     */
    public RegionDetails getRegionDetails() {
        return regionDetails;
    }

    /**
     * Define el valor de la propiedad regionDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionDetails }
     *     
     */
    public void setRegionDetails(RegionDetails value) {
        this.regionDetails = value;
    }

}
