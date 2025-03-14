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
import org.openqa.selenium.Alert

 //Open browser and launch the application
 WebUI.openBrowser('')
 WebUI.waitForPageLoad(15000)
 WebUI.navigateToUrl('https://clienteks.ea.reva.ai/')

 //Enter User Name and Password
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Login/txt_UserName'), 15)
 WebUI.setText(findTestObject('Object Repository/Page_Login/txt_UserName'), Username)
 WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)

 //Click on SignIn button
 WebUI.click(findTestObject('Object Repository/Page_Login/btn_LogIn'))

 WebUI.waitForPageLoad(10000)
 WebUI.verifyTextPresent('Welcome, Author Ranga', false)
 WebUI.waitForPageLoad(5000)

 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_cloud'))
 
 //WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_integration'))
 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_integrations'))
	 
 String IntName = "AutomationSample5-us-east-1-";
 String AWSaccnt = "261741375814";
  
 WebUI.setText(findTestObject('Object Repository/Page_Cloud_ImportData/txt_integrationName'), IntName +" "+ AWSaccnt)
 WebUI.setText(findTestObject('Object Repository/Page_Cloud_ImportData/txt_AWSaccountNumber'), AWSaccnt)
 WebUI.setText(findTestObject('Object Repository/Page_Cloud_ImportData/txt_Description'), 'Automation Test ')
 WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Cloud_ImportData/select_AWSregion'), 'US East (N. Virginia)' , false)
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Next'), 20)
 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Next'))
 
 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cloud_ImportData/chkbox_confirm'), 20)
 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/chkbox_confirm'))
 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Activate'))
 
 String SuccessMsg = "  is ready to use. Policy stores are being discovered in the background. Close this panel to view and manage your connection.";
 String UISuccessMsg = WebUI.getText(findTestObject('Object Repository/Page_Cloud_ImportData/verify_SuccessMsg'))
 WebUI.delay(10)
 if(UISuccessMsg.equals(SuccessMsg))
 {
	System.out.println("Success Message Displayed")	; 	
	WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Close2'))
 } else {
	 System.out.println("Success Message NOT Displayed");
 }
 String status = "Enabled";
 String status1 = "Import in Progress"
 String IntegrationNameLabel = WebUI.getText(findTestObject('Object Repository/Page_Cloud_ImportData/label_IntegrationName'))
 System.out.println("Created Integration name is: " + IntegrationNameLabel)	;
 if(IntegrationNameLabel.equals(IntName+" "+AWSaccnt))
	 { 
		System.out.println("Integration created SUCCESSFULLY")	;	
		WebUI.refresh()
		WebUI.waitForPageLoad(10)
			String IntegrationStatus = WebUI.getText(findTestObject('Object Repository/Page_Cloud_ImportData/label_IntegrationStatus'))
			System.out.println("Created Integration status is: " + IntegrationStatus)	;
			
			 if(IntegrationStatus.equals(status1))
			 {
				 System.out.println("Newly created Integration data is imported SUCCESSFULLY")	;
				 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_IntegrationEdit'))
				 for(int j=1; j<=50;j++)
				 { 
					 System.out.println("Iterating "+ j +" time to check Import to be completed")
					 if(WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cloud_ImportData/btn_RefreshStatus'), 20))	 
						 {
							 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_RefreshStatus'))
							 WebUI.delay(20)
							
						 } else 
						 {
							System.out.println("importing connections completed")	;
							String ImportCount = WebUI.getText(findTestObject('Object Repository/Page_Cloud_ImportData/label_ConnectionCount'))
							String ConnectionCount =  ImportCount.substring(2, 6)
							System.out.println("imported connections are :" + ConnectionCount); 
							WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Close'))
							break;
						 }
				 }
				 WebUI.refresh()
				 WebUI.waitForPageLoad(10)
				 WebUI.delay(10)
				 String newIntegrationStatus = WebUI.getText(findTestObject('Object Repository/Page_Cloud_ImportData/label_IntegrationStatus'))
				 if(newIntegrationStatus.equals(status))
				 { 
				 System.out.println("Import connections completed and status is changed to ENABLED");
				 WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cloud_ImportData/btn_IntegrationEdit'), 20)
				 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_IntegrationEdit'))
				 }else 
				 {
					 System.out.println("FAILURE: status is NOT changed to ENABLED");
				 }
			 } else if(IntegrationStatus.equals(status))
			 {
				 WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_IntegrationEdit'))
				 System.out.println("Newly created Integration status is ENABLED");
					
			 } else 
			 {
				 System.out.println("Newly created Integration status is niether Import in progress nor ENABLED");
			 }
			      WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Options'), 20)
				  WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_Options'))
				  WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_IntegrationDelete'))
				  WebUI.click(findTestObject('Object Repository/Page_Cloud_ImportData/btn_ConfirmDelete'))
				 
	 } else 
	 {
		 System.out.println("FAILURE: Integration NOT created");
	 }
	 
 //WebUI.closeBrowser()