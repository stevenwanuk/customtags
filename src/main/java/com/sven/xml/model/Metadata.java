//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.13 at 04:06:25 PM BST 
//


package com.sven.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}title"/&gt;
 *         &lt;element ref="{}last-updated"/&gt;
 *         &lt;element ref="{}version-history"/&gt;
 *         &lt;element ref="{}synonyms"/&gt;
 *         &lt;element ref="{}related-topics"/&gt;
 *         &lt;element ref="{}categories"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "lastUpdated",
    "versionHistory",
    "synonyms",
    "relatedTopics",
    "categories"
})
@XmlRootElement(name = "metadata")
public class Metadata {

    @XmlElement(required = true)
    protected Title title;
    @XmlElement(name = "last-updated", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;
    @XmlElement(name = "version-history", required = true)
    protected VersionHistory versionHistory;
    @XmlElement(required = true)
    protected Synonyms synonyms;
    @XmlElement(name = "related-topics", required = true)
    protected String relatedTopics;
    @XmlElement(required = true)
    protected Categories categories;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

    /**
     * Gets the value of the versionHistory property.
     * 
     * @return
     *     possible object is
     *     {@link VersionHistory }
     *     
     */
    public VersionHistory getVersionHistory() {
        return versionHistory;
    }

    /**
     * Sets the value of the versionHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionHistory }
     *     
     */
    public void setVersionHistory(VersionHistory value) {
        this.versionHistory = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link Synonyms }
     *     
     */
    public Synonyms getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Synonyms }
     *     
     */
    public void setSynonyms(Synonyms value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the relatedTopics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedTopics() {
        return relatedTopics;
    }

    /**
     * Sets the value of the relatedTopics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedTopics(String value) {
        this.relatedTopics = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link Categories }
     *     
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categories }
     *     
     */
    public void setCategories(Categories value) {
        this.categories = value;
    }

}
