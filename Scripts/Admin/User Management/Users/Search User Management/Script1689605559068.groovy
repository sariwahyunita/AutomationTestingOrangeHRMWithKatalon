import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.callTestCase(findTestCase('General/Open browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Login/Login - valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Sidebar/a_Admin'))

WebUI.waitForElementPresent(findTestObject('Page - Admin/User Management/Users/h5_System Users'), 0)

WebUI.click(findTestObject('Page - Admin/Navbar/User Management/li_User Management'))

WebUI.click(findTestObject('Page - Admin/Navbar/User Management/li_Users'))

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.setText(findTestObject('Page - Admin/User Management/Users/Section - Search Users/input_Username'), keysearch)

WebUI.click(findTestObject('Page - Admin/User Management/Users/Section - Search Users/button_Search'))

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/Section - Table Users/span_Record Found'), 
    GlobalVariable.timeout)

WebUI.verifyElementText(findTestObject('Page - Admin/User Management/Users/Section - Table Users/div_username'), keysearch)

countOfElements = WebUiCommonHelper.findWebElements(findTestObject('Page - Admin/User Management/Users/Section - Table Users/div_username'), 
    5).size()

println(countOfElements)

countOfData = WebUI.concatenate(((['(', countOfElements - 1, ') Record Found']) as String[]), FailureHandling.STOP_ON_FAILURE)

println(countOfData)

WebUI.verifyElementText(findTestObject('Page - Admin/User Management/Users/Section - Table Users/span_Record Found'), countOfData)

WebUI.takeScreenshot()

