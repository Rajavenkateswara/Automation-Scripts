package test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax {
	//Script to capture suggestion [AJAX] displayed in a TEXTBOX
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		List<WebElement> keywordlist=driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		System.out.println(keywordlist.size());
		
		for(WebElement element :keywordlist) {
			String keyword=element.getText();
			System.out.println(keyword);
		}
		
	}

}
