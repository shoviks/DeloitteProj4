package model;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 05 13:35:58 EST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PsFDProjectsImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    ProjId,
    ProjName,
    Objective,
    BusNeeds,
    MajorFeatures,
    Modules,
    Systems,
    Assumptions,
    DependenciesAndPrereqs,
    RefsToReqs,
    SourceAndTargetSysDescr,
    ProcessFlowDiagram,
    ProcessStepsDescr,
    DataMappings,
    AddProcessLogic,
    DataSelectAndFilterCrit,
    PreExtractCleanUpCrit,
    TestScenarioAcceptanceCrit,
    VolAndPerfReqs,
    InitFreqAndSchedReqs,
    SecurityAndControlsReqs,
    LogOutput,
    RestartProcedures,
    Appendix,
    PsFDDocInfo,
    PsFDDocRevApprovalHist,
    PsFDInterfaces,
    PsFDDistFinalDoc,
    PsFDErrors,
    PsFDClosedIssues,
    PsFDOpenIssues,
    PsFDNomenclature,
    PsFDDocEditHist,
    PsFDBusRules,
    PsFDRelatedDocs;
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

  public static final int PROJID = AttributesEnum.ProjId.index();
  public static final int PROJNAME = AttributesEnum.ProjName.index();
  public static final int OBJECTIVE = AttributesEnum.Objective.index();
  public static final int BUSNEEDS = AttributesEnum.BusNeeds.index();
  public static final int MAJORFEATURES = AttributesEnum.MajorFeatures.index();
  public static final int MODULES = AttributesEnum.Modules.index();
  public static final int SYSTEMS = AttributesEnum.Systems.index();
  public static final int ASSUMPTIONS = AttributesEnum.Assumptions.index();
  public static final int DEPENDENCIESANDPREREQS = AttributesEnum.DependenciesAndPrereqs.index();
  public static final int REFSTOREQS = AttributesEnum.RefsToReqs.index();
  public static final int SOURCEANDTARGETSYSDESCR = AttributesEnum.SourceAndTargetSysDescr.index();
  public static final int PROCESSFLOWDIAGRAM = AttributesEnum.ProcessFlowDiagram.index();
  public static final int PROCESSSTEPSDESCR = AttributesEnum.ProcessStepsDescr.index();
  public static final int DATAMAPPINGS = AttributesEnum.DataMappings.index();
  public static final int ADDPROCESSLOGIC = AttributesEnum.AddProcessLogic.index();
  public static final int DATASELECTANDFILTERCRIT = AttributesEnum.DataSelectAndFilterCrit.index();
  public static final int PREEXTRACTCLEANUPCRIT = AttributesEnum.PreExtractCleanUpCrit.index();
  public static final int TESTSCENARIOACCEPTANCECRIT = AttributesEnum.TestScenarioAcceptanceCrit.index();
  public static final int VOLANDPERFREQS = AttributesEnum.VolAndPerfReqs.index();
  public static final int INITFREQANDSCHEDREQS = AttributesEnum.InitFreqAndSchedReqs.index();
  public static final int SECURITYANDCONTROLSREQS = AttributesEnum.SecurityAndControlsReqs.index();
  public static final int LOGOUTPUT = AttributesEnum.LogOutput.index();
  public static final int RESTARTPROCEDURES = AttributesEnum.RestartProcedures.index();
  public static final int APPENDIX = AttributesEnum.Appendix.index();
  public static final int PSFDDOCINFO = AttributesEnum.PsFDDocInfo.index();
  public static final int PSFDDOCREVAPPROVALHIST = AttributesEnum.PsFDDocRevApprovalHist.index();
  public static final int PSFDINTERFACES = AttributesEnum.PsFDInterfaces.index();
  public static final int PSFDDISTFINALDOC = AttributesEnum.PsFDDistFinalDoc.index();
  public static final int PSFDERRORS = AttributesEnum.PsFDErrors.index();
  public static final int PSFDCLOSEDISSUES = AttributesEnum.PsFDClosedIssues.index();
  public static final int PSFDOPENISSUES = AttributesEnum.PsFDOpenIssues.index();
  public static final int PSFDNOMENCLATURE = AttributesEnum.PsFDNomenclature.index();
  public static final int PSFDDOCEDITHIST = AttributesEnum.PsFDDocEditHist.index();
  public static final int PSFDBUSRULES = AttributesEnum.PsFDBusRules.index();
  public static final int PSFDRELATEDDOCS = AttributesEnum.PsFDRelatedDocs.index();

  /**
   * This is the default constructor (do not remove).
   */
  public PsFDProjectsImpl()
  {
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
   * Gets the attribute value for Objective, using the alias name Objective.
   * @return the value of Objective
   */
  public String getObjective()
  {
    return (String) getAttributeInternal(OBJECTIVE);
  }

  /**
   * Sets <code>value</code> as the attribute value for Objective.
   * @param value value to set the Objective
   */
  public void setObjective(String value)
  {
    setAttributeInternal(OBJECTIVE, value);
  }

  /**
   * Gets the attribute value for BusNeeds, using the alias name BusNeeds.
   * @return the value of BusNeeds
   */
  public String getBusNeeds()
  {
    return (String) getAttributeInternal(BUSNEEDS);
  }

  /**
   * Sets <code>value</code> as the attribute value for BusNeeds.
   * @param value value to set the BusNeeds
   */
  public void setBusNeeds(String value)
  {
    setAttributeInternal(BUSNEEDS, value);
  }

  /**
   * Gets the attribute value for MajorFeatures, using the alias name MajorFeatures.
   * @return the value of MajorFeatures
   */
  public String getMajorFeatures()
  {
    return (String) getAttributeInternal(MAJORFEATURES);
  }

  /**
   * Sets <code>value</code> as the attribute value for MajorFeatures.
   * @param value value to set the MajorFeatures
   */
  public void setMajorFeatures(String value)
  {
    setAttributeInternal(MAJORFEATURES, value);
  }

  /**
   * Gets the attribute value for Modules, using the alias name Modules.
   * @return the value of Modules
   */
  public String getModules()
  {
    return (String) getAttributeInternal(MODULES);
  }

  /**
   * Sets <code>value</code> as the attribute value for Modules.
   * @param value value to set the Modules
   */
  public void setModules(String value)
  {
    setAttributeInternal(MODULES, value);
  }

  /**
   * Gets the attribute value for Systems, using the alias name Systems.
   * @return the value of Systems
   */
  public String getSystems()
  {
    return (String) getAttributeInternal(SYSTEMS);
  }

  /**
   * Sets <code>value</code> as the attribute value for Systems.
   * @param value value to set the Systems
   */
  public void setSystems(String value)
  {
    setAttributeInternal(SYSTEMS, value);
  }

  /**
   * Gets the attribute value for Assumptions, using the alias name Assumptions.
   * @return the value of Assumptions
   */
  public String getAssumptions()
  {
    return (String) getAttributeInternal(ASSUMPTIONS);
  }

  /**
   * Sets <code>value</code> as the attribute value for Assumptions.
   * @param value value to set the Assumptions
   */
  public void setAssumptions(String value)
  {
    setAttributeInternal(ASSUMPTIONS, value);
  }

  /**
   * Gets the attribute value for DependenciesAndPrereqs, using the alias name DependenciesAndPrereqs.
   * @return the value of DependenciesAndPrereqs
   */
  public String getDependenciesAndPrereqs()
  {
    return (String) getAttributeInternal(DEPENDENCIESANDPREREQS);
  }

  /**
   * Sets <code>value</code> as the attribute value for DependenciesAndPrereqs.
   * @param value value to set the DependenciesAndPrereqs
   */
  public void setDependenciesAndPrereqs(String value)
  {
    setAttributeInternal(DEPENDENCIESANDPREREQS, value);
  }

  /**
   * Gets the attribute value for RefsToReqs, using the alias name RefsToReqs.
   * @return the value of RefsToReqs
   */
  public String getRefsToReqs()
  {
    return (String) getAttributeInternal(REFSTOREQS);
  }

  /**
   * Sets <code>value</code> as the attribute value for RefsToReqs.
   * @param value value to set the RefsToReqs
   */
  public void setRefsToReqs(String value)
  {
    setAttributeInternal(REFSTOREQS, value);
  }

  /**
   * Gets the attribute value for SourceAndTargetSysDescr, using the alias name SourceAndTargetSysDescr.
   * @return the value of SourceAndTargetSysDescr
   */
  public String getSourceAndTargetSysDescr()
  {
    return (String) getAttributeInternal(SOURCEANDTARGETSYSDESCR);
  }

  /**
   * Sets <code>value</code> as the attribute value for SourceAndTargetSysDescr.
   * @param value value to set the SourceAndTargetSysDescr
   */
  public void setSourceAndTargetSysDescr(String value)
  {
    setAttributeInternal(SOURCEANDTARGETSYSDESCR, value);
  }

  /**
   * Gets the attribute value for ProcessFlowDiagram, using the alias name ProcessFlowDiagram.
   * @return the value of ProcessFlowDiagram
   */
  public String getProcessFlowDiagram()
  {
    return (String) getAttributeInternal(PROCESSFLOWDIAGRAM);
  }

  /**
   * Sets <code>value</code> as the attribute value for ProcessFlowDiagram.
   * @param value value to set the ProcessFlowDiagram
   */
  public void setProcessFlowDiagram(String value)
  {
    setAttributeInternal(PROCESSFLOWDIAGRAM, value);
  }

  /**
   * Gets the attribute value for ProcessStepsDescr, using the alias name ProcessStepsDescr.
   * @return the value of ProcessStepsDescr
   */
  public String getProcessStepsDescr()
  {
    return (String) getAttributeInternal(PROCESSSTEPSDESCR);
  }

  /**
   * Sets <code>value</code> as the attribute value for ProcessStepsDescr.
   * @param value value to set the ProcessStepsDescr
   */
  public void setProcessStepsDescr(String value)
  {
    setAttributeInternal(PROCESSSTEPSDESCR, value);
  }

  /**
   * Gets the attribute value for DataMappings, using the alias name DataMappings.
   * @return the value of DataMappings
   */
  public String getDataMappings()
  {
    return (String) getAttributeInternal(DATAMAPPINGS);
  }

  /**
   * Sets <code>value</code> as the attribute value for DataMappings.
   * @param value value to set the DataMappings
   */
  public void setDataMappings(String value)
  {
    setAttributeInternal(DATAMAPPINGS, value);
  }

  /**
   * Gets the attribute value for AddProcessLogic, using the alias name AddProcessLogic.
   * @return the value of AddProcessLogic
   */
  public String getAddProcessLogic()
  {
    return (String) getAttributeInternal(ADDPROCESSLOGIC);
  }

  /**
   * Sets <code>value</code> as the attribute value for AddProcessLogic.
   * @param value value to set the AddProcessLogic
   */
  public void setAddProcessLogic(String value)
  {
    setAttributeInternal(ADDPROCESSLOGIC, value);
  }

  /**
   * Gets the attribute value for DataSelectAndFilterCrit, using the alias name DataSelectAndFilterCrit.
   * @return the value of DataSelectAndFilterCrit
   */
  public String getDataSelectAndFilterCrit()
  {
    return (String) getAttributeInternal(DATASELECTANDFILTERCRIT);
  }

  /**
   * Sets <code>value</code> as the attribute value for DataSelectAndFilterCrit.
   * @param value value to set the DataSelectAndFilterCrit
   */
  public void setDataSelectAndFilterCrit(String value)
  {
    setAttributeInternal(DATASELECTANDFILTERCRIT, value);
  }

  /**
   * Gets the attribute value for PreExtractCleanUpCrit, using the alias name PreExtractCleanUpCrit.
   * @return the value of PreExtractCleanUpCrit
   */
  public String getPreExtractCleanUpCrit()
  {
    return (String) getAttributeInternal(PREEXTRACTCLEANUPCRIT);
  }

  /**
   * Sets <code>value</code> as the attribute value for PreExtractCleanUpCrit.
   * @param value value to set the PreExtractCleanUpCrit
   */
  public void setPreExtractCleanUpCrit(String value)
  {
    setAttributeInternal(PREEXTRACTCLEANUPCRIT, value);
  }

  /**
   * Gets the attribute value for TestScenarioAcceptanceCrit, using the alias name TestScenarioAcceptanceCrit.
   * @return the value of TestScenarioAcceptanceCrit
   */
  public String getTestScenarioAcceptanceCrit()
  {
    return (String) getAttributeInternal(TESTSCENARIOACCEPTANCECRIT);
  }

  /**
   * Sets <code>value</code> as the attribute value for TestScenarioAcceptanceCrit.
   * @param value value to set the TestScenarioAcceptanceCrit
   */
  public void setTestScenarioAcceptanceCrit(String value)
  {
    setAttributeInternal(TESTSCENARIOACCEPTANCECRIT, value);
  }

  /**
   * Gets the attribute value for VolAndPerfReqs, using the alias name VolAndPerfReqs.
   * @return the value of VolAndPerfReqs
   */
  public String getVolAndPerfReqs()
  {
    return (String) getAttributeInternal(VOLANDPERFREQS);
  }

  /**
   * Sets <code>value</code> as the attribute value for VolAndPerfReqs.
   * @param value value to set the VolAndPerfReqs
   */
  public void setVolAndPerfReqs(String value)
  {
    setAttributeInternal(VOLANDPERFREQS, value);
  }

  /**
   * Gets the attribute value for InitFreqAndSchedReqs, using the alias name InitFreqAndSchedReqs.
   * @return the value of InitFreqAndSchedReqs
   */
  public String getInitFreqAndSchedReqs()
  {
    return (String) getAttributeInternal(INITFREQANDSCHEDREQS);
  }

  /**
   * Sets <code>value</code> as the attribute value for InitFreqAndSchedReqs.
   * @param value value to set the InitFreqAndSchedReqs
   */
  public void setInitFreqAndSchedReqs(String value)
  {
    setAttributeInternal(INITFREQANDSCHEDREQS, value);
  }

  /**
   * Gets the attribute value for SecurityAndControlsReqs, using the alias name SecurityAndControlsReqs.
   * @return the value of SecurityAndControlsReqs
   */
  public String getSecurityAndControlsReqs()
  {
    return (String) getAttributeInternal(SECURITYANDCONTROLSREQS);
  }

  /**
   * Sets <code>value</code> as the attribute value for SecurityAndControlsReqs.
   * @param value value to set the SecurityAndControlsReqs
   */
  public void setSecurityAndControlsReqs(String value)
  {
    setAttributeInternal(SECURITYANDCONTROLSREQS, value);
  }

  /**
   * Gets the attribute value for LogOutput, using the alias name LogOutput.
   * @return the value of LogOutput
   */
  public String getLogOutput()
  {
    return (String) getAttributeInternal(LOGOUTPUT);
  }

  /**
   * Sets <code>value</code> as the attribute value for LogOutput.
   * @param value value to set the LogOutput
   */
  public void setLogOutput(String value)
  {
    setAttributeInternal(LOGOUTPUT, value);
  }

  /**
   * Gets the attribute value for RestartProcedures, using the alias name RestartProcedures.
   * @return the value of RestartProcedures
   */
  public String getRestartProcedures()
  {
    return (String) getAttributeInternal(RESTARTPROCEDURES);
  }

  /**
   * Sets <code>value</code> as the attribute value for RestartProcedures.
   * @param value value to set the RestartProcedures
   */
  public void setRestartProcedures(String value)
  {
    setAttributeInternal(RESTARTPROCEDURES, value);
  }

  /**
   * Gets the attribute value for Appendix, using the alias name Appendix.
   * @return the value of Appendix
   */
  public String getAppendix()
  {
    return (String) getAttributeInternal(APPENDIX);
  }

  /**
   * Sets <code>value</code> as the attribute value for Appendix.
   * @param value value to set the Appendix
   */
  public void setAppendix(String value)
  {
    setAttributeInternal(APPENDIX, value);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDDocInfo()
  {
    return (RowIterator) getAttributeInternal(PSFDDOCINFO);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDDocRevApprovalHist()
  {
    return (RowIterator) getAttributeInternal(PSFDDOCREVAPPROVALHIST);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDInterfaces()
  {
    return (RowIterator) getAttributeInternal(PSFDINTERFACES);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDDistFinalDoc()
  {
    return (RowIterator) getAttributeInternal(PSFDDISTFINALDOC);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDErrors()
  {
    return (RowIterator) getAttributeInternal(PSFDERRORS);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDClosedIssues()
  {
    return (RowIterator) getAttributeInternal(PSFDCLOSEDISSUES);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDOpenIssues()
  {
    return (RowIterator) getAttributeInternal(PSFDOPENISSUES);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDNomenclature()
  {
    return (RowIterator) getAttributeInternal(PSFDNOMENCLATURE);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDDocEditHist()
  {
    return (RowIterator) getAttributeInternal(PSFDDOCEDITHIST);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDBusRules()
  {
    return (RowIterator) getAttributeInternal(PSFDBUSRULES);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getPsFDRelatedDocs()
  {
    return (RowIterator) getAttributeInternal(PSFDRELATEDDOCS);
  }

  /**
   * @param projId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(Integer projId)
  {
    return new Key(new Object[] { projId });
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("model.PsFDProjects");
  }


  /**
   * Add attribute defaulting logic in this method.
   * @param attributeList list of attribute names/values to initialize the row
   */
  protected void create(AttributeList attributeList)
  {
    super.create(attributeList);
  }
}

