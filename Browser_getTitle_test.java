package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_getTitle_test {
	public static void main (String[] args) {
		
		//to capture the tittle of the browser
		System.setProperty("webdriver.chrome. driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		String pgtitle=driver.getTitle();
		System.out.println(pgtitle);
		
		
	}

}
