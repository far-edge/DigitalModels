//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.12 at 03:19:47 �� EET 
//


package eu.faredge.dm.dsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataInterfaceReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="DataKindReferenceIDs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataKindReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataInterfaceReferenceID",
    "dataKindReferenceIDs"
})
@XmlRootElement(name = "DSD")
public class DSD {

    @XmlElement(name = "DataInterfaceReferenceID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String dataInterfaceReferenceID;
    @XmlElement(name = "DataKindReferenceIDs", required = true)
    protected DSD.DataKindReferenceIDs dataKindReferenceIDs;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;

    /**
     * Gets the value of the dataInterfaceReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInterfaceReferenceID() {
        return dataInterfaceReferenceID;
    }

    /**
     * Sets the value of the dataInterfaceReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInterfaceReferenceID(String value) {
        this.dataInterfaceReferenceID = value;
    }

    /**
     * Gets the value of the dataKindReferenceIDs property.
     * 
     * @return
     *     possible object is
     *     {@link DSD.DataKindReferenceIDs }
     *     
     */
    public DSD.DataKindReferenceIDs getDataKindReferenceIDs() {
        return dataKindReferenceIDs;
    }

    /**
     * Sets the value of the dataKindReferenceIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSD.DataKindReferenceIDs }
     *     
     */
    public void setDataKindReferenceIDs(DSD.DataKindReferenceIDs value) {
        this.dataKindReferenceIDs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DataKindReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
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
        "dataKindReferenceID"
    })
    public static class DataKindReferenceIDs {

        @XmlElement(name = "DataKindReferenceID", required = true)
        @XmlSchemaType(name = "anyURI")
        protected List<String> dataKindReferenceID;

        /**
         * Gets the value of the dataKindReferenceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataKindReferenceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataKindReferenceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataKindReferenceID() {
            if (dataKindReferenceID == null) {
                dataKindReferenceID = new ArrayList<String>();
            }
            return this.dataKindReferenceID;
        }

    }

}
