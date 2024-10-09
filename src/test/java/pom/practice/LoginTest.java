package pom.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test
	void testLogin()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("Admin");
		lp.setPassword("Admin123");
		lp.clickLogin();
		
		System.out.println("Title of the page is : "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
		driver=null;
	}

}
