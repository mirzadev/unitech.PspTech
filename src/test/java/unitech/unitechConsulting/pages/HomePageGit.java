package unitech.unitechConsulting.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import unitech.unitechConsulting.baseClass.BaseClass;

public class HomePageGit extends BaseClass{

	public HomePageGit() {
		super(driver);	
	}

@FindBy (xpath ="(//a[@href='https://psptech.net' ])[1]")
public WebElement clickHomePage_1;

@FindBy (xpath = "(//a[@href= 'https://psptech.net/software-development/'])[1]")
public WebElement clickDiscoverMore_1;

@FindBy (how = How.XPATH , using= ("(//a[@href= 'https://psptech.net/software-development/'])[5]"))
public WebElement clickDiscoverMore_5;

@FindBy (xpath = "(//*[@class='antares-adv-icon-box'])[4]")
public WebElement appDevelopment_4;

@FindBy (how = How.XPATH, using= ("(//*[@class='antares-adv-icon-box'])[5]"))
public WebElement websiteDevelopment_5;

@FindBy (how= How.XPATH, using= ("(//*[@class='antares-adv-icon-box'])[6]"))
public WebElement apiIntegrationDevelopement_6;

@FindBy (how= How.XPATH , using= ("//*[@id=\"primary\"]/div/section[3]/div[3]/div[2]/div/section[2]/div/div[2]/div/div/div/div/div[2]/h3/span"))
public WebElement webMobileApplication_7;

@FindBy (how= How.XPATH, using= ("(//*[@class='antares-adv-icon-box'])[9]"))
public WebElement SpeedOptimization_9;

@FindBy (xpath= "(//*[@class='antares-dual-button-wrapper'])")
public WebElement middleAboutUS;

@FindBy (xpath= "(//*[@href='https://psptech.net/contact-us/'])[4]")
public WebElement footerContactUs_4;

@FindBy (xpath= "(//*[@href='https://www.facebook.com/PSP-Technology-Inc-105793242237294'])[3")
public WebElement footerFacebookPage_3;

@FindBy (xpath= "(//*[@href='https://twitter.com/PspTechnology'])[2]")
public WebElement footerTwitter_2;

@FindBy (xpath= "(//*[@href='https://www.youtube.com/channel/UCQMlce8CbHN-j1clmT79zVQ'])[2]")
public WebElement footerYoutubePage_2;

@FindBy (xpath= "(//*[@href='https://psptech.net/about-us/'])[4]")
public WebElement footerAboutUs_4;

@FindBy (xpath= "(//*[@href='https://psptech.net/career/'])[3]")
public WebElement footerCareer_3;

@FindBy (xpath= "(//*[@href='https://psptech.net/contact-us/'])[5]")
public WebElement footerContactUs_5;

@FindBy (xpath= "(//*[@href='https://psptech.net/software-development/'])[9]")
public WebElement footerSoftwareDevelepment_9;

@FindBy (how = How.XPATH, using= ("(//a[@href='https://psptech.net/software-development/'])[2]"))
public WebElement clickDiscover_2;

@FindBy (how= How.XPATH, using= ("(//a[@href='https://psptech.net/software-development/'])[3]"))
public WebElement clickDiscover_3;

@FindBy (xpath= "(//a[@href='https://psptech.net/software-development/'])[4]")
public WebElement clickDiscover_4;

@FindBy (xpath= "(//a[@href='https://psptech.net/software-development/'])[6]")
public WebElement clickDiscover_6;

@FindBy (xpath= "//a[@href='https://psptech.net/about-us/'][1]")
public WebElement aboutUs_1;

@FindBy (xpath= "(//a[@href='https://psptech.net/about-us/'])[2]")
public WebElement aboutUs_2;

}
