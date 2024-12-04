import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to checkout/info"

TrueTestScripts.navigate("checkout/info")

"Step 2: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on input Email.png')

"Step 3: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_checkout_info/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Enter input value in input Email.png')

"Step 4: Click on span EmailOffers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/span_EmailOffers'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on span EmailOffers.png')

"Step 5: Click on input MarketingCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/input_MarketingCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on input MarketingCheckbox.png')

"Step 6: Click on button ContinueShipping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'checkout/info?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout_info/button_ContinueShipping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button ContinueShipping - Navigate to page .png')

"Step 7: Click on link Apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link Apple.png')

"Step 8: Click on link Apple -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_Apple'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link Apple - Navigate to page category pagecategory.png')

"Step 9: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button AddToCart.png')

"Step 10: Click on button AddToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_AddToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button AddToCart.png')

"Step 11: Click on link Sale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Sale'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link Sale.png')

"Step 12: Click on link Sale -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/link_Sale'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link Sale - Navigate to page product pageproduct.png')

"Step 13: Click on link ProductLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link ProductLink.png')

"Step 14: Click on link ProductLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link ProductLink.png')

"Step 15: Click on button Next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Next'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on button Next.png')

"Step 16: Click on button Next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Next'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on button Next.png')

"Step 17: Click on button Next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Next'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button Next.png')

"Step 18: Click on button Next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Next'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button Next.png')

"Step 19: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button Close.png')

"Step 20: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button Close.png')

"Step 21: Click on link Accessories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on link Accessories.png')

"Step 22: Click on link Accessories -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Accessories'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on link Accessories - Navigate to page category pagecategory.png')

"Step 23: Click on link mobilePhoneModel (SamsungGalaxyZFold4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel', ['link_mobilePhoneModel_internalRoleLinkName': link_mobilePhoneModel_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on link mobilePhoneModel SamsungGalaxyZFold4.png')

"Step 24: Click on link mobilePhoneModel (SamsungGalaxyZFold4) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel', ['link_mobilePhoneModel_internalRoleLinkName': link_mobilePhoneModel_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on link mobilePhoneModel SamsungGalaxyZFold4 - Navigate to page product pageproduct.png')

"Step 25: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on button Increased.png')

"Step 26: Click on button Increased"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_Increased'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on button Increased.png')

"Step 27: Click on link Samsung"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on link Samsung.png')

"Step 28: Click on link Samsung -> Navigate to page 'category page#category/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_Samsung'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on link Samsung - Navigate to page category pagecategory.png')

"Step 29: Click on button HotSamsungGalaxyS23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_HotSamsungGalaxyS23'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on button HotSamsungGalaxyS23.png')

"Step 30: Click on button HotSamsungGalaxyS23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_HotSamsungGalaxyS23'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 30-Click on button HotSamsungGalaxyS23.png')

"Step 31: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 31-Click on button Buy.png')

"Step 32: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 32-Click on button Buy.png')

"Step 33: Click on label storageColorOptions (White)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 33-Click on label storageColorOptions White.png')

"Step 34: Click on label storageColorOptions (White)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 34-Click on label storageColorOptions White.png')

"Step 35: Click on label storageColorOptions (1TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 35-Click on label storageColorOptions 1TB.png')

"Step 36: Click on label storageColorOptions (1TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 36-Click on label storageColorOptions 1TB.png')

"Step 37: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 37-Click on label storageColorOptions 512GB.png')

"Step 38: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 38-Click on label storageColorOptions 512GB.png')

"Step 39: Click on label storageColorOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_6]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 39-Click on label storageColorOptions 256GB.png')

"Step 40: Click on label storageColorOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_7]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 40-Click on label storageColorOptions 256GB.png')

"Step 41: Click on label storageColorOptions (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_8]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 41-Click on label storageColorOptions Black.png')

"Step 42: Click on label storageColorOptions (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_9]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 42-Click on label storageColorOptions Black.png')

"Step 43: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_10]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 43-Click on label storageColorOptions 512GB.png')

"Step 44: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_11]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 44-Click on label storageColorOptions 512GB.png')

"Step 45: Click on label storageColorOptions (1TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_12]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 45-Click on label storageColorOptions 1TB.png')

"Step 46: Click on label storageColorOptions (1TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_13]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 46-Click on label storageColorOptions 1TB.png')

"Step 47: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_14]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 47-Click on label storageColorOptions 512GB.png')

"Step 48: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_15]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 48-Click on label storageColorOptions 512GB.png')

"Step 49: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 49-Click on button Buy.png')

"Step 50: Click on button Buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/button_Buy'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 50-Click on button Buy.png')

"Step 51: Click on div Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 51-Click on div Slider.png')

"Step 52: Click on div Slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Slider'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 52-Click on div Slider.png')

"Step 53: Click on input InStockCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_InStockCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 53-Click on input InStockCheckbox.png')

"Step 54: Click on input InStockCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/input_InStockCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 54-Click on input InStockCheckbox.png')

"Step 55: Click on div Calculating"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Calculating'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 55-Click on div Calculating.png')

"Step 56: Click on div Calculating"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_category/div_Calculating'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 56-Click on div Calculating.png')

