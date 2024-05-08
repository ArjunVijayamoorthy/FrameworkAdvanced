package resource;

import org.openqa.selenium.WebElement;

public interface SeleniumInterface {

	/*
	 * @setup: used to Instantite Browser
	 */
	void setup(String URL);

	void Browser(BrowserName BrowserName,String URL);

	 WebElement Element (SelectorName SelectorName,String Value );
	
	void type(WebElement Element,String Input);

	void Select (WebElement Element,SelectorName Dropdowntype, String Index, String Value, String Text );
	
	void click(WebElement Element);

	void close();
}
