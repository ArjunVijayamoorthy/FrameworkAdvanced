package testcases;

import org.testng.annotations.Test;

import base.Seleniumbase;
import resource.BrowserName;
import resource.SelectorName;

public class Democart extends Seleniumbase {

	
	@Test
	
	void DemoCart001()
	{
		Browser(BrowserName.EDGE, "https://www.demoblaze.com/");
		Element(SelectorName.Id, "signin2").click();
		close();
	}
	
	
}
