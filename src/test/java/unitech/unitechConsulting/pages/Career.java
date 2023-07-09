package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import unitech.unitechConsulting.baseClass.BaseClass;

public class Career extends BaseClass{
	
	public Career() {
		super(driver);
		
	}


	@FindBy (xpath = "//a[@href='https://psptech.net/career/']")
	public WebElement ClickCareer;

	
	@FindBy (xpath = "//a[@href='https://psptech.net']")
	public WebElement ClickHomePageCareer;
	
	
	@FindBy (xpath="/html/body/div[2]/div[2]/section/div[3]/div/div/div[2]/div/nav/ul/li[1]/a/span")
	public WebElement ClickMiddelHomePageCareer;
	
	//driver.findElement(By.tagName("span")).click();
	//a[@href='https://psptech.net/about-us/'][1]
	@FindBy (xpath = "//a[@href='https://psptech.net/about-us/'][1]")
	public WebElement ClickAboutUsCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/'][1]")
	public WebElement MouseOverSoftwareDevelopmentCareer;
	
	//a[@href='https://psptech.net/software-development/app-development/'][1]
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/app-development/'][1]")
	public WebElement AppDevPageSelectionFromCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/web-development/'][1]")
	public WebElement WebDevPageSelectionFromCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/contact-us/'][1]")
	public WebElement ClickContactUsCareer;
	
//	@FindBy (xpath = "//nav[@role='navigation']")
//	public WebElement ClickHome1Career;
	
	@FindBy (xpath = "//nav[@class='breadcrumb-trail breadcrumbs']")
	public WebElement ClickHome1Career;
	
	@FindBy (xpath = "//div[@class='mainmenu-seven__right__toggler mobile-nav-toggler']")
	public WebElement ClickBurgerMenuCareer;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/software-development/']")
	public WebElement ClickSoftwareDevelopmentBurgerMenuCareer;


	@FindBy (xpath = "//img[@decoding='async']")
	public WebElement ClickLogoPspTechCareer;
	
	@FindBy (xpath = "//span[@class='fa fa-angle-right']")
	public WebElement DubleClickFullStackDeveloperCareer;
	
	@FindBy (xpath = "//span[@class='elementor-button-text']")
	public WebElement ClickContactUsCareerMeddlebutton;
	
	@FindBy (xpath = "//a[@class='antares-adv-icon-box-readmore antares-display-inline-block'][1]")
	public WebElement ClickfullStackDeveloperReadMoreCareerbutton;
	
	
	@FindBy (xpath = "//*[@id=\"primary\"]/div/section[4]/div[2]/div/div/section/div/div[1]/div/div[1]/div/div/div[2]/h3/span")
	public WebElement ClickfullStackDeveloperCareerbutton;
	
	
	@FindBy (xpath = "//a[@href='https://psptech.net/career/wordpress-developer/']")
	public WebElement ClickWordPressReadMoreCareerbutton;
	
	@FindBy (xpath = "//*[@id=\"primary\"]/div/section[4]/div[2]/div/div/section/div/div[1]/div/div[2]/div/div/div[2]/h3/span")
	public WebElement ClickWordPressCareerbutton;
	
	
	@FindBy (xpath = "//a[@href='https://psptech.net/career/quality-assurance-analyst/']")
	public WebElement ClickQualityAssuranceAnalystReadMoreCareerbutton;
	
	@FindBy (xpath = "//*[@id=\"primary\"]/div/section[4]/div[2]/div/div/section/div/div[2]/div/div[1]/div/div/div[2]/h3/span")
	public WebElement ClickQualityAssuranceAnalystCareerbutton;
	
	
	@FindBy (xpath = "//a[@href='https://psptech.net/career/scrum-master/']")
	public WebElement ClickScremMasterReadMoreCareerbutton;
	
	@FindBy (xpath = "//*[@id=\"primary\"]/div/section[4]/div[2]/div/div/section/div/div[2]/div/div[2]/div/div/div[2]/h3/span")
	public WebElement ClickScremMasterCareerbutton;
	
	@FindBy (xpath = "//a[@href='https://psptech.net/contact-us/'][1]")
	public WebElement ClickContactUsMiddle2Careerbutton;
	
	@FindBy (xpath = "//*[@id=\"page\"]/div[3]/section[2]/div[3]/div/div/section/div/div[2]/div/div[2]/div/ul/li[1]/a/span")
	public WebElement ClickAboutUsCareerFooterbutton;
	
	@FindBy (xpath = "//*[@id=\"page\"]/div[3]/section[2]/div[3]/div/div/section/div/div[2]/div/div[2]/div/ul/li[3]/a/span")
	public WebElement ClickContactUsCareerFooterbutton;
	
	
	@FindBy (xpath = "//*[@id=\"page\"]/div[3]/section[2]/div[3]/div/div/section/div/div[2]/div/div[2]/div/ul/li[4]/a/span")
	public WebElement ClickSoftwareDevelopmentCareerFooterbutton;
	
	@FindBy (xpath = "//*[@id=\"page\"]/div[3]/section[2]/div[3]/div/div/section/div/div[2]/div/div[2]/div/ul/li[2]/a/span")
	public WebElement ClickCareeronCareerFooterbutton;
	
	
	
	
	
	
	
	
	
	
	@FindBy (xpath = "//a[@href='https://www.facebook.com/PSP-Technology-Inc-105793242237294'][1]")
	public WebElement ClickFacebookFootterCareerbutton;
	
	@FindBy (xpath = "//a[@href='https://twitter.com/PspTechnology'][1]")
	public WebElement ClickTwitterFootterCareerbutton;
	
	@FindBy (xpath = "//a[@href='https://www.youtube.com/channel/UCQMlce8CbHN-j1clmT79zVQ'][1]")
	public WebElement ClickYoutubeFootterCareerbutton;
	
	
	@FindBy (xpath = "//span[@class='elementor-icon-list-text'][1]")
	public WebElement ClickMapFootterCareerbutton;
	
}
	

