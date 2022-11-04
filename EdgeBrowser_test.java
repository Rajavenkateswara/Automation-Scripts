package test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.msedge.driver","‪C:\\Users\\rajav\\Downloads\\edgedriver_win64" );
		WebDriver driver =new EdgeDriver();
		driver.get("http://whatsapp.com");
		 

	}

}
