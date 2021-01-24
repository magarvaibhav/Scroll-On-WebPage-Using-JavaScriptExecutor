package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ScrollPages;

public class ScrollSteps {

	public WebDriver driver=null;
	public String URL="https://www.guru99.com/scroll-up-down-selenium-webdriver.html";
	public WebDriverWait wait=null;
	public ScrollPages objScrollPages=new ScrollPages();
	
	public RemoteWebDriver obj=null;
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,60);
	}
	
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	public void openApplication()
	{
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
			/*
		3 types of scroll
		
		*/
	
	public void allMethodsOfScroll() throws Exception
	{
		
		//scroll by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		 //Find element       		
        WebElement Element = driver.findElement(objScrollPages.elements);
        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        
        //bottom of page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
	}
}
