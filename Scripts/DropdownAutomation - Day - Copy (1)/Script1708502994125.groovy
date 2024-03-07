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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), 
    '1', true)

//WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'), 10)

String dropdownText = WebUI.getText(findTestObject('Object Repository/Page_Dropdown/Page_nopCommerce demo store. Register/DayEle'))
List<String> options = dropdownText ? dropdownText.split('\n') : []

// Helper function to check if a string represents a number
def isNumber(String str) {
	try {
		Integer.parseInt(str)
		return true
	} catch (NumberFormatException e) {
		return false
	}
}

// Check if options are sequential numbers
def isSequentialNumbers(List<String> options) {
	for (int i = 0; i < options.size(); i++) {
		if (!isNumber(options[i]) || Integer.parseInt(options[i]) != i + 1) {
			return false
		}
	}
	return true
}

if (isSequentialNumbers(options)) {
	println("Options in the dropdown are sequential numbers")
} else {
	println("Options in the dropdown are not sequential numbers")
}

