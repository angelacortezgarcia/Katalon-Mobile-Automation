import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\Guest Admin\\Downloads\\GAH-2.18.1(405).apk', true)

Mobile.tap(findTestObject('android.widget.Button11 - 0'), 0)

Mobile.tap(findTestObject('android.widget.Button9 - 9'), 0)

Mobile.tap(findTestObject('android.widget.Button6 - 6'), 0)

Mobile.tap(findTestObject('android.widget.Button6 - 6'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - 1'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0'), 0)

Mobile.tap(findTestObject('android.widget.Button9 - 9'), 0)

Mobile.tap(findTestObject('android.widget.Button9 - 9'), 0)

Mobile.tap(findTestObject('android.widget.Button7 - 7'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - 1'), 0)

Mobile.tap(findTestObject('android.widget.Button5 - 5'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - NEXT'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - View instructions'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - PROCEED'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView0 - Skip'), 0)

Mobile.tap(findTestObject('android.widget.Button1 - PROCEED'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button11 - 0 (1)'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - NEXT (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Skip (1)'), 0)

not_run: Mobile.tap(findTestObject('android.widget.Button1 - MAYBE LATER'), 0)

not_run: Mobile.closeApplication()

