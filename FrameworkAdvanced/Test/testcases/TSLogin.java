package testcases;

import org.testng.annotations.Test;

import base.Seleniumbase;


	
public class TSLogin extends Seleniumbase{
@Test	
	void TSC001() throws InterruptedException{
		//BrowserName(Browser.CHROME, "https://katalon-demo-cura.herokuapp.com/profile.php#login");
		setup("https://katalon-demo-cura.herokuapp.com/profile.php#login");
		Element("Xpath","(//input[@id='txt-username'])[1]").sendKeys("John Doe");
		Element("Xpath","(//input[@id='txt-password'])[1]").sendKeys("ThisIsNotAPassword");
		Element("Xpath","(//button[normalize-space()='Login'])[1]").click();
		Thread.sleep(20000);
		close();
		
		
	}
	
}	
	

