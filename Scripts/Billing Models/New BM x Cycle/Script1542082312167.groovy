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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

DateFormat dateFormat = new SimpleDateFormat('MM/dd')

Date date = new Date()

String today = dateFormat.format(date)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test-dnvb.qa1.limelightcrm.com/admin/login.php')

WebUI.setText(findTestObject('Page_Sign-In/input_Username_admin_name'), 'patrobot')

WebUI.setEncryptedText(findTestObject('Page_Sign-In/input_Password_admin_pass'), 'V35d/XPbheDNZFGbWD8Aqw==')

WebUI.click(findTestObject('Page_Sign-In/button_Log In'))

WebUI.click(findTestObject('Object Repository/Billing Models/a_Products'))

WebUI.click(findTestObject('Object Repository/Billing Models/a_Billing Models'))

WebUI.click(findTestObject('Object Repository/Billing Models/button_Actions'))

WebUI.click(findTestObject('Object Repository/Billing Models/a_Add'))

WebUI.setText(findTestObject('Object Repository/Billing Models/input_Name_resource_name'), ('AUT' + today) + '-BMXCYCLE')

WebUI.selectOptionByValue(findTestObject('Billing Models/select_Bill by cycle'), '1', true)

WebUI.setText(findTestObject('Object Repository/Billing Models/input_Subscription will bill o'), '2')

WebUI.click(findTestObject('Object Repository/Billing Models/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Billing Models/p_11122018 created by Pat Robo'), 0)

WebUI.closeBrowser()

