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

//System.setProperty("webdriver.chrome.driver", "/home/pavitra/Downloads/chromedriver-linux64/chromedriver")

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo.nopcommerce.com/register')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'),
	    '1', true)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), 10)

int optionsCount = WebUI.getText(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle')).split('\n').size()

for (int i = 1; i <= optionsCount; i++) {
	String optionLocator = 'Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'

	WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), i - 1)
	

	WebUI.delay(2)
}

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), 
//    '1', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/MonthEle'), 
//    '1', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/yearEle'), 
//    '1914', true)

