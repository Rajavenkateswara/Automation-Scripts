package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_getUrl_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://google.com");
		String pgurl= driver.getCurrentUrl();
		System.out.println(pgurl); */
		
		/*
		// Script to check images link redirecting to appropiate page or not
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();
		
		String exptitle, acttitle;
		exptitle="Google images";
		acttitle= driver.getTitle();
		if(exptitle.equalsIgnoreCase(acttitle)) {
			System.out.println("test has passed");
		}
		else {
			System.out.println("Test has failed");
		}
		*/
		
		// check gmail link working or not based on the window url:
		/*
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
		String expurl,acturl;
		
		expurl ="Gamil";
		acturl= driver.getCurrentUrl();
		
		if(acturl.contains(acturl)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
		//String pgurl=driver.getCurrentUrl();
		//System.out.println(pgurl);
		
		*/
		
		// findElements() in browser
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		
		

	}

}
