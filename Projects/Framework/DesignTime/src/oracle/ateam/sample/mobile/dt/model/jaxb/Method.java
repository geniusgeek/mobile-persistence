
package oracle.ateam.sample.mobile.dt.model.jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for method complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="method">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.oracle.com/ateam/mobile/persistenceMapping}headerParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.oracle.com/ateam/mobile/persistenceMapping}parameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectionName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataControlName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="secured" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="payloadRowElementName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sendDataObjectAsPayload" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="deleteLocalRows" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="payloadElementName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="attributesToExclude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oauthConfig" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "method", propOrder =
  {
    "headerParameter", "parameter"
  })
public class Method
{

  protected List<HeaderParameter> headerParameter;
  protected List<Parameter> parameter;
  @XmlAttribute(name = "name")
  protected String name;
  @XmlAttribute(name = "uri")
  protected String uri;
  @XmlAttribute(name = "connectionName", required = true)
  protected String connectionName;
  @XmlAttribute(name = "dataControlName")
  protected String dataControlName;
  @XmlAttribute(name = "requestType")
  protected String requestType;
  @XmlAttribute(name = "secured")
  protected Boolean secured;
  @XmlAttribute(name = "payloadRowElementName")
  protected String payloadRowElementName;
  @XmlAttribute(name = "sendDataObjectAsPayload")
  protected Boolean sendDataObjectAsPayload;
  @XmlAttribute(name = "deleteLocalRows")
  protected Boolean deleteLocalRows;
  @XmlAttribute(name = "payloadElementName", required = true)
  protected String payloadElementName;
  @XmlAttribute(name = "attributesToExclude")
  protected String attributesToExclude;
  @XmlAttribute(name = "oauthConfig")
  protected String oauthConfig;

  /**
   * Gets the value of the headerParameter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the headerParameter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getHeaderParameter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link HeaderParameter }
   *
   *
   */
  public List<HeaderParameter> getHeaderParameter()
  {
    if (headerParameter == null)
    {
      headerParameter = new ArrayList<HeaderParameter>();
    }
    return this.headerParameter;
  }

  /**
   * Gets the value of the parameter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the parameter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getParameter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Parameter }
   *
   *
   */
  public List<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new ArrayList<Parameter>();
    }
    return this.parameter;
  }

  /**
   * Gets the value of the name property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getName()
  {
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
  public void setName(String value)
  {
    this.name = value;
  }

  /**
   * Gets the value of the uri property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getUri()
  {
    return uri;
  }

  /**
   * Sets the value of the uri property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setUri(String value)
  {
    this.uri = value;
  }

  /**
   * Gets the value of the connectionName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getConnectionName()
  {
    return connectionName;
  }

  /**
   * Sets the value of the connectionName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setConnectionName(String value)
  {
    this.connectionName = value;
  }

  /**
   * Gets the value of the dataControlName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getDataControlName()
  {
    return dataControlName;
  }

  /**
   * Sets the value of the dataControlName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setDataControlName(String value)
  {
    this.dataControlName = value;
  }

  /**
   * Gets the value of the requestType property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getRequestType()
  {
    return requestType;
  }

  /**
   * Sets the value of the requestType property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setRequestType(String value)
  {
    this.requestType = value;
  }

  /**
   * Gets the value of the secured property.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean isSecured()
  {
    if (secured == null)
    {
      return false;
    }
    else
    {
      return secured;
    }
  }

  /**
   * Sets the value of the secured property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setSecured(Boolean value)
  {
    this.secured = value;
  }

  /**
   * Gets the value of the payloadRowElementName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getPayloadRowElementName()
  {
    return payloadRowElementName;
  }

  /**
   * Sets the value of the payloadRowElementName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPayloadRowElementName(String value)
  {
    this.payloadRowElementName = value;
  }

  /**
   * Gets the value of the sendDataObjectAsPayload property.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean isSendDataObjectAsPayload()
  {
    if (sendDataObjectAsPayload == null)
    {
      return false;
    }
    else
    {
      return sendDataObjectAsPayload;
    }
  }

  /**
   * Sets the value of the sendDataObjectAsPayload property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setSendDataObjectAsPayload(Boolean value)
  {
    this.sendDataObjectAsPayload = value;
  }

  /**
   * Gets the value of the deleteLocalRows property.
   *
   * @return
   *     possible object is
   *     {@link Boolean }
   *
   */
  public boolean isDeleteLocalRows()
  {
    if (deleteLocalRows == null)
    {
      return false;
    }
    else
    {
      return deleteLocalRows;
    }
  }

  /**
   * Sets the value of the deleteLocalRows property.
   *
   * @param value
   *     allowed object is
   *     {@link Boolean }
   *
   */
  public void setDeleteLocalRows(Boolean value)
  {
    this.deleteLocalRows = value;
  }

  /**
   * Gets the value of the payloadElementName property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getPayloadElementName()
  {
    return payloadElementName;
  }

  /**
   * Sets the value of the payloadElementName property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setPayloadElementName(String value)
  {
    this.payloadElementName = value;
  }

  /**
   * Gets the value of the attributesToExclude property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getAttributesToExclude()
  {
    return attributesToExclude;
  }

  /**
   * Sets the value of the attributesToExclude property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setAttributesToExclude(String value)
  {
    this.attributesToExclude = value;
  }

  /**
   * Gets the value of the oauthConfig property.
   *
   * @return
   *     possible object is
   *     {@link String }
   *
   */
  public String getOauthConfig()
  {
    return oauthConfig;
  }

  /**
   * Sets the value of the oauthConfig property.
   *
   * @param value
   *     allowed object is
   *     {@link String }
   *
   */
  public void setOauthConfig(String value)
  {
    this.oauthConfig = value;
  }

}
