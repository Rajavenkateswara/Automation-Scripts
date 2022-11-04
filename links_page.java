package test_cases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class links_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		 for(int i=0;i<links.size();i++) {
			 String linkname=links.get(i).getText();
			 System.out.println(linkname);
			 */
		System.setProperty("webdriver.msedge.drive","msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		List<WebElement> imagelist=driver.findElements(By.tagName("img"));
		System.out.println(imagelist.size());
		
		
			
		
		
		 }
		
		
		

	}


