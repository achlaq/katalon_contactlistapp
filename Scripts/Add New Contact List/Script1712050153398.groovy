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

WebUI.click(findTestObject('Object Repository/Contact List App/Page_My Contacts/button_Add a New Contact'))

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_First Name_firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Last Name_lastName'), LastName)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Date of Birth_birthdate'), DateofBirth)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Email_email'), Email)

WebUI.setText(findTestObject('Page_Add Contact/input_Phone_phone'), Phone)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Street Address 1_street1'), StreetAddress)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_City_city'), City)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_State or Province_stateProvince'), 
    Province)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Postal Code_postalCode'), PostalCode)

WebUI.setText(findTestObject('Object Repository/Contact List App/Page_Add Contact/input_Country_country'), Country)

WebUI.click(findTestObject('Object Repository/Contact List App/Page_Add Contact/button_Submit'))

