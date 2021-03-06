package model;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 10 12:24:23 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PsFDDocInfoImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    DocNo,
    ProjId,
    DocIdentification,
    DocName,
    ProjName,
    ClientName,
    DocAuthor,
    DocVersion,
    DocStatus,
    DateReleased,
    PsFDProjects;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }
  public static final int DOCNO = AttributesEnum.DocNo.index();
  public static final int PROJID = AttributesEnum.ProjId.index();
  public static final int DOCIDENTIFICATION = AttributesEnum.DocIdentification.index();
  public static final int DOCNAME = AttributesEnum.DocName.index();
  public static final int PROJNAME = AttributesEnum.ProjName.index();
  public static final int CLIENTNAME = AttributesEnum.ClientName.index();
  public static final int DOCAUTHOR = AttributesEnum.DocAuthor.index();
  public static final int DOCVERSION = AttributesEnum.DocVersion.index();
  public static final int DOCSTATUS = AttributesEnum.DocStatus.index();
  public static final int DATERELEASED = AttributesEnum.DateReleased.index();
  public static final int PSFDPROJECTS = AttributesEnum.PsFDProjects.index();

  /**
   * This is the default constructor (do not remove).
   */
  public PsFDDocInfoImpl()
  {
  }

  /**
   * Gets the attribute value for DocNo, using the alias name DocNo.
   * @return the value of DocNo
   */
  public Number getDocNo()
  {
    return (Number) getAttributeInternal(DOCNO);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocNo.
   * @param value value to set the DocNo
   */
  public void setDocNo(Number value)
  {
    setAttributeInternal(DOCNO, value);
  }

  /**
   * Gets the attribute value for ProjId, using the alias name ProjId.
   * @return the value of ProjId
   */
  public Integer getProjId()
  {
    return (Integer) getAttributeInternal(PROJID);
  }

  /**
   * Sets <code>value</code> as the attribute value for ProjId.
   * @param value value to set the ProjId
   */
  public void setProjId(Integer value)
  {
    setAttributeInternal(PROJID, value);
  }

  /**
   * Gets the attribute value for DocIdentification, using the alias name DocIdentification.
   * @return the value of DocIdentification
   */
  public String getDocIdentification()
  {
    return (String) getAttributeInternal(DOCIDENTIFICATION);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocIdentification.
   * @param value value to set the DocIdentification
   */
  public void setDocIdentification(String value)
  {
    setAttributeInternal(DOCIDENTIFICATION, value);
  }

  /**
   * Gets the attribute value for DocName, using the alias name DocName.
   * @return the value of DocName
   */
  public String getDocName()
  {
    return (String) getAttributeInternal(DOCNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocName.
   * @param value value to set the DocName
   */
  public void setDocName(String value)
  {
    setAttributeInternal(DOCNAME, value);
  }

  /**
   * Gets the attribute value for ProjName, using the alias name ProjName.
   * @return the value of ProjName
   */
  public String getProjName()
  {
    return (String) getAttributeInternal(PROJNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for ProjName.
   * @param value value to set the ProjName
   */
  public void setProjName(String value)
  {
    setAttributeInternal(PROJNAME, value);
  }

  /**
   * Gets the attribute value for ClientName, using the alias name ClientName.
   * @return the value of ClientName
   */
  public String getClientName()
  {
    return (String) getAttributeInternal(CLIENTNAME);
  }

  /**
   * Sets <code>value</code> as the attribute value for ClientName.
   * @param value value to set the ClientName
   */
  public void setClientName(String value)
  {
    setAttributeInternal(CLIENTNAME, value);
  }

  /**
   * Gets the attribute value for DocAuthor, using the alias name DocAuthor.
   * @return the value of DocAuthor
   */
  public String getDocAuthor()
  {
    return (String) getAttributeInternal(DOCAUTHOR);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocAuthor.
   * @param value value to set the DocAuthor
   */
  public void setDocAuthor(String value)
  {
    setAttributeInternal(DOCAUTHOR, value);
  }

  /**
   * Gets the attribute value for DocVersion, using the alias name DocVersion.
   * @return the value of DocVersion
   */
  public BigDecimal getDocVersion()
  {
    return (BigDecimal) getAttributeInternal(DOCVERSION);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocVersion.
   * @param value value to set the DocVersion
   */
  public void setDocVersion(BigDecimal value)
  {
    setAttributeInternal(DOCVERSION, value);
  }

  /**
   * Gets the attribute value for DocStatus, using the alias name DocStatus.
   * @return the value of DocStatus
   */
  public String getDocStatus()
  {
    return (String) getAttributeInternal(DOCSTATUS);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocStatus.
   * @param value value to set the DocStatus
   */
  public void setDocStatus(String value)
  {
    setAttributeInternal(DOCSTATUS, value);
  }

  /**
   * Gets the attribute value for DateReleased, using the alias name DateReleased.
   * @return the value of DateReleased
   */
  public Timestamp getDateReleased()
  {
    return (Timestamp) getAttributeInternal(DATERELEASED);
  }

  /**
   * Sets <code>value</code> as the attribute value for DateReleased.
   * @param value value to set the DateReleased
   */
  public void setDateReleased(Timestamp value)
  {
    setAttributeInternal(DATERELEASED, value);
  }

  /**
   * @return the associated entity PsFDProjectsImpl.
   */
  public PsFDProjectsImpl getPsFDProjects()
  {
    return (PsFDProjectsImpl) getAttributeInternal(PSFDPROJECTS);
  }

  /**
   * Sets <code>value</code> as the associated entity PsFDProjectsImpl.
   */
  public void setPsFDProjects(PsFDProjectsImpl value)
  {
    setAttributeInternal(PSFDPROJECTS, value);
  }

  /**
   * @param docNo key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Number docNo)
  {
    return new Key(new Object[] { docNo });
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("model.PsFDDocInfo");
  }

  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
    setDocNo(getNextSequenceVal("DOC_NO_SEQ"));
  }
  protected Number getNextSequenceVal(String sequenceName)
  {
    SequenceImpl s = new SequenceImpl(sequenceName, getDBTransaction());
    return s.getSequenceNumber();
  }
}

