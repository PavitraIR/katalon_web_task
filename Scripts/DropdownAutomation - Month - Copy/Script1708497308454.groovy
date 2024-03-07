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

WebUI.navigateToUrl('https://demo.nopcommerce.com/register')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/MonthEle'), 
    '1', true)

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), 10)
//def monthNames = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]

String dropdownText = WebUI.getText(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/MonthEle'))
List<String> monthNames = dropdownText ? dropdownText.split('\n') : []

// Helper function to check if a string starts with an uppercase letter and the rest are lowercase
def isStartingWithCapitalAndRestLower(String str) {
	return str.matches("[A-Z][a-z]*")
}

for (String month : monthNames) {
	if (isStartingWithCapitalAndRestLower(month)) {
		println("${month} starts with an uppercase letter and the rest are lowercase")
	} else {
		println("${month} starts with an lowercase letter and the rest are lowercase")
	}
}


