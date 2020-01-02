package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
	
	WebDriver driver;
	
	
	
//Constructor has same name as class name, constructor will accept webdriver as an argument, whatever webdriver we will receive from page factory will pass here by initializing to the local driver
	public LogInPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	

	@FindBy(id="UserName") 
	WebElement username;
	
	//you can find by how too (better practice)
	@FindBy(how=How.ID,using="Password") 
	WebElement password;
	
	@FindBy(how=How.CSS, using="Log In") 
	WebElement logInButton;
	
	
	
	
	
	
	
	
//Methods
	public void setUserName(String UN)
	{
		username.sendKeys(UN);
	}
	
	public void setPassword(String Pass)
	{
		password.sendKeys(Pass);
	}
	
	public void clickLogIn()
	{	
		logInButton.click();	
	}
	
	
}
