package model;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 10 11:53:29 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PsFDRelatedDocsImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    RelatedDocId,
    ProjId,
    DocName,
    Revision,
    DocDescr,
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
  public static final int RELATEDDOCID = AttributesEnum.RelatedDocId.index();
  public static final int PROJID = AttributesEnum.ProjId.index();
  public static final int DOCNAME = AttributesEnum.DocName.index();
  public static final int REVISION = AttributesEnum.Revision.index();
  public static final int DOCDESCR = AttributesEnum.DocDescr.index();
  public static final int PSFDPROJECTS = AttributesEnum.PsFDProjects.index();

  /**
   * This is the default constructor (do not remove).
   */
  public PsFDRelatedDocsImpl()
  {
  }

  /**
   * Gets the attribute value for RelatedDocId, using the alias name RelatedDocId.
   * @return the value of RelatedDocId
   */
  public Number getRelatedDocId()
  {
    return (Number) getAttributeInternal(RELATEDDOCID);
  }

  /**
   * Sets <code>value</code> as the attribute value for RelatedDocId.
   * @param value value to set the RelatedDocId
   */
  public void setRelatedDocId(Number value)
  {
    setAttributeInternal(RELATEDDOCID, value);
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
   * Gets the attribute value for Revision, using the alias name Revision.
   * @return the value of Revision
   */
  public String getRevision()
  {
    return (String) getAttributeInternal(REVISION);
  }

  /**
   * Sets <code>value</code> as the attribute value for Revision.
   * @param value value to set the Revision
   */
  public void setRevision(String value)
  {
    setAttributeInternal(REVISION, value);
  }

  /**
   * Gets the attribute value for DocDescr, using the alias name DocDescr.
   * @return the value of DocDescr
   */
  public String getDocDescr()
  {
    return (String) getAttributeInternal(DOCDESCR);
  }

  /**
   * Sets <code>value</code> as the attribute value for DocDescr.
   * @param value value to set the DocDescr
   */
  public void setDocDescr(String value)
  {
    setAttributeInternal(DOCDESCR, value);
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
   * @param relatedDocId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Number relatedDocId)
  {
    return new Key(new Object[] { relatedDocId });
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("model.PsFDRelatedDocs");
  }

  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
    setRelatedDocId(getNextSequenceVal("RELATED_DOC_ID_SEQ"));
  }
  protected Number getNextSequenceVal(String sequenceName)
  {
    SequenceImpl s = new SequenceImpl(sequenceName, getDBTransaction());
    return s.getSequenceNumber();
  }
}
