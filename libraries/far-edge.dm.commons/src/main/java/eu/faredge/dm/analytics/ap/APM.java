//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.22 at 04:28:44 �� EET 
//


package eu.faredge.dm.analytics.ap;

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
 *         &lt;element name="AnalyticsProcessorDefinitionReferenceID" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element ref="{eu:faredge:ea:processor}ConfigurationParameters" minOccurs="0"/>
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
    "analyticsProcessorDefinitionReferenceID",
    "configurationParameters"
})
@XmlRootElement(name = "APM")
public class APM {

    @XmlElement(name = "AnalyticsProcessorDefinitionReferenceID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String analyticsProcessorDefinitionReferenceID;
    @XmlElement(name = "ConfigurationParameters")
    protected ConfigurationParameters configurationParameters;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;

    /**
     * Gets the value of the analyticsProcessorDefinitionReferenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyticsProcessorDefinitionReferenceID() {
        return analyticsProcessorDefinitionReferenceID;
    }

    /**
     * Sets the value of the analyticsProcessorDefinitionReferenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyticsProcessorDefinitionReferenceID(String value) {
        this.analyticsProcessorDefinitionReferenceID = value;
    }

    /**
     * Gets the value of the configurationParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationParameters }
     *     
     */
    public ConfigurationParameters getConfigurationParameters() {
        return configurationParameters;
    }

    /**
     * Sets the value of the configurationParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationParameters }
     *     
     */
    public void setConfigurationParameters(ConfigurationParameters value) {
        this.configurationParameters = value;
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

}
