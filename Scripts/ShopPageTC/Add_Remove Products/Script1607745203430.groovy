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

WebUI.openBrowser('https://testappnovation.wixsite.com/goodshape/shop')

WebUI.delay(10)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ShopPageLoc/productLoc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/colorLoc'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/AddtocartLoc'))

WebUI.delay(5)

WebUI.refresh()

WebUI.delay(15)

WebUI.back()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/Product2Loc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/AddtocartLoc'))

WebUI.refresh()

WebUI.delay(15)

WebUI.back()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/Product5Loc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/colorLoc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/AddtocartLoc'))

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(10)
//Verify 3 items added to the cart
WebUI.verifyElementText(findTestObject('Object Repository/ShopPageLoc/CartLoc'), '3')

WebUI.delay(5)

WebUI.back()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/cart1Loc'))

WebUI.delay(10)

WebUI.switchToFrame(findTestObject('Object Repository/ShopPageLoc/frameLoc'), 0)

WebUI.mouseOver(findTestObject('Object Repository/ShopPageLoc/ProductPriceLoc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/removeBtnLoc'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ShopPageLoc/frameCloseBtnLoc'))

WebUI.switchToDefaultContent()
//verifying 1 item has been removed from the cart
WebUI.verifyElementText(findTestObject('Object Repository/ShopPageLoc/CartLoc'), '2')

WebUI.closeBrowser()

