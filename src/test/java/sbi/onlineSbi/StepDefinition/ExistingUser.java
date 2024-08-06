package sbi.onlineSbi.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import sbi.onlineSbi.BaseClass.BaseClass;
import sbi.onlineSbi.ObjectRepository.UserPage;

public class ExistingUser {
	
	public static WebDriver driver;
	public static WebDriverWait Wait;	
	
	public static BaseClass base1 = new BaseClass();
	public static BaseClass base = BaseClass.getInstance();
	UserPage userPage = new UserPage();
	
	@Given("Launch the browser and appilication {string}")
	public void launch_the_browser_and_appilication(String url) {
		base.launchApplication(url);	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}
	@When("User initially clicks on login button")
	public void user_initially_clicks_on_login_button() throws InterruptedException {
		//Actions act = new Actions(driver);		
		base.button(userPage.getLogin());		
		Thread.sleep(5000);
	}
	
	@When("User clicks on continue to login button")
	public void user_clicks_on_continue_to_login_button() {					                                                                                              
		base.button(userPage.getContinueToLogin());
	}			
	@When("User enters the value in username {string}")
	public void user_enters_the_value_in_username(String userName) {		
		base.button(userPage.getUsername());
		base.inputKeys(userPage.getUsername(), userName);
	}
	@When("User enters the value in password {string}")
	public void user_enters_the_value_in_password(String password) {	
		base.button(userPage.getPassword());
		base.inputKeys(userPage.getPassword(), password);		
	}
	@When("User enters the text in captcha {string}")
	public void user_enters_the_text_in_captcha(String captchaText) {
		base.button(userPage.getToCaptcha());
		base.inputKeys(userPage.getToCaptcha(), captchaText);
	}								
	@When("User finally clicks on login button")
	public void user_finally_clicks_on_login_button() throws InterruptedException {
		//Thread.sleep(3000);
		Thread.sleep(5000);
		System.out.println("Before Login Click");
		base.button(userPage.getLoginButton());
		//loginButton.click();
		System.out.println("After Login Click");
	}


}
