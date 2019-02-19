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

WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/')

WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_MEMBER LOGIN_form-contro'), 
    'maxval')

WebUI.setText(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_MEMBER LOGIN_form-contro_1'), 
    'Maxval@123')

Thread.sleep(6000)


WebUI.click(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_Remember Password _btn b'))
Thread.sleep(5000)

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max IDS v4.0  Terms and Condit/input_idsqa_btn btn-info'))

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/i_Dashboard_fa fa-th-list'))

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/i_Category_fa fa-clone'))

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/span_MaxvalClient Admin'))

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/a_Logout'))

WebUI.closeBrowser()

