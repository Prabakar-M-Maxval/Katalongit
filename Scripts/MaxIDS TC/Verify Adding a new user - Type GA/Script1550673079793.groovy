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

WebUI.maximizeWindow()

'Open browser and navigate to Max IDS Application'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/')

'Input username'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_MEMBER LOGIN_form-contro'), 
    'maxval')

'Input password'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_MEMBER LOGIN_form-contro_1'), 
    'Maxval@123')

WebUI.waitForPageLoad(5000)

'Click on Login buton to navigate to dashboard page'
WebUI.click(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_Remember Password _btn b'))

WebUI.waitForPageLoad(5000)

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max IDS v4.0  Terms and Condit/input_idsqa_btn btn-info'))

WebUI.waitForPageLoad(8000)

'Verify Dashboard page is loaded completely or not'
dashboardlabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/div_Summary'))

println(dashboardlabel.trim())

WebUI.verifyEqual(dashboardlabel.trim(), 'Summary')

'Open Settings page'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/Settings/Index')

WebUI.waitForPageLoad(8000)

'Verify Settings page is loaded completely or not'
Settingspage = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/Settings page'))

WebUI.verifyEqual(Settingspage.trim(), 'Dashboard Settings')

'Wait for page load'
WebUI.waitForPageLoad(5000)

'open user list page'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/User/ListUser')

WebUI.waitForPageLoad(5000)

'Verify Users page is loaded completely or not'
userlistpage = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/Settings user page'))

WebUI.verifyEqual(userlistpage.trim(), 'Dashboard Settings Users')

WebUI.waitForPageLoad(8000)

'move t  Add new user'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/User/RegisterUser')

'Wait for page load'
Thread.sleep(8000)

'Input firstname'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_firstname'), firstName)

WebUI.waitForPageLoad(2000)

'Input lastname'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_lastname'), lastName)

WebUI.waitForPageLoad(2000)

'Input email address'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_email'), emailAddress)

WebUI.waitForPageLoad(2000)

'Input contactno'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_contactnumber'), contactnumber)

WebUI.waitForPageLoad(2000)

'Input username'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_username'), username)

WebUI.waitForPageLoad(2000)

'press the tab key'
WebUI.sendKeys(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_username'), Keys.chord(
        Keys.TAB))

'Enter the password'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_password'), password)

WebUI.waitForPageLoad(2000)

'press the tab key'
WebUI.sendKeys(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_password'), Keys.chord(
        Keys.TAB))

'Enter the confirm password'
WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_user_confirmpassword'), 
    password)

WebUI.waitForPageLoad(2000)

'click next button'
WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/link_user_nextbutton'))

'Wait for page load'
Thread.sleep(8000)

'Select the user type'
WebUI.selectOptionByLabel(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/dropdown_select_usertype'), 
    usertype, false)

Thread.sleep(6000)

'unchcek sned account info to user'
WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/input_checkbox_sendaccount'))

Thread.sleep(5000)

'click save button'
WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/link_saveuserprofile'))

'wait for page load'
WebUI.waitForPageLoad(8000)
'User assign to group'
WebUI.click(findTestObject('Object Repository/AssignGroupPopup/Page_Max-IDS - 4.3.6982.643/AssignGroup_main'))
Thread.sleep(7000)

'save the user details'
WebUI.click(findTestObject('Object Repository/AssignGroupPopup/Page_Max-IDS - 4.3.6982.643/button_chooseGroupandSave'))
WebUI.waitForPageLoad(8000)

'Verify user save success message'
usersuccessmessage = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/div_toastmessage'))

WebUI.verifyEqual(usersuccessmessage.trim(), '× Saved Successfully')

WebUI.closeBrowser()

