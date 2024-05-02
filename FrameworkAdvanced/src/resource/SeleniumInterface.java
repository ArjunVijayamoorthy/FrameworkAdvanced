package resource;

import org.openqa.selenium.WebElement;

public interface SeleniumInterface {

	/*
	 * @setup: used to Instantite Browser
	 */
	void setup(String URL);

	void Browser(BrowserName BrowserName,String URL);

	 WebElement Element (String Type,String Value );
	
	void type(WebElement Element,String Input);
	
	
	void click(WebElement Element);

	void close();
}
