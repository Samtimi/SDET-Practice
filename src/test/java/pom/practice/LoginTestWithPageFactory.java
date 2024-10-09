package pom.practice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginTestWithPageFactory {
	
	WebDriver driver;
	
	//constructor
	LoginTestWithPageFactory(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//locators
	
	//@FindBy(xpath="//input[@placeholder='username']") 
	
	//Another approach
	@FindBy(how=How.XPATH, using="//input[@placeholder='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;
	
	//Group of web elements
	@FindBy(tagName="a")
	List<WebElement> links;
	
	//Action methods
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_username.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		txt_username.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
