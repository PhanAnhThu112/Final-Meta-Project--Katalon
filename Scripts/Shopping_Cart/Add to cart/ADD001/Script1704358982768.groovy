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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://meta.vn/')

//WebUI.click(findTestObject('null'))

//WebUI.click(findTestObject('Object Repository/Page_META.vn - Mua sm trc tuyn/div_Tip tc vi Google'))

//WebUI.setText(findTestObject('Object Repository/Page_Sign in - Google Accounts/input_identifier'), 'thuy.bui24@student.passerellesnumeriques.org')

//WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/div_VfPpkd-RLmnJb'))

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in - Google Accounts/input_Passwd'), '0qqg/EH1/8oTayJsh4sAYQ==')

//WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/div_VfPpkd-RLmnJb_1'))

//WebUI.click(findTestObject('Page_Mua hng online, Mua sm trc tuyn gi tt nht/li_Tr gp490KMy git Samsung Inverter 9.5kg WA95CG4545BDSV (Model 2023)Samsung5.500.000-85.990.000Kt thc sau6 ngy Cn 7(4)5.500.000 5.990.000'))

WebUI.click(findTestObject('Object Repository/Page_My nho bt Gourmetmaxx SM-1504 (5 lt, 1_3dfe4d/button_'))

WebUI.click(findTestObject('Object Repository/Page_My nho bt Gourmetmaxx SM-1504 (5 lt, 1_d195ff/a_Cho vo gi'))

WebUI.click(findTestObject('Object Repository/Page_My nho bt Gourmetmaxx SM-1504 (5 lt, 1_d195ff/i_fa fa-shopping-cart'))

WebUI.closeBrowser()