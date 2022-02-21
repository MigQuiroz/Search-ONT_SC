
package com.totaplay.searchONT.tprovisioningSoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para arrAutoFind complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="arrAutoFind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OLT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Slot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Frame" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumberONT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blnConnected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="strDateConnected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OntId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PWD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VendorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MainVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdModel" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PON_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrAutoFind", propOrder = {
    "olt",
    "port",
    "slot",
    "frame",
    "serialNumberONT",
    "blnConnected",
    "strDateConnected",
    "ontId",
    "pwd",
    "equipmentId",
    "vendorId",
    "mainVersion",
    "idModel",
    "ponid"
})
public class ArrAutoFind {

    @XmlElement(name = "OLT")
    protected String olt;
    @XmlElement(name = "Port")
    protected String port;
    @XmlElement(name = "Slot")
    protected String slot;
    @XmlElement(name = "Frame")
    protected String frame;
    @XmlElement(name = "SerialNumberONT")
    protected String serialNumberONT;
    protected boolean blnConnected;
    protected String strDateConnected;
    @XmlElement(name = "OntId")
    protected String ontId;
    @XmlElement(name = "PWD")
    protected String pwd;
    @XmlElement(name = "EquipmentId")
    protected String equipmentId;
    @XmlElement(name = "VendorId")
    protected String vendorId;
    @XmlElement(name = "MainVersion")
    protected String mainVersion;
    @XmlElement(name = "IdModel")
    protected long idModel;
    @XmlElement(name = "PON_ID")
    protected String ponid;

    /**
     * Obtiene el valor de la propiedad olt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOLT() {
        return olt;
    }

    /**
     * Define el valor de la propiedad olt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOLT(String value) {
        this.olt = value;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Obtiene el valor de la propiedad slot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Define el valor de la propiedad slot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Obtiene el valor de la propiedad frame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Define el valor de la propiedad frame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Obtiene el valor de la propiedad serialNumberONT.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumberONT() {
        return serialNumberONT;
    }

    /**
     * Define el valor de la propiedad serialNumberONT.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumberONT(String value) {
        this.serialNumberONT = value;
    }

    /**
     * Obtiene el valor de la propiedad blnConnected.
     * 
     */
    public boolean isBlnConnected() {
        return blnConnected;
    }

    /**
     * Define el valor de la propiedad blnConnected.
     * 
     */
    public void setBlnConnected(boolean value) {
        this.blnConnected = value;
    }

    /**
     * Obtiene el valor de la propiedad strDateConnected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDateConnected() {
        return strDateConnected;
    }

    /**
     * Define el valor de la propiedad strDateConnected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDateConnected(String value) {
        this.strDateConnected = value;
    }

    /**
     * Obtiene el valor de la propiedad ontId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntId() {
        return ontId;
    }

    /**
     * Define el valor de la propiedad ontId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntId(String value) {
        this.ontId = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWD() {
        return pwd;
    }

    /**
     * Define el valor de la propiedad pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWD(String value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad equipmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Define el valor de la propiedad equipmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad vendorId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * Define el valor de la propiedad vendorId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorId(String value) {
        this.vendorId = value;
    }

    /**
     * Obtiene el valor de la propiedad mainVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainVersion() {
        return mainVersion;
    }

    /**
     * Define el valor de la propiedad mainVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainVersion(String value) {
        this.mainVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad idModel.
     * 
     */
    public long getIdModel() {
        return idModel;
    }

    /**
     * Define el valor de la propiedad idModel.
     * 
     */
    public void setIdModel(long value) {
        this.idModel = value;
    }

    /**
     * Obtiene el valor de la propiedad ponid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPONID() {
        return ponid;
    }

    /**
     * Define el valor de la propiedad ponid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPONID(String value) {
        this.ponid = value;
    }

}