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

WebUI.navigateToUrl('https://meta.vn/sua-tam-c913')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Sa tm Chnh hng, Gi tt  META.vn/img_thumb-list is-thumb'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Sa tm tho dc Nature Queen (100ml) - META.vn/button_t mua'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_name'), name_cus)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_phone'), phone_cus)

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/span_TnhThnh ph'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/li_Nng'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/li_Qun Sn Tr'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/li_Phng Phc M'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_address'), address_cus)

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_chkvat'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_t_code'), code)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_t_name'),companyname)

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_t_name'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_t_address'), companyadd)

WebUI.setText(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/input_t_email'), email)

WebUI.click(findTestObject('Object Repository/Checkout/Page_META.vn - Mua sm trc tuyn/a_Gi n hng'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_t hng thnh cng/button_B qua'))