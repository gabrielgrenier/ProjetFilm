
package generated.ParamountSoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for film complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="film">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateSortie" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lienImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prixVisionnement" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "dateSortie",
    "description",
    "id",
    "lienImage",
    "prixVisionnement",
    "titre"
})
public class Film {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSortie;
    protected String description;
    protected int id;
    protected String lienImage;
    protected double prixVisionnement;
    protected String titre;

    /**
     * Gets the value of the dateSortie property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSortie() {
        return dateSortie;
    }

    /**
     * Sets the value of the dateSortie property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSortie(XMLGregorianCalendar value) {
        this.dateSortie = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the lienImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienImage() {
        return lienImage;
    }

    /**
     * Sets the value of the lienImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienImage(String value) {
        this.lienImage = value;
    }

    /**
     * Gets the value of the prixVisionnement property.
     * 
     */
    public double getPrixVisionnement() {
        return prixVisionnement;
    }

    /**
     * Sets the value of the prixVisionnement property.
     * 
     */
    public void setPrixVisionnement(double value) {
        this.prixVisionnement = value;
    }

    /**
     * Gets the value of the titre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Sets the value of the titre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
