package test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//script to click seleniumdownload in google suggestion list
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);

		List<WebElement> keywordlist=driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		for(int i=0;i<keywordlist.size();i++) {
			String keyword=keywordlist.get(i).getText();
			if(keyword.toLowerCase().contains("download")) {
				keywordlist.get(i).click();
				break;
			}
			
		}
		
	}
	

}
