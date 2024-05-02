package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import resource.SeleniumInterface;

public class Seleniumbase implements SeleniumInterface {

	RemoteWebDriver driver =null;
	long WaitTime =30;
	@SuppressWarnings("deprecation")
	@Override
	public void setup(String URL) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);	
	}
	@Override
	public void type(WebElement Element, String Input) {
		
		Element.sendKeys(Input);

	}

	@Override
	public void click(WebElement Element) {

		Element.click();

	}

	@Override
	public void close() {
		driver.quit();
	}

	@Override
	public WebElement Element(String Type, String Value) {
		switch (Type) {
		case "Id":
			return	driver.findElement(By.id(Value));

		case "Name":
			return	driver.findElement(By.name(Value));

		case "Xpath":
			return	driver.findElement(By.xpath(Value));

		case "Linkedtext":
			return	driver.findElement(By.linkText(Value));

		case "PartiallinkedText":
			return	driver.findElement(By.partialLinkText(Value));

		case "Tagname":
			return	driver.findElement(By.tagName(Value));

		case "Classname":
			return	driver.findElement(By.className(Value));
				
		case "PartialLinkText":
			return	driver.findElement(By.partialLinkText(Value));
			
		case "CSS":
			return	driver.findElement(By.cssSelector(Value));	
		
			default:
			break;
		}	

		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void Browser(resource.BrowserName BrowserName, String URL) {
		
		switch (BrowserName) {
		case CHROME:
			driver= new ChromeDriver();

			break;

		case EDGE:
			driver= new EdgeDriver();

			break;

		case FIREFOX:
			driver= new FirefoxDriver();

			break;

		default: System.err.println("Driver is not Found");
		break;
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(WaitTime, TimeUnit.SECONDS);	

		
	}








}

