package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	
	static WebDriver driver;
	@Before
	
	public static void method1() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashad\\Desktop\\shahid\\cucumber\\Driver1\\chromedriver.exe");
	    driver=new ChromeDriver();
	    System.out.println("Before");
	    
	    
	}
	
	@After
	public void method2() {
		driver.close();
		driver.quit();
		System.out.println("After");
	}

}
