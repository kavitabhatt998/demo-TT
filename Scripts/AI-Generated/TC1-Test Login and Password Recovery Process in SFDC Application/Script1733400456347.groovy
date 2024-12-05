import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_Username'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on input Username.png')

"Step 3: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_Username'), input_Username)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Enter input value in input Username.png')

"Step 4: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input Password.png')

"Step 5: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_Password'), input_Password)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input Password.png')

"Step 6: Click on input LogIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_LogIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input LogIn.png')

"Step 7: Enter input value in input Username2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_Username2'), input_Username2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in input Username2.png')

"Step 8: Click on input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_Password'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on input Password.png')

"Step 9: Enter input value in input Password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_home/input_Password'), input_Password_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in input Password.png')

"Step 10: Click on input LogIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_LogIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input LogIn.png')

"Step 11: Click on link ForgotYourPassword -> Navigate to page 'authentication page#secur/forgotpassword.jsp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_ForgotYourPassword'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link ForgotYourPassword - Navigate to page authentication pagesecurforgotpasswordjsp.png')

"Step 12: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Enter input value in input Username.png')

"Step 13: Click on input Continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on input Continue.png')

"Step 14: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Enter input value in input Username.png')

"Step 15: Click on input Continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input Continue.png')

"Step 16: Click on link ResendEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/link_ResendEmail'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on link ResendEmail.png')

"Step 17: Enter input value in input Username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_authentication/input_Username'), input_Username_3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Enter input value in input Username.png')

"Step 18: Click on input Continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/input_Continue'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on input Continue.png')

"Step 19: Click on link ReturnToLogin -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'secur/forgotpassword.jsp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_authentication/link_ReturnToLogin'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on link ReturnToLogin - Navigate to page .png')

"Step 20: Click on link TryForFree -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_TryForFree'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link TryForFree - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Test Login and Password Recovery Process in SFDC Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}