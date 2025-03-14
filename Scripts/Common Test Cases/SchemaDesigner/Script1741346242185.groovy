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

WebUI.navigateToUrl('https://clienteks.ea.reva.ai/auth/signin?callbackUrl=%2F')

WebUI.setText(findTestObject('Object Repository/SchemaDesigner/Page_Signin/input_Username_username'), 'ranga-author')

WebUI.setEncryptedText(findTestObject('Object Repository/SchemaDesigner/Page_Signin/input_Password_password'), 'cLkAPMWhmF2ao2P62YLL3w==')

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_View more_chakra-icon css-1yezc6o'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Insurance'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Test-Automation'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_dev'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_automationdev'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Policies'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/button_New Version'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Add permit policy'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/input_text'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_Doctor'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_Ailey Pakeman'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-l6eedg'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/input_text'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_assignPatient'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-l6eedg'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/input_text'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_ALL'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Reset Node_chakra-icon css-1ygo8fb'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Permit Policy'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/input_text'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_Doctor'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_Arney Bilbery'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-l6eedg_1'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/input_text'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/li_commentPatientRecord'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-veqsio'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/span_Ailey Pakeman'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/span_assignPatient'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Permit Doctor-Ailey Pakeman to assignPati_c8417c'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/p_Permit Doctor-Ailey Pakeman to assignPati_c8417c'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-n059si'))

WebUI.click(findTestObject('Object Repository/SchemaDesigner/Page_Reva.ai/svg_Delete_chakra-icon css-veqsio'))

