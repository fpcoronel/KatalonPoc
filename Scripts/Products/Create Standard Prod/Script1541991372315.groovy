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

WebUI.click(findTestObject('Object Repository/Page_Lime Light CRM/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Lime Light CRM/a_Products_1'))

WebUI.click(findTestObject('Page_Products/button_Actions'))

WebUI.click(findTestObject('Page_Products/a_Add'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_Products/select_Product                '), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Products/select_Product'), '0', true)

WebUI.click(findTestObject('Page_Products/button_NEXT'))

WebUI.setText(findTestObject('Page_Add Product/input_Name_product_name'), 'AUT' + today + ' Pat-STD')

WebUI.setText(findTestObject('Page_Add Product/input_SKU_product_sku'), 'SKU-AUT1234')

WebUI.selectOptionByValue(findTestObject('Page_Add Product/select_Select Category'), '17', true)

WebUI.setText(findTestObject('Page_Add Product/input_Price (MSRP)_product_pri'), '10')

WebUI.setText(findTestObject('Page_Add Product/input_Max Qty._product_max_qty'), '5')

WebUI.click(findTestObject('Page_Add Product/input_Taxable_product_taxable'))

WebUI.click(findTestObject('Page_Add Product/input_Shippable_product_shippa'))

WebUI.click(findTestObject('Page_Add Product/button_Save'))

not_run: WebUI.click(findTestObject('Page_Edit Product/button_Close'))

WebUI.verifyElementPresent(findTestObject('Page_Edit Product/Created_By'), 0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Edit Product/p_312'))

WebUI.closeBrowser()

