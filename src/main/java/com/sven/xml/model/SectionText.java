//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.13 at 04:06:25 PM BST 
//


package com.sven.xml.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{}para"/&gt;
 *         &lt;element ref="{}list"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paraOrList"
})
@XmlRootElement(name = "section-text")
public class SectionText {

    @XmlElements({
        @XmlElement(name = "para", type = Para.class),
        @XmlElement(name = "list", type = com.sven.xml.model.List.class)
    })
    protected java.util.List<Object> paraOrList;

    /**
     * Gets the value of the paraOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paraOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParaOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Para }
     * {@link com.sven.xml.model.List }
     * 
     * 
     */
    public java.util.List<Object> getParaOrList() {
        if (paraOrList == null) {
            paraOrList = new ArrayList<Object>();
        }
        return this.paraOrList;
    }

}
