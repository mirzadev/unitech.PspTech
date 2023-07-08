package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUs {

	
	@FindBy (xpath= "(//a[@href='#doctor'])[1]")
	public WebElement DoctorClick;

	@FindBy (xpath= "(//a[@href='https://telocuretest.com/register/doctor'])[1]")
	public WebElement DoctorJoinNowClick;

	@FindBy (xpath= "(//a[@href='https://telocuretest.com/login/doctor'])[1]")
	public WebElement DoctorSignInClick;	
	
}
