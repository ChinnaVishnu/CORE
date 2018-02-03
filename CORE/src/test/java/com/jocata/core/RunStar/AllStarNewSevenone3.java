package com.jocata.core.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.jocata.core.Mis.Latest.BenchmarksReport;
import com.jocata.core.Mis.Latest.CaseDetailsReport;
import com.jocata.core.Mis.Latest.RuleSummereyReport;
import com.jocata.core.Mis.Latest.UserCaseDetailsReport;
import com.jocata.core.existingfuctions.AddBenchMarkReportsChanges2;
import com.jocata.core.existingfuctions.AddBenchMark_01;
import com.jocata.core.existingfuctions.AddruleChangesFuctionaltiy;
import com.jocata.core.existingfuctions.AdvancedAddBenchMark;
import com.jocata.core.existingfuctions.AdvancedAddBenchMark2;
import com.jocata.core.exportexcels.CustomerPeerProfile;
import com.jocata.core.exportexcels.DashboardTask;
import com.jocata.core.exportexcels.NetworkExportGraph;
import com.jocata.core.exportexcels.TrancastionRulePopUpExport;
import com.jocata.core.grid.ADDRolesModify;
import com.jocata.core.grid.AccountTrunover;
import com.jocata.core.grid.AuditLogModuleName;
import com.jocata.core.grid.GridAddReport2;
import com.jocata.core.grid.GridAddReport3;
import com.jocata.core.grid.IncludingPermissions2;
import com.jocata.core.grid.RiskConfigurationEdit;
import com.jocata.core.grid.UserPermissionsReport;
import com.jocata.core.misreports.AccountSummaryReport;
import com.jocata.core.misreports.AddReportCaseDetailsReport;
import com.jocata.core.misreports.AddReportDashboard;
import com.jocata.core.misreports.AddReportEventDetailsReport;
import com.jocata.core.misreports.AddReportRuleSummary;
import com.jocata.core.misreports.AddReportUserCaseDetailsReport;
import com.jocata.core.misreports.AddReportsBenchMark;
import com.jocata.core.misreports.EventdetailsReport;
import com.jocata.core.misreports.Extraction.RuleSummeryReportExtraction;
import com.jocata.core.misreports.Extraction.UserDetailsReportExtraction;
import com.jocata.core.misreports.excatpdf.AddReportCaseDetailsReportsLatest;
import com.jocata.core.misreports.excatpdf.AddReportUserCaseDetailsReportLatest;
import com.jocata.core.misreports.excatpdf.UsercaseDetailsReport2;
import com.jocata.core.misreports.excatpdf.caseDetailsReport3;
import com.jocata.core.reportsdownload.MisReportsDownload;
import com.jocata.core.screens.CustomerDetailsProfile;
import com.jocata.core.screens.ExclusionList;
import com.jocata.core.screens.FalsePositiveManager;
import com.jocata.core.screens.ThresholdParametersRule;
import com.jocata.core.scripts.AddBenchMarkJocata;
import com.jocata.core.scripts.AdvanceSearchJocataSe;
import com.jocata.core.scripts.AdvanceSearchJocataSe2;
import com.jocata.core.scripts.CoreNavigation;
import com.jocata.core.scripts.CustomerFieldsJocata;
import com.jocata.core.scripts.NewCreateRuleJocata;
import com.jocata.core.scripts.SimpleSearchJocata;
import com.jocata.core.scripts.SimpleSearchJocata2;
import com.jocata.core.scripts.StarCase7Jocata;
import com.jocata.core.scripts.StarCase8Jocata;
import com.jocata.core.scripts.customerfields;
import com.jocata.core.workflow.RiseSTR;
import com.jocata.core.workflow.RiseSTR2;
import com.jocata.core.workflow.RiseSTR3;
import com.jocata.core.workflow.WorkFLowActionsReassign;
import com.jocata.core.workflow.WorkFLowAndDispActions;
import com.jocata.core.workflow.WorkFLowFalsePositive;
import com.jocata.core.workflow.WorkFllowActionSuggestFalsePostive;
import com.jocata.core.workflow.WorkFlowActionsForWard;
import com.jocata.core.workflow.WorkFlowClose;
import com.jocata.core.workflow.WorkFlowRaiseSTR;
import com.jocata.star.TaskboardSort.RuleBuliderUpdate;





public class AllStarNewSevenone3 {

	public static void main(String[] args) {
		

	 TestListenerAdapter tla = new TestListenerAdapter();
	    TestNG testng = new TestNG();
	     Class[] classes = new Class[]{
	    		 
	    		 NewCreateRuleJocata.class,
	    		
	    		 
	    		 RuleBuliderUpdate.class,
	    		 ThresholdParametersRule.class,
	    		 
	    		 //AdvancedAddBenchMark2.class,
	    		 AddBenchMarkReportsChanges2.class,
	    		 
	    		 
	    		 CoreNavigation.class,
	    		 AdvanceSearchJocataSe2.class,
	    		 SimpleSearchJocata2.class,
	    		 customerfields.class,
	    		 AccountSummaryReport.class,
	    		 EventdetailsReport.class,
                 ActivityGraphExportExcel.class,
	    		 TrancastionRulePopUpExport.class,
	    		 AccountTrunover.class,
	    		 AuditLogModuleName.class,
	    		 
	    		 
	    		 
	    		 GridAddReport3.class,
	    		 ADDRolesModify.class,
	    		 
	    		 
	    		 
	    		 RiskConfigurationEdit.class,
	    		 
	    		 UserPermissionsReport.class,
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	    		 
	   		 
//					AddBenchMarkBenchMarkRun.class, AddReportCaseDetailsReportsLatest.class, AddReportDashboard.class,
//					AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
//					AddReportUserCaseDetailsReportLatest.class,

				//	MisReportsDownload.class,
					
					/*UsercaseDetailsReport2.class,
					caseDetailsReport3.class*/
					
	    		//.............................StarTestScripts...........................................// 
	    		 
	    		
	    		 
	    		 //...............................WorkFlow Actions....................................//
	    		 
	    		 
	    		// WorkFlowClose.class,//pass
	    		 
	    		 
	    		 
	    		// WorkFLowFalsePositive.class,//skipping
	    		 //WorkFlowRaiseSTR.class,//skipping
	    		 
	    		/* RiseSTR3.class,
	    		 WorkFlowActionsForWard.class,//pass
	    		*/// WorkFllowActionSuggestFalsePostive.class,//skipping
	    		 
	    		 
	    		 
	    		 //TrancastionRulePopUpExport.class,//pass
	    		// WorkFLowActionsReassign.class,//pass
	    		
	    		 
	    		 //...........................Add Reports.............................................//
	    		 
	    	    
	    		
	    		 
	           
	             };
	     testng.setTestClasses(classes);
	     testng.addListener(tla);
	     testng.run();
	    }	
	
}
