package test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*
		 * driver.get("http://primusbank.qedgetech.com");
		 driver.findElement(By.xpath("//*[@href='aboutus.html']")).click();
		*/
		/*
		driver.get("http://calc.qedgetech.com/");
		driver.findElement(By.xpath("//*[@value='1']")).click();
		driver.findElement(By.xpath("//*[@value='+']")).click();
		driver.findElement(By.xpath("//*[@value='2']")).click();
		driver.findElement(By.xpath("//*[@value='=']")).click();		
        */
	
		
		//driver.get("http://orangehrm.qedgetech.com");
		 /*
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		*/
		/*
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		*/
		/*
		driver.get("http://facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//*[@name='sex' and @value='2']")).click();
		*/
		
		/*X-path functions 
		 * starts-with()
		 * contains()
		 */
		/*
		driver.get("http://facebook.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("Qedge");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("demo");
		
		//driver.findElement(By.xpath("//*[@name='login']")).click();
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_5')]")).click();	
		*/
		/*
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> chklist=driver.findElements(By.xpath("//*[starts-with(@id,'ohrmList_chkSelectRecord')]"));
		
		for(int i=0;i<chklist.size();i++) {
			chklist.get(i).click();
		*/
		
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'phone')]")).sendKeys("demo");
		driver.close();
		
		}
	}
	


