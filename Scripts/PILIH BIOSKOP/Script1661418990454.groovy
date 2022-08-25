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

Mobile.startApplication('C:\\Users\\Administrator\\Documents\\automate\\Katalon\\REZAapps\\mobileapp\\TIX ID_v1.27.3_apkpure.com.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.TextView - BASSURA XXI'), 0)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.TextView - MENCURI RADEN SALEH'), 0)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.RadioButton - 26 AguJUM'), 0)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.TextView - 2115'), 0)

Mobile.tap(findTestObject('Object Repository/PILIH BIOSKOP/android.widget.RelativeLayout'), 0)

Mobile.closeApplication()

