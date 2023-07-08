package unitech.unitechConsulting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactUs {

	@FindBy (how=How.CLASS_NAME, using = "nav-link")
	public WebElement PatientClick;
	@FindBy (xpath= "(//a[@href='https://telocuretest.com/register/patient'])[1]")
	public WebElement PatientJoinNowClick;

	@FindBy (xpath= "(//a[@href='https://telocuretest.com/login/patient'])[1]")
	public WebElement PatientSignInClick;
}
