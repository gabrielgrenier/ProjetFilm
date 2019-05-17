
package generated.SonyClient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour film complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� dateSortie.
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
     * D�finit la valeur de la propri�t� dateSortie.
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
     * Obtient la valeur de la propri�t� description.
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
     * D�finit la valeur de la propri�t� description.
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
     * Obtient la valeur de la propri�t� id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� lienImage.
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
     * D�finit la valeur de la propri�t� lienImage.
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
     * Obtient la valeur de la propri�t� prixVisionnement.
     * 
     */
    public double getPrixVisionnement() {
        return prixVisionnement;
    }

    /**
     * D�finit la valeur de la propri�t� prixVisionnement.
     * 
     */
    public void setPrixVisionnement(double value) {
        this.prixVisionnement = value;
    }

    /**
     * Obtient la valeur de la propri�t� titre.
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
     * D�finit la valeur de la propri�t� titre.
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
