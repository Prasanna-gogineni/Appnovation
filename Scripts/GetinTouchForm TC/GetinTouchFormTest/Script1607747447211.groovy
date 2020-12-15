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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://testappnovation.wixsite.com/goodshape')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Getin Touch Page Locators/getintouchHeader'), 'Get In Touch')

WebUI.sendKeys(findTestObject('Object Repository/Getin Touch Page Locators/nameLoc'), 'john')

WebUI.sendKeys(findTestObject('Object Repository/Getin Touch Page Locators/addressLoc'), '51 vaughn road')

WebUI.sendKeys(findTestObject('Object Repository/Getin Touch Page Locators/emailLoc'), 'john.p@gmail.com')

WebUI.sendKeys(findTestObject('Getin Touch Page Locators/phoneloc'), '4786528516')

WebUI.sendKeys(findTestObject('Object Repository/Getin Touch Page Locators/subjectLoc'), 'enquiry')

WebUI.sendKeys(findTestObject('Object Repository/Getin Touch Page Locators/messageboxloc'), 'hi can you help me with registration')

WebUI.click(findTestObject('Object Repository/Getin Touch Page Locators/submibtnLoc'))

WebUI.verifyElementText(findTestObject('Object Repository/Getin Touch Page Locators/confirmationtextloc'), 'Thanks for submitting!')

WebUI.closeBrowser()

