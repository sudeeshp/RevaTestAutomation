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

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Signin/input_Username_username'), 'sudesh-author')

WebUI.setEncryptedText(findTestObject('Object Repository/ManageApplications/Page_Signin/input_Password_password'), 'GFJyg3M2wKqP8Jbq7fECHw==')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Signin/input_Forgot your password_signInSubmitButton'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/p_Welcome, Sudesh R'), 'Welcome, Sudesh R')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/svg_View more_chakra-icon css-1yezc6o'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/p_Manage Applications'), 0)

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_New Application'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/p_Basic Information'), 0)

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/input__name'), 'Test Automation One')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_Search  select category_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_Insurance'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/path'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_Consulting'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_Search  select application ower(s)_sele_302eca'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_sudesh-author'))

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/textarea_This is for testing the application'), 
    'This is for testing the application')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Continue'))

WebUI.waitForElementPresent(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/p_Environment(s)'), 0)

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Environment'))

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/input__name'), 'TestEnv One')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/span_Policy Store_chakra-checkbox__control _b414cb'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Create'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Environment_1'))

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/input__name'), 'TestEnv Two')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Policy Store'))

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/input__policyStoreName'), 'TestPolicyOne')

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/textarea_q'), 'q')

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/textarea__description'), '')

WebUI.setText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/textarea_This is for testing the policy'), 
    'This is for testing the policy')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_Choose a connection_css-19bb58m'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_us-east-2-261741375814-DO-NOT-DELETE'))

WebUI.verifyElementText(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_261741375814'), '261741375814')

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Save'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/span_us-east-2_chakra-checkbox__control css_4750b3'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/button_Create_1'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/div_TestEnv One_schemabuilder inputWrapper _16e37c'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/svg_Continue_chakra-icon css-1wygei0'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/path'))

WebUI.click(findTestObject('Object Repository/ManageApplications/Page_Reva.ai/input_text'))

