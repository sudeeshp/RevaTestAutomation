import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.RenderingHints.Key

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
import org.openqa.selenium.Keys 
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.util.KeywordUtil

 //Open browser and launch the application
 WebUI.openBrowser('')
 WebUI.waitForPageLoad(15000)
 WebUI.navigateToUrl('https://clienteks.ea.reva.ai/')

 //Enter User Name and Password
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/txt_UserName'), 15)
 WebUI.setText(findTestObject('Object Repository/Page_Login/txt_UserName'), Username)
 WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)

 //WebUI.sendKeys(findTestObject('Object Repository/Page_Login/txt_Password'), Keys.chord(Keys.TAB))
 //WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/link_ForgotPassword'), 5)
 //WebUI.sendKeys(findTestObject('Object Repository/Page_Login/link_ForgotPassword'), Keys.chord(Keys.TAB))
 //WebUI.sendKeys(findTestObject('Object Repository/Page_Login/btn_SignIn'), Keys.chord(Keys.ENTER))

 //Click on SignIn button
 WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Login/btn_LogIn'), 15)
 WebUI.click(findTestObject('Object Repository/Page_Login/btn_LogIn'))
 WebUI.delay(10)
 //landingPage = WebUI.verifyElementPresent(findTestObject('Page_CuraAppointment/div_Appointment'), GlobalVariable.G_Timeout)
 WebUI.waitForPageLoad(10000)
 WebUI.verifyTextPresent('Welcome, Author Ranga', false)
 WebUI.waitForPageLoad(5000)

 WebUI.click(findTestObject('Object Repository/Page_Applications/btn_applications'))
 WebUI.click(findTestObject('Object Repository/Page_Applications/btn_insurance'))
 WebUI.click(findTestObject('Object Repository/Page_Applications/btn_testAutomation'))
 WebUI.click(findTestObject('Object Repository/Page_Applications/btn_dev'))
 WebUI.click(findTestObject('Object Repository/Page_Applications/btn_automationdev'))
 WebUI.click(findTestObject('Object Repository/Page_Applications/tab_policies'))


 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_newVersion'), 20)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_newVersion'))
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_addPermitPolicy'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_addPermitPolicy'))


 //***********************************Add First Permit Policy******************************************
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_add'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_add'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_PermitPolicy'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_PermitPolicy'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_Principal1'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_Principal1'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/click_Doctor'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/click_Doctor'))

 //WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName'), 'Arney Bilbery' , false)
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName'))

 String actualPrincipal = "Arney Bilbery"
 //WebUI.getText(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/click_AddAction'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/click_AddAction'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionType'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionType'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList'))

 String actualAction = "commentPatientRecord"

 //WebUI.getText(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList'))

 WebUI.refresh()
 WebUI.waitForPageLoad(30)

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/click_AddResource'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/click_AddResource'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/enter_resource'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/enter_resource'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_resourceFromList'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_resourceFromList'))

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_codeAEditor'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_codeAEditor'))

 String PrincipalName = WebUI.getText(findTestObject('Object Repository/Page_PolicyDesigner/get_Principal'))
 String ActionName = WebUI.getText(findTestObject('Object Repository/Page_PolicyDesigner/get_Action'))

 //KeywordUtil.logInfo(PrincipalName)
 System.out.println("Name in Editor is:" + PrincipalName)
 System.out.println("Action in Editor is:" + ActionName)

 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/close_codeEditor'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/close_codeEditor'))

 //WebUI.verifyTextContains(actualPrincipal, PrincipalName)
 //WebUI.verifyTextContains(actualAction, ActionName, FailureHandling.STOP_ON_FAILURE)

 //if(actualPrincipal.equals(actualPrincipal) && ActionName.equals(actualAction)) {
 if(actualPrincipal.contains(actualPrincipal) && ActionName.contains(actualAction)) {
	System.out.println("Displaying selected Name and Action in Code Editor ")
 } else {
	System.out.println("NOT Displaying selected Name and Action in Code Editor ")
 }

 //***********************************Add Second Permit Policy******************************************
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_add'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_add'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/btn_PermitPolicy'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/btn_PermitPolicy'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_Principal1'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_Principal1'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/click_Doctor'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/click_Doctor'))
 
 //WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName'), 'Arney Bilbery' , false)
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName1'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_DoctorName1'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/click_AddAction1'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/click_AddAction1'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionType1'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionType1'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList'), 10)
 WebUI.click(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList1'))
 
 //WebUI.sendKeys(findTestObject('Object Repository/Page_PolicyDesigner/select_ActionFromList1'), Keys.chord(Keys.TAB))
 WebUI.refresh()
 WebUI.waitForPageLoad(30)
 
 TestObject source = findTestObject('Object Repository/Page_PolicyDesigner/drag_Source1')
 TestObject target = findTestObject('Object Repository/Page_PolicyDesigner/drag_target1')
 WebUI.dragAndDropToObject(source, target)

 //WebUI.closeBrowser()