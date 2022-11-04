package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_webapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// script to facebbook login
		/*
		System.setProperty("webdriver.chrome.driver" , "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("demo.qedge");
		driver.findElement(By.id("pass")).sendKeys("demo");
		driver.findElement(By.name("login")).click();
		*/
		
		// login to HRM APPLICATION
		
		System.setProperty("webdriver.chrome,driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.get("http://orangehrm.qedgetech.com");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		 WebElement login=driver.findElement(By.id("btnLogin"));
		 login.click();
		 
		 driver.findElement(By.partialLinkText("Welcome")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("Logout")).click();
		 driver.close();
		 
		 
		
		
	}

}
