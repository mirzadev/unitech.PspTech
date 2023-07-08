package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import unitech.unitechConsulting.baseClass.BaseClass;


public class HomePage extends BaseClass{

	public HomePage() {
		super(driver);
	}	
	
	
@FindBy (xpath = "(//a[@href='https://psptech.net'])[1]")
public WebElement ClickHome;

@FindBy (xpath = "(//a[@href='https://psptech.net/software-development/'])[1]")
public WebElement MouseOverSoftwareDevelopment;

@FindBy (xpath = "(//a[@href='https://psptech.net/software-development/web-development/'])[1]")
public WebElement WebDevPageSelectionFromHomePage;
	
@FindBy (xpath= "(//a[@href='https://psptech.net/software-development/'])[6]")
public WebElement ClickDiscoverMore1;

@FindBy (how = How.XPATH, using = "(//a[@href='https://psptech.net/software-development/'])[8]")
public WebElement DiscoverMore2Click;

@FindBy (how = How.XPATH, using="((//*[@class='antares-adv-icon-box-title'])[4]")
public WebElement AppDevelopmentHomeClick;

@FindBy (how = How.XPATH, using="(//*[@class='antares-adv-icon-box-title'])[5]")
public WebElement WebsiteDevelopmentHomeClick;

@FindBy (how = How.XPATH, using ="(//*[@class='antares-adv-icon-box-title'])[6]")
public WebElement ApiIntegrationDevHomeClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-adv-icon-box-content'])[7]")
public WebElement WebMobAppHomeClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-adv-icon-box-content'])[8]")
public WebElement SeoOptimizationHomeClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-adv-icon-box-content'])[9]")
public WebElement SpeedOptimizationHomeClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://psptech.net/about-us/'])[3]")
public WebElement AboutUsHomeClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://www.facebook.com/PSP-Technology-Inc-105793242237294'])[2]")
public WebElement PspFacebookBrandingHomeClick;

@FindBy (how = How.XPATH, using = "(//a[@href='https://psptech.net/contact-us/'])[3]")
public WebElement SupportPspContactUsClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[1]")
public WebElement FaqOneClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[2]")
public WebElement FaqTwoClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[3]")
public WebElement FaqThreeClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[4]")
public WebElement FaqFourClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[5]")
public WebElement FaqFiveClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[6]")
public WebElement FaqSixClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[7]")
public WebElement FaqSevenClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[8]")
public WebElement FaqEightClick;

@FindBy (how = How.XPATH, using = "(//*[@class='antares-active-inactive-icon'])[9]")
public WebElement FaqNineClick;

@FindBy (how = How.XPATH, using = "//*[@class='elementor-button-text']")
public WebElement ContactUSHomeFooterBigClick;

@FindBy (how = How.XPATH, using="(//*[@class='elementor-icon-list-item elementor-inline-item'])[1]")
public WebElement HomeFooterFacebookClick;
@FindBy (how = How.XPATH, using="(//*[@class='elementor-icon-list-item elementor-inline-item'])[2]")
public WebElement HomeFooterTwitterClick;
@FindBy (how = How.XPATH, using="(//*[@class='elementor-icon-list-item elementor-inline-item'])[3]")
public WebElement HomeFooterYoutubeClick;

/*
@FindBy (how = How.ID, using="email")
public WebElement ContactEmailInsert;

@FindBy(how = How.ID, using="message")
public WebElement ContactMessageInsert;
*/

@FindBy(how= How.LINK_TEXT, using = "About Us")
public WebElement HomeFooterCareerClick;

@FindBy(how= How.LINK_TEXT, using = "Career")
public WebElement HomeFooterContactUsClick;

@FindBy(how= How.LINK_TEXT, using = "Contact Us")
public WebElement HomeFooterAboutUsClick;

@FindBy(how= How.LINK_TEXT, using = "Software Development")
public WebElement HomeFooterSoftwareDevClick;

@FindBy(how = How.XPATH, using = "(//*[@class='elementor-icon-list-text'])[8]")
public WebElement HomeFooterAddressClick;

@FindBy(how = How.XPATH, using = "(//*[@class='elementor-icon-list-text'])[9]")
public WebElement HomeFooterPhoneClick;

@FindBy(how = How.XPATH, using = "(//*[@class='elementor-icon-list-text'])[10]")
public WebElement HomeFooterFaxClick;

@FindBy(how = How.XPATH, using = "(//*[@class='elementor-icon-list-text'])[11]")
public WebElement HomeFooterEmailClick;

@FindBy (name = "your-email")
public WebElement EnterFooterEmail;

@FindBy (xpath = "//*[@class='elementor-button']")
public WebElement FooterEmailSubmitClick;


}
