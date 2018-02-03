package com.jocata.core.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

import com.jocata.core.existingfuctions.AddBenchMarkReportsChanges2;
import com.jocata.core.existingfuctions.AddruleChangesFuctionaltiy;
import com.jocata.core.existingfuctions.AdvancedAddBenchMark;
import com.jocata.core.existingfuctions.AdvancedAddBenchMark2;
import com.jocata.core.exportexcels.CustomerPeerProfile;
import com.jocata.core.exportexcels.DashboardTask;
import com.jocata.core.exportexcels.NetworkExportGraph;
import com.jocata.core.exportexcels.TrancastionRulePopUpExport;
import com.jocata.core.grid.ADDRolesModify;
import com.jocata.core.grid.GridAddReport2;
import com.jocata.core.grid.GridAddReport3;
import com.jocata.core.grid.IncludingPermissions2;
import com.jocata.core.includeexculde.AddDelete3;
import com.jocata.core.includeexculde.GridModules;
import com.jocata.core.includeexculde.STARModules;
import com.jocata.core.misreports.AddBenchMarkBenchMarkRun;
import com.jocata.core.misreports.AddReportCaseDetailsReport;
import com.jocata.core.misreports.AddReportDashboard;
import com.jocata.core.misreports.AddReportEventDetailsReport;
import com.jocata.core.misreports.AddReportRuleSummary;
import com.jocata.core.misreports.AddReportUserCaseDetailsReport;
import com.jocata.core.misreports.AddReportsBenchMark;
import com.jocata.core.reportsdownload.MisReportsDownload;
import com.jocata.core.screens.CustomerDetailsProfile;
import com.jocata.core.screens.ExclusionList;
import com.jocata.core.screens.FalsePositiveManager;
import com.jocata.core.scripts.CustomerFieldsJocata2;
import com.jocata.core.scripts.NewCreateRuleJocata;
import com.jocata.core.scripts.SimpleSearchJocata;
import com.jocata.core.scripts.StarCase7Jocata;
import com.jocata.core.scripts.StarCase8Jocata;
import com.jocata.core.scripts.StarNavigationJocata;
import com.jocata.core.workflow.RiseSTR3;
import com.jocata.core.workflow.WorkFLowActionsReassign;
import com.jocata.core.workflow.WorkFLowAndDispActions;
import com.jocata.core.workflow.WorkFLowFalsePositive;
import com.jocata.core.workflow.WorkFlowActionsForWard;
import com.jocata.core.workflow.WorkFlowClose;

public class AllStarNewSevenoneAdvanced2 {

	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		Class[] classes = new Class[] {

				/*// .............................StarTestScripts................................................................//
				AdvancedAddBenchMark2.class,
				//AdvancedAddBenchMark.class, 
				AdvanceSearchStar2.class,
				CustomerFieldsJocata2.class,
				NewCreateRuleJocata.class, SimpleSearchJocata.class, StarCase7Jocata.class, StarCase8Jocata.class,
				StarNavigationJocata.class,

				// ...............................WorkFlow....................................................................//

				WorkFlowClose.class, 
				WorkFLowFalsePositive.class,

				
				 * // WorkFLowFalsePositive.class,//skipping
				 * //WorkFlowRaiseSTR.class,//skipping
				 * 
				 * // RiseSTR2.class,
				 * 
				 * // RiseSTR.class,
				 * 
				 

				RiseSTR3.class,

				WorkFlowActionsForWard.class, 
				// WorkFllowActionSuggestFalsePostive.class,
				WorkFLowAndDispActions.class,
				AddDelete3.class,
				WorkFLowActionsReassign.class, 

				// .............................................Reports.....................................................................................................//

				AddBenchMarkBenchMarkRun.class, AddReportCaseDetailsReport.class, AddReportDashboard.class,
				AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
				AddReportUserCaseDetailsReport.class,

				// .................................Exisiting..................................................................//

				
				AddruleChangesFuctionaltiy.class, AddBenchMarkReportsChanges2.class,

				// ......................................Screens..............................................................//

				CustomerDetailsProfile.class, ExclusionList.class, FalsePositiveManager.class,

				// ......................................ExportExcels.........................................................//

				CustomerPeerProfile.class, DashboardTask.class, NetworkExportGraph.class,
				TrancastionRulePopUpExport.class,

				// ..........................................Grid..............................................................//

				GridAddReport3.class, ADDRolesModify.class, 
				GridModules.class,
				STARModules.class,
				
				//IncludingPermissions2.class,

				//............................................... Download.....................................................//

				//MisReportsDownload.class,
				 * 
*/

				/*AddBenchMarkBenchMarkRun.class, AddReportCaseDetailsReport.class, AddReportDashboard.class,
				AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
				AddReportUserCaseDetailsReport.class,*/
				
				ADDRolesModify.class,
				GridModules.class,
				STARModules.class,
				
				
		};
		testng.setTestClasses(classes);
		testng.addListener(tla);
		testng.run();
	}

}
