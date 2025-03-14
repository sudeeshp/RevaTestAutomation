import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS


//Open browser and launch the application
WebUI.openBrowser('')
WebUI.waitForPageLoad(25000)
WebUI.navigateToUrl('https://clienteks.ea.reva.ai/')

//WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))


WebUI.waitForPageLoad(10000)

//Enter User Name and Password
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_UserName'), Username)
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)

//Click on
//WebUI.waitForPageLoad(5000)
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Login/btn_LogIn'), 15)
WebUI.click(findTestObject('Object Repository/Page_Login/btn_LogIn'))

//landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)
WebUI.waitForPageLoad(10000)
WebUI.verifyTextPresent('Welcome, Author Ranga', false)
WebUI.waitForPageLoad(5000)

WebUI.closeBrowser()