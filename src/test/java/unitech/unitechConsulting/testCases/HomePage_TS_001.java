package unitech.unitechConsulting.testCases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.HomePage;
import unitech.unitechConsulting.pages.SoftwareDevelopment;
import unitech.unitechConsulting.utilities.CommonMethods;



public class HomePage_TS_001 extends BaseClass{
	
	public HomePage_TS_001() {
		super(driver);		
	}

	HomePage homepage;
	SoftwareDevelopment softDev;
	
	@BeforeTest
	public void setup() {
		driver= BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		homepage = PageFactory.initElements(driver, HomePage.class);
		CommonMethods.maximizeBrowser();
	}	
	
	/*
	 if you want to use Excel shell to pass data, us like this
	 @Test(dataProvider = "ContactUsData", dataProviderClass = ExcelUtility.class){}
	 */

	@Test
	public void TC_001_ClickHeaderHomeButton() throws InterruptedException {
	logger.info("Test Case_001 Clicking Home Button has started");
	CommonMethods.getTitle(getDriver(), "PSPTech – PSP Technology | Websites | Apps | Digital Solutions - PSPTech");
	CommonMethods.click(homepage.ClickHome, driver);

	}
	
	@Test
	public void TC_002_Mouse_Over_Software_Development() {
		Actions act = new Actions(driver);
		act.moveToElement(homepage.MouseOverSoftwareDevelopment).build().perform();
		CommonMethods.click(homepage.WebDevPageSelectionFromHomePage, driver);
		CommonMethods.getTitle(getDriver(), "Web Development - PSPTech");
		CommonMethods.click(homepage.ClickHome, driver);
	}
	
	
	@AfterTest
	public void tearDown() {
	logger.info("Testing for HomePage_TS_001 Completed");
	
}
}
