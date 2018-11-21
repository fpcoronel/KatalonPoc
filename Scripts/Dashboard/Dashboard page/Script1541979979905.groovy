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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-dnvb.qa1.limelightcrm.com/admin/login.php')

WebUI.setText(findTestObject('Page_Sign-In/input_Username_admin_name'), 'patrobot')

WebUI.setEncryptedText(findTestObject('Page_Sign-In/input_Password_admin_pass'), 'V35d/XPbheDNZFGbWD8Aqw==')

WebUI.click(findTestObject('Page_Sign-In/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/h1_Dashboard'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Products'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Customers'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Payments'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Insights'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_Settings'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Expand'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Help'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/a_New Order'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_Pat Robot - DO NOT TOUCH'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Dashboard/div_ 2018 Lime Light CRM Inc.'), 0)

WebUI.closeBrowser()

