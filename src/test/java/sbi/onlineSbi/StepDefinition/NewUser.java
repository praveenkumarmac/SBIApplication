package sbi.onlineSbi.StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import sbi.onlineSbi.BaseClass.BaseClass;
import sbi.onlineSbi.ObjectRepository.UserPage;
public class NewUser {
		
	public static WebDriver driver;
    public static WebDriverWait Wait;	
	
	public static BaseClass base1 = new BaseClass();
	public static BaseClass base = BaseClass.getInstance();
	UserPage userPage = new UserPage();
	
	@Given("Launch the browser and appilication1 {string}")
	public void launch_the_browser_and_appilication1(String url) {		
		base.launchApplication(url);	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}		
	@When("User clicks on new user button")
	public void user_clicks_on_new_user_button() throws InterruptedException {	    
		Thread.sleep(3000);
		base.button(userPage.getNewUserRegister());		
	}		
	@When("User clicks on ok button")	
	public void user_clicks_on_ok_button() throws InterruptedException {
		Thread.sleep(8000);
		base.button(userPage.getNewUserRegisterOk());
		base.childWindow();			
		base.driver.manage().window().maximize();
	}						
//	@When("User clicks on newUserRegisterOrActivate button")
//	public void user_clicks_on_newUserRegisterOrActivate_button() {
//		WebElement newUserRegisterOrActivate1 = base.driver.findElement(By.xpath("//select[@name='issueCode']"));
//		Select select = new Select(newUserRegisterOrActivate1);
//		select.selectByValue("registerHere");				
//	}
	@When("User clicks on newUserRegisterOrActivate button {string}")
	public void user_clicks_on_newUserRegisterOrActivate_button(String newUserRegisterOrActivate) throws InterruptedException {
		//WebElement newUserRegisterOrActivate1 = base.driver.findElement(By.xpath("//select[@name='issueCode']"));
		Thread.sleep(8000);
		base.valueSelect(userPage.getNewUserRegisterOrActivate(), newUserRegisterOrActivate);
	}			
	@When("User clicks on next button")
	public void user_clicks_on_next_button() {	
		base.button(userPage.getNext());
	}			
	@When("User enters the value in accountNo {string}")
	public void user_enters_the_value_in_accountNo(String accountNo) {
		base.inputKeys(userPage.getAccountNo(), accountNo);
	}
	@When("User enters the value in cifNo {string}")
	public void user_enters_the_value_in_cifNo(String cifNo) {
		base.inputKeys(userPage.getCifNo(), cifNo);
	}
	@When("User enters the text in branchCode {string}")
	public void user_enters_the_text_in_branchCode(String branchCode) {
		base.inputKeys(userPage.getBranchCode(), branchCode);
	}
	@When("User enters the value in mobliNo {string}")
	public void user_enters_the_value_in_mobliNo(String mobliNo) {
		base.inputKeys(userPage.getMobileNo(), mobliNo);
	}
	@When("User enters the text in newUserCaptcha {string}")
	public void user_enters_the_text_in_newUserCaptcha(String newUserCaptchaText) {
		base.inputKeys(userPage.getNewUserCaptcha(), newUserCaptchaText);
	}						
	@When("User select country in selCountry {string}")
	public void user_select_country_in_selCountry(String Country) {
		//base.visibleTextSelect(userPage.getSelCountry(), Country);
		base.valueSelect(userPage.getSelCountry(), Country);
	}
	@When("User select facility in facilityRequired {string}")
	public void user_select_facility_in_facilityRequired(String facilityRequired) {
		//base.visibleTextSelect(userPage.getFacility(), facilityRequired);
		base.valueSelect(userPage.getFacility(), facilityRequired);
	}		
	@When("User clicks on IAgree button")
	public void user_clicks_on_IAgree_button() {
		base.button(userPage.getiAgree());
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		base.button(userPage.getSubmit());
	}				
}
