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

WebUI.callTestCase(findTestCase('F01 Common Test Case/FF0105 Science Web/TC0105002 Search Article'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Probing matterantimatter asymmetry wit_fc4890/img'))

WebUI.click(findTestObject('Object Repository/Page_Home  CERN/a_search'))

WebUI.setText(findTestObject('Object Repository/Page_Home  CERN/input_Search_keys'), 'quantum')

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('https://home.cern/search/node?keys=quantum')

WebUI.click(findTestObject('Object Repository/Page_Search Results  CERN/a_Basics of Quantum Computing'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Basics of Quantum Computing  CERN/h1_Basics of Quantum Computing'), 
    'Basics of Quantum Computing')

WebUI.closeBrowser()

