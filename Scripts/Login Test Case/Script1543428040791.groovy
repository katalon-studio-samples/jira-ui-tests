import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://id.atlassian.com/login?continue=https%3A%2F%2Fkatalon.atlassian.net%2Flogin%3FredirectCount%3D1')

WebUI.setText(findTestObject('Object Repository/Page_Log in to continue - Log in wi/input_Email_username'), 'demo@katalon.com')

WebUI.verifyElementText(findTestObject('Page_Log in to continue - Log in wi/button_Continue'), 'Continue')

WebUI.click(findTestObject('Object Repository/Page_Log in to continue - Log in wi/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'demo@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'KLAk0b2rAgvA1EV7zgpKiS/uV+5nc48Y')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Forgot my password_idSIB'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_concat(Don  t show this'))

WebUI.verifyElementText(findTestObject('Page_System dashboard - Jira/h1_System dashboard'), 'System dashboard')

WebUI.closeBrowser()

