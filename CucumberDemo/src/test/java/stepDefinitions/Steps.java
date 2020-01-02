package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
//* is for all 
import cucumber.api.java.en.*;
import gherkin.ast.DataTable;
import pageObjects.LogInPage;

public class Steps {

	public WebDriver driver;
	//import page object
	public LogInPage lp;
    
    
    
    @Given("User launches Chrome browser")
    public void user_launches_Chrome_browser() {
		//or ,System.getProperty("user")+//Drivers/chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    	driver= new ChromeDriver();

    	//pass driver as a parameter 		
    	lp=new LogInPage(driver);
    }

    
    @And("User navigates to loginURL")
    public void user_navigates_to_loginURL() {
    	 
    	String CertLink = "www.gmail.com";	
		driver.get(CertLink);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
        String LogInPageTitle = driver.getTitle();
        System.out.println(LogInPageTitle);
        Assert.assertEquals(LogInPageTitle, "Log In");    
    }

    
    
    @And("User enters valid Username and valid Password")
    public void user_enters_valid_Username_and_valid_Password(DataTable dataTable) {
       
    	lp.setUserName("SislamTest");
        lp.setPassword("Sahara16!");
    	
    	
    }

    @Given("User clicks on log in button")
    public void user_clicks_on_log_in_button() {
    	lp.clickLogIn();
    }

    @And("User should be on homepage and Login should be success")
    public void user_should_be_on_homepage_and_Login_should_be_success() {
    	if (driver.getTitle().contains("We are unable to validate your information")) {
    		driver.close();
    		Assert.assertTrue(false);
    	} else {
    		Assert.assertEquals("Accounts",  driver.getTitle());
    	}
    }

    
    @Then("User launches Mozilla browser")
    public void user_launches_Mozilla_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
}
