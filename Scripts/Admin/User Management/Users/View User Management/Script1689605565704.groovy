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

WebUI.click(findTestObject('Sidebar/a_Admin'))

WebUI.waitForElementVisible(findTestObject('Page - Admin/User Management/Users/h5_System Users'), 0)

WebUI.click(findTestObject('Page - Admin/Navbar/User Management/li_User Management'))

WebUI.click(findTestObject('Page - Admin/Navbar/User Management/li_Users'))

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/h5_System Users'), 0)

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/div_UsernameAscendingDecending'), 0)

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/div_User RoleAscendingDecending'), 0)

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/div_Employee NameAscendingDecending'), 0)

WebUI.verifyElementPresent(findTestObject('Page - Admin/User Management/Users/div_StatusAscendingDecending'), 0)

WebUI.takeScreenshot()

