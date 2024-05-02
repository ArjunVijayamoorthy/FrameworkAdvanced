package testcases;

import org.testng.annotations.Test;
import base.Seleniumbase;
import resource.BrowserName;
	
public class TSLogin extends Seleniumbase{
@Test	
	void TSC001() throws InterruptedException{
		
		Browser(BrowserName.EDGE, "https://katalon-demo-cura.herokuapp.com/profile.php#login");
		//setup("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		Element("Xpath","(//input[@id='txt-username'])[1]").sendKeys("John Doe");
		Element("Xpath","(//input[@id='txt-password'])[1]").sendKeys("ThisIsNotAPassword");
		Element("Xpath","(//button[normalize-space()='Login'])[1]").click();
		Thread.sleep(20000);
		close();
		
		
	}
	
}	
	

