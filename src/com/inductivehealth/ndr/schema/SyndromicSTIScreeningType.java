//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.30 at 05:24:15 AM WAT 
//


package com.inductivehealth.ndr.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyndromicSTIScreeningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyndromicSTIScreeningType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VaginalDischargeOrBurningWhenUrinating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LowerAbdominalPainsWithOrWithoutVaginalDischarge" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="UrethralDischargeOrBurningWhenUrinating" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ScrotalSwellingAndPain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="GenitalSoreOrSwollenInguinalLymphNodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyndromicSTIScreeningType", propOrder = {
    "vaginalDischargeOrBurningWhenUrinating",
    "lowerAbdominalPainsWithOrWithoutVaginalDischarge",
    "urethralDischargeOrBurningWhenUrinating",
    "scrotalSwellingAndPain",
    "genitalSoreOrSwollenInguinalLymphNodes"
})
public class SyndromicSTIScreeningType {

    @XmlElement(name = "VaginalDischargeOrBurningWhenUrinating")
    protected boolean vaginalDischargeOrBurningWhenUrinating;
    @XmlElement(name = "LowerAbdominalPainsWithOrWithoutVaginalDischarge")
    protected boolean lowerAbdominalPainsWithOrWithoutVaginalDischarge;
    @XmlElement(name = "UrethralDischargeOrBurningWhenUrinating")
    protected boolean urethralDischargeOrBurningWhenUrinating;
    @XmlElement(name = "ScrotalSwellingAndPain")
    protected boolean scrotalSwellingAndPain;
    @XmlElement(name = "GenitalSoreOrSwollenInguinalLymphNodes")
    protected boolean genitalSoreOrSwollenInguinalLymphNodes;

    /**
     * Gets the value of the vaginalDischargeOrBurningWhenUrinating property.
     * 
     */
    public boolean isVaginalDischargeOrBurningWhenUrinating() {
        return vaginalDischargeOrBurningWhenUrinating;
    }

    /**
     * Sets the value of the vaginalDischargeOrBurningWhenUrinating property.
     * 
     */
    public void setVaginalDischargeOrBurningWhenUrinating(boolean value) {
        this.vaginalDischargeOrBurningWhenUrinating = value;
    }

    /**
     * Gets the value of the lowerAbdominalPainsWithOrWithoutVaginalDischarge property.
     * 
     */
    public boolean isLowerAbdominalPainsWithOrWithoutVaginalDischarge() {
        return lowerAbdominalPainsWithOrWithoutVaginalDischarge;
    }

    /**
     * Sets the value of the lowerAbdominalPainsWithOrWithoutVaginalDischarge property.
     * 
     */
    public void setLowerAbdominalPainsWithOrWithoutVaginalDischarge(boolean value) {
        this.lowerAbdominalPainsWithOrWithoutVaginalDischarge = value;
    }

    /**
     * Gets the value of the urethralDischargeOrBurningWhenUrinating property.
     * 
     */
    public boolean isUrethralDischargeOrBurningWhenUrinating() {
        return urethralDischargeOrBurningWhenUrinating;
    }

    /**
     * Sets the value of the urethralDischargeOrBurningWhenUrinating property.
     * 
     */
    public void setUrethralDischargeOrBurningWhenUrinating(boolean value) {
        this.urethralDischargeOrBurningWhenUrinating = value;
    }

    /**
     * Gets the value of the scrotalSwellingAndPain property.
     * 
     */
    public boolean isScrotalSwellingAndPain() {
        return scrotalSwellingAndPain;
    }

    /**
     * Sets the value of the scrotalSwellingAndPain property.
     * 
     */
    public void setScrotalSwellingAndPain(boolean value) {
        this.scrotalSwellingAndPain = value;
    }

    /**
     * Gets the value of the genitalSoreOrSwollenInguinalLymphNodes property.
     * 
     */
    public boolean isGenitalSoreOrSwollenInguinalLymphNodes() {
        return genitalSoreOrSwollenInguinalLymphNodes;
    }

    /**
     * Sets the value of the genitalSoreOrSwollenInguinalLymphNodes property.
     * 
     */
    public void setGenitalSoreOrSwollenInguinalLymphNodes(boolean value) {
        this.genitalSoreOrSwollenInguinalLymphNodes = value;
    }

}
