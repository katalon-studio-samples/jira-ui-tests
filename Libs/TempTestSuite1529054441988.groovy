import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Simple Examples/Login test suite with data-driven-approach')

suiteProperties.put('name', 'Login test suite with data-driven-approach')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/trongbui/katalon/sources/katalon-studio-samples/jira-ui-tests/Reports/Simple Examples/Login test suite with data-driven-approach/20180615_162041/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Simple Examples/Login test suite with data-driven-approach', suiteProperties, [new TestCaseBinding('Test Cases/Simple Examples/Login Test/Data-driven examples/Login with username and password as a default value of variables - Iteration 1', 'Test Cases/Simple Examples/Login Test/Data-driven examples/Login with username and password as a default value of variables',  [ 'password' : '8eml3nBz19rJ6kP8oCYK' , 'username' : 'demo@katalon.com' ,  ]), new TestCaseBinding('Test Cases/Simple Examples/Login Test/Data-driven examples/Login with username and password as a default value of variables - Iteration 2', 'Test Cases/Simple Examples/Login Test/Data-driven examples/Login with username and password as a default value of variables',  [ 'password' : '1QpnA1G2cOTSJQLE4U3A' , 'username' : 'tom@katalon.com' ,  ])])