"Step 57: Click on div productWrapper (ProductWrapper)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/div_productWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 57-Click on div productWrapper ProductWrapper.png')

"Step 58: Click on div productWrapper (ProductWrapper)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/div_productWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 58-Click on div productWrapper ProductWrapper.png')

"Step 59: Click on link mobilePhoneModel (SamsungGalaxyZFold5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel', ['link_mobilePhoneModel_internalRoleLinkName': link_mobilePhoneModel_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 59-Click on link mobilePhoneModel SamsungGalaxyZFold5.png')

"Step 60: Click on link mobilePhoneModel (SamsungGalaxyZFold5) -> Navigate to page 'product page#product/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'category/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_category/link_mobilePhoneModel', ['link_mobilePhoneModel_internalRoleLinkName': link_mobilePhoneModel_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 60-Click on link mobilePhoneModel SamsungGalaxyZFold5 - Navigate to page product pageproduct.png')

"Step 61: Click on label storageColorOptions (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_16]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 61-Click on label storageColorOptions Blue.png')

"Step 62: Click on label storageColorOptions (Blue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_17]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 62-Click on label storageColorOptions Blue.png')

"Step 63: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_18]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 63-Click on label storageColorOptions 512GB.png')

"Step 64: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_19]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 64-Click on label storageColorOptions 512GB.png')

"Step 65: Click on label storageColorOptions (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_20]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 65-Click on label storageColorOptions TB.png')

"Step 66: Click on label storageColorOptions (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_21]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 66-Click on label storageColorOptions TB.png')

"Step 67: Click on label storageColorOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_22]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 67-Click on label storageColorOptions 256GB.png')

"Step 68: Click on label storageColorOptions (256GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_23]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 68-Click on label storageColorOptions 256GB.png')

"Step 69: Click on label storageColorOptions (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_24]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 69-Click on label storageColorOptions Black.png')

"Step 70: Click on label storageColorOptions (Black)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_25]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 70-Click on label storageColorOptions Black.png')

"Step 71: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_26]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 71-Click on label storageColorOptions 512GB.png')

"Step 72: Click on label storageColorOptions (512GB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_27]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 72-Click on label storageColorOptions 512GB.png')

"Step 73: Click on label storageColorOptions (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_28]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 73-Click on label storageColorOptions TB.png')

"Step 74: Click on label storageColorOptions (TB)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/label_storageColorOptions', ['label_storageColorOptions_internalText': label_storageColorOptions_internalText_29]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 74-Click on label storageColorOptions TB.png')

"Step 75: Click on button purchaseOptions (Increased2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 75-Click on button purchaseOptions Increased2.png')

"Step 76: Click on button purchaseOptions (Increased2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 76-Click on button purchaseOptions Increased2.png')

"Step 77: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 77-Click on button purchaseOptions Buy.png')

"Step 78: Click on button purchaseOptions (Buy)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/button_purchaseOptions', ['button_purchaseOptions_internalRoleButtonName': button_purchaseOptions_internalRoleButtonName_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 78-Click on button purchaseOptions Buy.png')

"Step 79: Click on link ProductNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 79-Click on link ProductNext.png')

"Step 80: Click on link ProductNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 80-Click on link ProductNext.png')

"Step 81: Click on link ProductNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 81-Click on link ProductNext.png')

"Step 82: Click on link ProductNext"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 82-Click on link ProductNext.png')

"Step 83: Click on link ProductNext2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 83-Click on link ProductNext2.png')

"Step 84: Click on link ProductNext2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_ProductNext2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 84-Click on link ProductNext2.png')

"Step 85: Click on span PageNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_PageNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 85-Click on span PageNumber.png')

"Step 86: Click on span PageNumber -> Navigate to page 'cart page#cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'product/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_PageNumber'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 86-Click on span PageNumber - Navigate to page cart pagecart.png')

"Step 87: Click on button removeItem (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 87-Click on button removeItem Remove.png')

"Step 88: Click on button removeItem (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 88-Click on button removeItem Remove.png')

"Step 89: Click on button removeItem (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 89-Click on button removeItem Remove.png')

"Step 90: Click on button removeItem (Remove)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 90-Click on button removeItem Remove.png')

"Step 91: Click on button removeItem (Remove2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 91-Click on button removeItem Remove2.png')

"Step 92: Click on button removeItem (Remove2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_cart/button_removeItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 92-Click on button removeItem Remove2.png')

"Step 93: Click on div EmptyCartMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_EmptyCartMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 93-Click on div EmptyCartMessage.png')

"Step 94: Click on div EmptyCartMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/div_EmptyCartMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 94-Click on div EmptyCartMessage.png')

"Step 95: Click on link GoShopping"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_GoShopping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 95-Click on link GoShopping.png')

"Step 96: Click on link GoShopping -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart/link_GoShopping'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 96-Click on link GoShopping - Navigate to page .png')

"Step 97: Click on link About"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_About'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 97-Click on link About.png')

"Step 98: Click on link About -> Navigate to page '/about'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_About'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 98-Click on link About - Navigate to page about.png')

"Step 99: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Shopping Experience with Multiple Products and Checkout Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}