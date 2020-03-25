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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/login/ui')

WebUI.setText(findTestObject('Page_login/input_UL team_username'), 'chandan')

WebUI.setEncryptedText(findTestObject('Page_login/input_UL team_password'), '9KYXPY9RLWY=')

WebUI.click(findTestObject('Page_login/input_UL team_layui-input layui-unselect'))

WebUI.click(findTestObject('Page_login/dd_Student'))

WebUI.click(findTestObject('Page_login/button_login in'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/a_homwdemo'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/span_onsaleProduct'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/a_add to cart'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/a_'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/span_view my cart'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/a_pay'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/a_'))

WebUI.setText(findTestObject('Object Repository/Page_OWL hope to earn more and more money/input_cardnumber_cardnumber'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_OWL hope to earn more and more money/input_expirymonth_expirymonth'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_OWL hope to earn more and more money/input_expiryyear_expiryyear'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_OWL hope to earn more and more money/input_cvv_cvv'), '1')

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/button_submit'))

WebUI.click(findTestObject('Object Repository/Page_OWL hope to earn more and more money/span_myOrder'))

