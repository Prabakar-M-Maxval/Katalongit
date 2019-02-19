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

WebUI.waitForPageLoad(5000)

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_MaxIDSv4.0  User Login/input_Remember Password _btn b'))

WebUI.waitForPageLoad(5000)

WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max IDS v4.0  Terms and Condit/input_idsqa_btn btn-info'))

WebUI.waitForPageLoad(8000)

dashboardlabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/div_Summary'))

println(dashboardlabel.trim())

WebUI.verifyEqual(dashboardlabel.trim(), 'Summary')

'Click Category menu'
WebUI.click(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/i_Dashboard_fa fa-th-list'))

WebUI.waitForPageLoad(6000)

categorylabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/ol_Dashboard            Catego'))
println(categorylabel.trim())
WebUI.verifyEqual(categorylabel.trim(), 'Dashboard Category')

WebUI.waitForPageLoad(9000)

'move compare&associate page'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/Associate/SearchForAssociation?PageFrom=RecordComparisonChart')
WebUI.waitForPageLoad(6000)
compareAssociatelabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/ol_Dashboard                Co'))
WebUI.verifyEqual(compareAssociatelabel.trim(), 'Dashboard Comparison Search')

'move Import menu'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/Import/Index')
WebUI.waitForPageLoad(6000)
importlabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/ol_Dashboard'))
WebUI.verifyEqual(importlabel.trim(), 'Dashboard Import')


'move Import with reference menu'
WebUI.navigateToUrl('https://maxids.maxval.com/Idsqa/ImportReferences/Index')
importwithreferencelabel = WebUI.getText(findTestObject('Object Repository/IDSRepository/Page_Max-IDS - 4.3.6982.643/Import with reference page header'))
WebUI.verifyEqual(importwithreferencelabel.trim(), 'Import with references')
WebUI.waitForPageLoad(6000)


WebUI.closeBrowser()

