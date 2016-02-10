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
// ---    Wed Feb 10 12:22:19 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PsFDDocRevApprovalHistImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    DocRevId,
    ProjId,
    ReviewDate,
    DocVersion,
    DocName,
    Title,
    Comments,
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
  public static final int DOCREVID = AttributesEnum.DocRevId.index();
  public static final int PROJID = AttributesEnum.ProjId.index();
  public static final int REVIEWDATE = AttributesEnum.ReviewDate.index();
  public static final int DOCVERSION = AttributesEnum.DocVersion.index();
  public static final int DOCNAME = AttributesEnum.DocName.index();
  public static final int TITLE = AttributesEnum.Title.index();
  public static final int COMMENTS = AttributesEnum.Comments.index();
  public static final int PSFDPROJECTS = AttributesEnum.PsFDProjects.index();

  /**
   * This is the default constructor (do not remove).
   */
  public PsFDDocRevApprovalHistImpl()
  {
  }

  /**
   * Gets the attribute value for DocRevId, using the alias name DocRevId.
   * @return the value of DocRevId
   */
  public Number getDocRevId()
  {
    return (Number) getAttributeInternal(DOCREVID);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocRevId.
   * @param value value to set the DocRevId
   */
  public void setDocRevId(Number value)
  {
    setAttributeInternal(DOCREVID, value);
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
   * Gets the attribute value for ReviewDate, using the alias name ReviewDate.
   * @return the value of ReviewDate
   */
  public Timestamp getReviewDate()
  {
    return (Timestamp) getAttributeInternal(REVIEWDATE);
  }

  /**
   * Sets <code>value</code> as the attribute value for ReviewDate.
   * @param value value to set the ReviewDate
   */
  public void setReviewDate(Timestamp value)
  {
    setAttributeInternal(REVIEWDATE, value);
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
   * Gets the attribute value for Title, using the alias name Title.
   * @return the value of Title
   */
  public String getTitle()
  {
    return (String) getAttributeInternal(TITLE);
  }

  /**
   * Sets <code>value</code> as the attribute value for Title.
   * @param value value to set the Title
   */
  public void setTitle(String value)
  {
    setAttributeInternal(TITLE, value);
  }

  /**
   * Gets the attribute value for Comments, using the alias name Comments.
   * @return the value of Comments
   */
  public String getComments()
  {
    return (String) getAttributeInternal(COMMENTS);
  }

  /**
   * Sets <code>value</code> as the attribute value for Comments.
   * @param value value to set the Comments
   */
  public void setComments(String value)
  {
    setAttributeInternal(COMMENTS, value);
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
   * @param docRevId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Number docRevId)
  {
    return new Key(new Object[] { docRevId });
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("model.PsFDDocRevApprovalHist");
  }

  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
    setDocRevId(getNextSequenceVal("DOC_REV_ID_SEQ"));
  }
  protected Number getNextSequenceVal(String sequenceName)
  {
    SequenceImpl s = new SequenceImpl(sequenceName, getDBTransaction());
    return s.getSequenceNumber();
  }
}

