package unitech.unitechConsulting.testCases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import unitech.unitechConsulting.baseClass.BaseClass;
import unitech.unitechConsulting.browserFactory.BrowserFactory;
import unitech.unitechConsulting.pages.Career;
import unitech.unitechConsulting.pages.HomePage;
import unitech.unitechConsulting.utilities.CommonMethods;

public class Career_page_TC_001 extends BaseClass {

	public Career_page_TC_001() {
		super(driver);
	}
	
	
	Career career;
	@BeforeTest
	public void setUp( ) {
		driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		career = PageFactory.initElements(driver, Career.class);
		CommonMethods.maximizeBrowser();
	
	}
	
	@Test
	public void TC_001_click_header_career_button() {
		logger.info(" clicking Career button has started");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
		//CommonMethods.click(career.ClickHomePageCareer, driver);
		
		
	}
	
	@Test
	public void TC_002_click_header_Home_button() {
		logger.info("clicking CareerHome button has started");
		CommonMethods.click(career.ClickHomePageCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	@Test
	public void TC_003_click_header_AboutUs_button() {
		logger.info(" clicking CareerAboutUs button has started");
		CommonMethods.click(career.ClickAboutUsCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	
	@Test
	public void TC_004_software_development_dropdown_click() {
		logger.info("  Career Software Development Dropdown App Development clicked");
		Actions act = new Actions(driver);
		act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
		CommonMethods.click(career.AppDevPageSelectionFromCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/software-development/app-development/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
	@Test
	public void TC_005_software_development_dropdown_click() {
		logger.info("  Career Software Development Dropdown Web Development clicked");
		Actions act = new Actions(driver);
		act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
		CommonMethods.click(career.WebDevPageSelectionFromCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/software-development/web-development/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
		}

	@Test
	public void TC_006_click_header_ContactUs_button() {
		logger.info(" clicking CareerContactUs button has started");
		CommonMethods.click(career.ClickContactUsCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	

@Test
public void TC_009_click_BurgerMenu_AboutUs_button() {
	logger.info(" clicking CareerBurgerMenu AboutUs button has started");
	CommonMethods.click(career.ClickAboutUsCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}
@Test
public void TC_010_click_BurgerMenu_ContactUs_button() {
	logger.info(" clicking CareerBurgerMenu ContactUs button has started");
	CommonMethods.click(career.ClickContactUsCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}

@Test
public void TC_011_click_BurgerMenu_Career_button() {
	logger.info(" clicking CareerBurgerMenu Career button has started");
	CommonMethods.click(career.ClickCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");
	CommonMethods.click(career.ClickBurgerMenuCareer, driver);
	
}

@Test
public void TC_012_software_development_BargerMenu_Career_click() {
	logger.info("  Career Software Development BargerMenu Cicked");
	
	CommonMethods.click(career.ClickSoftwareDevelopmentBurgerMenuCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/");
	

}
	
	@Test
	public void TC_013_software_development_dropdown_click() {
	logger.info("  Career Software Development Dropdown App Development clicked");
	Actions act = new Actions(driver);
	act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
	CommonMethods.click(career.AppDevPageSelectionFromCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/app-development/");
	CommonMethods.click(career.ClickSoftwareDevelopmentBurgerMenuCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/");
}
	@Test
	public void TC_014_software_development_dropdown_click() {
	logger.info("  Career Software Development Dropdown Web Development clicked");
	Actions act = new Actions(driver);
	act.moveToElement(career.MouseOverSoftwareDevelopmentCareer).build().perform();
	CommonMethods.click(career.WebDevPageSelectionFromCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/software-development/web-development/");
	CommonMethods.click(career.ClickCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");
}
	
	
	
	@Test
	public void TC_015_Logo_Psp_Tech_Career_click() {
		logger.info("  Career Software Development BargerMenu Cicked");
		
		CommonMethods.click(career.ClickLogoPspTechCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/");
		
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
	
		
		
		@Test
		public void TC_016_Middle_Home_Career_click() {
			logger.info("  Middle Home Butun in Career Clickd");
			
			CommonMethods.click(career.ClickMiddelHomePageCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
		}
	
	
	
	
		@Test
		public void TC_017_full_stack_devreloper_reade_more_click() {
			logger.info("  Full stack developer in Career Clickd");
			
			CommonMethods.click(career.ClickfullStackDeveloperReadMoreCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/full-stack-developer/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
		
		@Test
		public void TC_018_full_stack_devreloper_click() {
			logger.info("  Full stack developer in Career Clickd");
			
			CommonMethods.click(career.ClickfullStackDeveloperCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/full-stack-developer/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
	
		@Test
		public void TC_019_Word_Press_read_more_click() {
			logger.info("  Word Press in Career Clickd");
			
			CommonMethods.click(career.ClickWordPressReadMoreCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/wordpress-developer/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
		
		@Test
		public void TC_020_Word_Press__click() {
			logger.info("  Word Press in Career Clickd");
			
			CommonMethods.click(career.ClickWordPressCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/wordpress-developer/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
		}
	
	
		@Test
		public void TC_021_Quality_Assurance_Analyst_read_more_click() {
			logger.info("  Quality Assurance Analyst in Career Clickd");
			
			CommonMethods.click(career.ClickQualityAssuranceAnalystReadMoreCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/quality-assurance-analyst/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
		
		@Test
		public void TC_022_Quality_Assurance_Analyst_click() {
			logger.info("  Quality Assurance Analyst in Career Clickd");
			
			CommonMethods.click(career.ClickQualityAssuranceAnalystCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/quality-assurance-analyst/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
	}
		
		@Test
		public void TC_023_Scrum_Master_Read_more_click() {
			logger.info("  Scrum Master buttun in Career Clickd");
			
			CommonMethods.click(career.ClickScremMasterReadMoreCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/scrum-master/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
	
}
		
		@Test
		public void TC_024_Scrum_Master_click() {
			logger.info("  Scrum Master buttun in Career Clickd");
			
			CommonMethods.click(career.ClickScremMasterCareerbutton, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/scrum-master/");
			
			CommonMethods.click(career.ClickCareer, driver);
			CommonMethods.getUrl(driver, "https://psptech.net/career/");
		}
	


@Test
public void TC_025_ContactUs_Middle2_button_click() {
	logger.info("  ContactUs Middle button in Career Clickd");
	
	CommonMethods.click(career.ClickContactUsMiddle2Careerbutton, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
	
	CommonMethods.click(career.ClickCareer, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");
}
	
	@Test
	public void TC_026_AboutUs_Footer_button_click() {
		logger.info("  AboutUs Footer button in Career Clickd");
		
		CommonMethods.click(career.ClickAboutUsCareerFooterbutton, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/about-us/");
		
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
		
	@Test
	public void TC_027_ContactUs_Footer_button_click() {
		logger.info("  ContactUs Footer button in Career Clickd");
		
		CommonMethods.click(career.ClickContactUsCareerFooterbutton, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/contact-us/");
		
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
		
	@Test
	public void TC_028_Software_Development_Footer_button_click() {
		logger.info("  Software Development Footer button in Career Clickd");
		
		CommonMethods.click(career.ClickSoftwareDevelopmentCareerFooterbutton, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/software-development/");
		
		CommonMethods.click(career.ClickCareer, driver);
		CommonMethods.getUrl(driver, "https://psptech.net/career/");
	}
		


@Test
public void TC_029_Career_Footer_button_click() {
	System.out.println("inside TC_029_Career_Footer_button_click");
	logger.info("  Career Footer button in Career Clickd");
	
	CommonMethods.click(career.ClickCareeronCareerFooterbutton, driver);
	CommonMethods.getUrl(driver, "https://psptech.net/career/");	
}
	

	@Test
	public void tearDown() {
		logger.info("Testing for Career_Page_TC_001 completed");
		CommonMethods.closeBrowser();
	}


}
