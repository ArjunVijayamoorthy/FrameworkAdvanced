package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.Seleniumbase;
import resource.BrowserName;
import resource.SelectorName;

public class TSLogin extends Seleniumbase{
	@Test	
	void TSC001() throws InterruptedException{

		Browser(BrowserName.CHROME, "https://katalon-demo-cura.herokuapp.com/profile.php#login");
		//setup("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		Element(SelectorName.Xpath,"(//input[@id='txt-username'])[1]").sendKeys("John Doe");
		Element(SelectorName.Xpath,"(//input[@id='txt-password'])[1]").sendKeys("ThisIsNotAPassword");
		Element(SelectorName.Xpath,"(//button[normalize-space()='Login'])[1]").click();
		WebElement dropdownElement = Element(SelectorName.Id, "combo_facility");
		Select(dropdownElement, SelectorName.Values, null, "Hongkong CURA Healthcare Center", null);

		Thread.sleep(2000);
		
	}

}	


