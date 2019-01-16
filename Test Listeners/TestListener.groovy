import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

class TestListener {
	KeywordLogger log = new KeywordLogger()
	
	static cnt = 0
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def beforeTestcase(TestCaseContext testCaseContext) {
		WebUI.openBrowser('');
		WebUI.maximizeWindow();
		WebUI.navigateToUrl(GlobalVariable.URL);
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def afterTestcase(TestCaseContext testCaseContext) {
		WebUI.closeBrowser();
	}
	
	@AfterTestSuite
	def afterTestsuite(TestSuiteContext testSuiteContext) {
		log.logInfo("*****************************")
		log.logInfo(testSuiteContext.getStatus())
		if (testSuiteContext.getStatus().equals("ERROR")){
			cnt ++
		}
		
		log.logInfo(cnt as String)
		log.logInfo("*****************************")
	}
	
}