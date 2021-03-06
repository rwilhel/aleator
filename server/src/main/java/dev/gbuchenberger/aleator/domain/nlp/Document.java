//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.09 at 04:04:19 PM MST 
//


package dev.gbuchenberger.aleator.domain.nlp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{}sentences"/>
 *         &lt;element ref="{}coreference"/>
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
    "sentences",
    "coreference"
})
@XmlRootElement(name = "document")
@Entity(name = "Document")
@Table(name = "DOCUMENT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {

    @XmlElement(required = true)
    protected Sentences sentences;
    @XmlElement(required = true)
    protected Coreference coreference;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sentences property.
     * 
     * @return
     *     possible object is
     *     {@link Sentences }
     *     
     */
    @ManyToOne(targetEntity = Sentences.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SENTENCES_DOCUMENT_HJID")
    public Sentences getSentences() {
        return sentences;
    }

    /**
     * Sets the value of the sentences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sentences }
     *     
     */
    public void setSentences(Sentences value) {
        this.sentences = value;
    }

    /**
     * Gets the value of the coreference property.
     * 
     * @return
     *     possible object is
     *     {@link Coreference }
     *     
     */
    @ManyToOne(targetEntity = Coreference.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COREFERENCE_DOCUMENT_HJID")
    public Coreference getCoreference() {
        return coreference;
    }

    /**
     * Sets the value of the coreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coreference }
     *     
     */
    public void setCoreference(Coreference value) {
        this.coreference = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

}
