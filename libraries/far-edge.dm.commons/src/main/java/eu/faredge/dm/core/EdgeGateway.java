//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.12 at 03:19:47 �� EET 
//


package eu.faredge.dm.core;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import eu.faredge.dm.analytics.am.AM;
import eu.faredge.dm.analytics.apm.APM;
import eu.faredge.dm.dcm.DCM;
import eu.faredge.dm.dsm.DSM;


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
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{eu:faredge:faredgedm}Location" minOccurs="0"/>
 *         &lt;element ref="{eu:faredge:faredgedm}AdditionalInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DataManifests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{eu:faredge:drpp:dsm}DSM" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{eu:faredge:drpp:dcm}DCM" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DataManipulation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{eu:faredge:ea:processor}APM" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{eu:faredge:ea:orchestrator}AM" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{eu:faredge:faredgedm}LiveDataSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="namespace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="macAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "location",
    "additionalInformation",
    "dataManifests",
    "dataManipulation",
    "liveDataSet"
})
@XmlRootElement(name = "EdgeGateway")
public class EdgeGateway {

    protected String description;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "AdditionalInformation")
    protected List<Object> additionalInformation;
    @XmlElement(name = "DataManifests", required = true)
    protected EdgeGateway.DataManifests dataManifests;
    @XmlElement(name = "DataManipulation", required = true)
    protected EdgeGateway.DataManipulation dataManipulation;
    @XmlElement(name = "LiveDataSet")
    protected List<LiveDataSet> liveDataSet;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "namespace")
    protected String namespace;
    @XmlAttribute(name = "macAddress")
    protected String macAddress;

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
     * The Edge Gateway location
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAdditionalInformation() {
        if (additionalInformation == null) {
            additionalInformation = new ArrayList<Object>();
        }
        return this.additionalInformation;
    }

    /**
     * Gets the value of the dataManifests property.
     * 
     * @return
     *     possible object is
     *     {@link EdgeGateway.DataManifests }
     *     
     */
    public EdgeGateway.DataManifests getDataManifests() {
        return dataManifests;
    }

    /**
     * Sets the value of the dataManifests property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeGateway.DataManifests }
     *     
     */
    public void setDataManifests(EdgeGateway.DataManifests value) {
        this.dataManifests = value;
    }

    /**
     * Gets the value of the dataManipulation property.
     * 
     * @return
     *     possible object is
     *     {@link EdgeGateway.DataManipulation }
     *     
     */
    public EdgeGateway.DataManipulation getDataManipulation() {
        return dataManipulation;
    }

    /**
     * Sets the value of the dataManipulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdgeGateway.DataManipulation }
     *     
     */
    public void setDataManipulation(EdgeGateway.DataManipulation value) {
        this.dataManipulation = value;
    }

    /**
     * Gets the value of the liveDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liveDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiveDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LiveDataSet }
     * 
     * 
     */
    public List<LiveDataSet> getLiveDataSet() {
        if (liveDataSet == null) {
            liveDataSet = new ArrayList<LiveDataSet>();
        }
        return this.liveDataSet;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
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
     *         &lt;element ref="{eu:faredge:drpp:dsm}DSM" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{eu:faredge:drpp:dcm}DCM" maxOccurs="unbounded" minOccurs="0"/>
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
        "dsm",
        "dcm"
    })
    public static class DataManifests {

        @XmlElement(name = "DSM", namespace = "eu:faredge:drpp:dsm")
        protected List<DSM> dsm;
        @XmlElement(name = "DCM", namespace = "eu:faredge:drpp:dcm")
        protected List<DCM> dcm;

        /**
         * Gets the value of the dsm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dsm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDSM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DSM }
         * 
         * 
         */
        public List<DSM> getDSM() {
            if (dsm == null) {
                dsm = new ArrayList<DSM>();
            }
            return this.dsm;
        }

        /**
         * Gets the value of the dcm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dcm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDCM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCM }
         * 
         * 
         */
        public List<DCM> getDCM() {
            if (dcm == null) {
                dcm = new ArrayList<DCM>();
            }
            return this.dcm;
        }

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
     *         &lt;element ref="{eu:faredge:ea:processor}APM" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{eu:faredge:ea:orchestrator}AM" maxOccurs="unbounded" minOccurs="0"/>
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
        "apm",
        "am"
    })
    public static class DataManipulation {

        @XmlElement(name = "APM", namespace = "eu:faredge:ea:processor")
        protected List<APM> apm;
        @XmlElement(name = "AM", namespace = "eu:faredge:ea:orchestrator")
        protected List<AM> am;

        /**
         * Gets the value of the apm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the apm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAPM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link APM }
         * 
         * 
         */
        public List<APM> getAPM() {
            if (apm == null) {
                apm = new ArrayList<APM>();
            }
            return this.apm;
        }

        /**
         * Gets the value of the am property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the am property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AM }
         * 
         * 
         */
        public List<AM> getAM() {
            if (am == null) {
                am = new ArrayList<AM>();
            }
            return this.am;
        }

    }

}
