package test_cases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//click()
/*
		driver.get("http://google.com");
		driver.findElement(By.linkText("Sign in")).click();
		*/
		//Sendkeys();
		/*
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("name")).sendKeys("QEdge");
		driver.findElement(By.name("contact")).sendKeys("9000283171");
		driver.findElement(By.name("email")).sendKeys("raja@2996");
		driver.findElement(By.name("dob")).sendKeys("12-10-2020");

	 clear()
		 */
		/*
		driver.get("http://google.com");
		WebElement Search =driver.findElement(By.name("q"));
		Search.sendKeys("Selenium");
		Search.clear();
		*/
		// : isDisplayed()
		/*
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		*/
		/*
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) {
			System.out.println("Admin  test is passed");
		}
		else {
			System.out.println("Admin test is failed");
		}
		*/
		/*
		try {
			driver.findElement(By.linkText("Admin")).isDisplayed();
			System.out.println("Employee Login test fail");
		}catch(Exception e)
		{
			System.out.println("Employee Login test pass");
		}
		*/
		//getText()
		/*
		driver.get("http://facebook.com");
		String x=driver.findElement(By.xpath("//div[1]/div/div/div/div[1]/h2")).getText();
		System.out.println(x);
		*/
		/*
		driver.get("http://primusbank.qedgetech.com");
		String content=driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]/p[1]")).getText();
		System.out.println(content);
		*/
		/*
		driver.get("http://facebook.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement e:links) {
			String linksname=e.getText();
			if(!linksname.isEmpty()) {
				System.out.println(linksname);
			}
		*/
		//getAttribute()
		/*
		driver.get("http://google.com");
		WebElement sbutton=driver.findElement(By.name("btnK"));
		String x=sbutton.getAttribute("value");
		String y=sbutton.getAttribute("type");
		System.out.println(x);
		System.out.println(y);
		*/
		/*
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		String empno =driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empno);
		*/
		/*
		driver.get("http://facebook.com");
		String x=driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(x);
		*/
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.linkText("Register")).click();
		WebElement chkbox=driver.findElement(By.id("flexCheckChecked"));
		
		if(!chkbox.isSelected()) {
			chkbox.click();
		}
		}
	}


