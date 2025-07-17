import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FindElement {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		// 1.get count of links on the page;
		
		List <WebElement> linkList = driver.findElements(By.tagName("input"));
		
		//size of linklist;
		
		System.out.println(linkList.size());
		
		
		// 2.get the text of each link on the page;
		
		for(int i=0; i<linkList.size(); i++) 
		{
			
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}

	}

}
