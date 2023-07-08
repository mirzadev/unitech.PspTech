package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import unitech.unitechConsulting.baseClass.BaseClass;

public class SoftwareDevelopment extends BaseClass{
	public SoftwareDevelopment() {
		super(driver);
	}

	@FindBy (xpath = "(//a[@href='https://psptech.net'])[2]")
	public WebElement WebDevHome;
}
