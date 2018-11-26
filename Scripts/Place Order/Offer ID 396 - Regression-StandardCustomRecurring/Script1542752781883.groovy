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

'Opens web browser\r\n'
WebUI.openBrowser('https://test-dnvb.qa1.limelightcrm.com/admin/login.php?')

'Enters Username\r\n'
WebUI.setText(findTestObject('LL - Log In/Username Field'), 'mattauto')

'Enters Password'
WebUI.setText(findTestObject('LL - Log In/Password Field'), 'Testing123!')

'Clicks \'Log In\''
WebUI.click(findTestObject('LL - Log In/Log In Button'))

'Verifies that Limelight header is present'
WebUI.waitForElementVisible(findTestObject('LL - Dashboard/Dashboard Header'), 0)

'Navigates to Place Order Page'
WebUI.navigateToUrl('https://test-dnvb.qa1.limelightcrm.com/admin/placeorder.php')

'Selects Regression Campaign ID 137'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Campaign Select'), '137', false)

'Selects Offer ID 396'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Offer Select'), '396', false)

WebUI.delay(3)

'Ensures that the Trial checkbox is present before clicking\r\n'
WebUI.waitForElementVisible(findTestObject('LL -Place Order Page/Trial Checkbox'), 5)

'Unchecks the Trial checkbox'
WebUI.click(findTestObject('LL -Place Order Page/Trial Checkbox'))

'Selects Bill by Cycle Billing Model\r\n'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Billing Model Select'), '240', false)

'Selects Main Product ID 207'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Main Product Select'), '207', false)

'Enters Step Number for Main Product'
WebUI.setText(findTestObject('LL -Place Order Page/Step Number Input'), '123456789')

'Selects Shipping Method ID 1\r\n'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Shipping Method Select'), '2', false)

'Enters Shipping First Name\r\n'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping First Name Input'), 'Matt')

'Enters Shipping Last Name\r\n'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping Last Name Input'), (GlobalVariable.ReleaseNum + '-') + GlobalVariable.TestingStatus)

'Enters Shipping Address\r\n'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping Address Input'), '123 Street')

'Enters Shipping Address 2'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping Address 2 Input'), 'APT 123')

'Enters Shipping City'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping City Input'), 'Tampa')

'Enters Shipping Zip Code\r\n'
WebUI.setText(findTestObject('LL -Place Order Page/Shipping Zip Code Input'), '12345')

'Selects Shipping Country'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Shipping Country Select'), '223', false)

'Selects Shipping State\r\n'
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Shipping State Select'), 'FL', false)

'Enters Phone #'
WebUI.setText(findTestObject('LL -Place Order Page/Phone Input'), '555-555-5555')

'Enters Email address\r\n'
WebUI.setText(findTestObject('LL -Place Order Page/Email Input'), (('matt@' + GlobalVariable.ReleaseNum) + GlobalVariable.TestingStatus) + 
    '.com')

'Clicks arrow for AFID/SID area\r\n'
WebUI.click(findTestObject('LL -Place Order Page/Affiliate-Sub-Affiliate Checkbox'))

'Enters AFID value \'AFID\''
WebUI.setText(findTestObject('LL -Place Order Page/AFID Input'), 'AFID')

'Enters SID value \'SID\''
WebUI.setText(findTestObject('LL -Place Order Page/SID Input'), 'SID')

'Selects Payment Type \'Visa\''
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Payment Type Select'), 'visa', false)

'Enters Credit Card Number \'5555 5555 5555 5555\''
WebUI.setText(findTestObject('LL -Place Order Page/Credit Card Number Input'), '5555555555555555')

'Selects Expiration Date Month \'01\''
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Expiration Date-Month Select'), '01', false)

'Selects Expiration Date Month \'2030\''
WebUI.selectOptionByValue(findTestObject('LL -Place Order Page/Expiration Date-Year Select'), '30', false)

'Enters Security Code \'1234\''
WebUI.setText(findTestObject('LL -Place Order Page/Security Code Input'), '1234')

'Clicks \'Process Order\''
WebUI.click(findTestObject('LL -Place Order Page/Process Order Button'))

'Verifies that \'Place Order SUCCESS\' is present'
WebUI.verifyTextPresent('Place Order \'SUCCESS\'', false)

'Clicks Order ID link'
WebUI.click(findTestObject('LL -Place Order Page/Order ID Link'))

'Allows Orders page to load'
WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

'Verifies that the proper Order History Note is present indicating the Product, Offer, and Billing Model used'
WebUI.verifyTextPresent('By Lime Light CRM API - Product 207 was purchased using offer 396, billing model 240. ', false)

