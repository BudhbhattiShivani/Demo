package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class NewTest {
  
	private WebDriver driver;
	
	@Test
	public void f() {
		
		 System.setProperty("webdriver.chrome.driver", "D:/FreeTime/Jar Files/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.toyota.com/contact-a-dealer/");
		  org.testng.Assert.fail("you wandered onto the wrong path");
		  
		  System.out.println("Inside F Method.... ");
	}
	 
	@Test
	public void h() {
		
		 System.setProperty("webdriver.chrome.driver", "D:/FreeTime/Jar Files/chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.toyota.com/");
		  
		  System.out.println("Inside H Method");
		  
	
	}
}
