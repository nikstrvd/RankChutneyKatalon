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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rankchutney.2stallions.site/portal/login')

WebUI.setText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Get Started__username'), 'may25@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_RankChutney - Project Management/input_Get Started__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/svg'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/img_See all Notification_img-circle user-im_e52901'))

WebUI.click(findTestObject('Object Repository/Page_RankChutney - Project Management/a_Logout'))

WebUI.closeBrowser()

