package sbi.onlineSbi.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sbi.onlineSbi.BaseClass.BaseClass;

public class UserPage {
	
	BaseClass base = BaseClass.getInstance();

	public UserPage() {
		PageFactory.initElements(base.driver, this);
	}
	
	@FindBy(xpath = "//span[@class='classicTxt']")
	private WebElement login;
	@FindBy(xpath = "//span[contains(text(),'Dear Customer, OTP')]"
			+ "//preceding::a[text()='CONTINUE TO LOGIN']")
	private WebElement continueToLogin;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//input[@id='loginCaptchaValue']")
	private WebElement toCaptcha;
	@FindBy(xpath = "//input[@id='Button2']")
	private WebElement loginButton;
	@FindBy(xpath = "//span[text()='New User Registration /']")
	private WebElement newUserRegister;
	@FindBy(xpath = "//a[@onClick='fnNewUserClick()']")
	private WebElement newUserRegisterOk;
	@FindBy(xpath = "//select[@name='issueCode']")
	private WebElement newUserRegisterOrActivate;	
	@FindBy(xpath = "//input[@id='nextStep']")
	private WebElement next;
	@FindBy(xpath = "//input[@id='accountNo']")
	private WebElement accountNo;
	@FindBy(xpath = "//input[@id='cifNo']")
	private WebElement cifNo;	
	@FindBy(xpath = "//input[@id='branchCode']")
	private WebElement branchCode;
	@FindBy(xpath = "//select[@id='selCountry']")
	private WebElement selCountry;
	
	@FindBy(xpath = "//input[@id='mobileNo']")
	private WebElement mobileNo;
	@FindBy(xpath = "//select[@id='txnRights']")
	private WebElement facility;
	@FindBy(xpath = "//input[@name='captchaValue']")
	private WebElement newUserCaptcha;
	@FindBy(xpath = "//button[@id='iAgreeconsent']")
	private WebElement iAgree;
	@FindBy(xpath = "//button[@id='go']")
	private WebElement submit;

	public BaseClass getBase() {
		return base;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getContinueToLogin() {
		return continueToLogin;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getToCaptcha() {
		return toCaptcha;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getNewUserRegister() {
		return newUserRegister;
	}
	public WebElement getNewUserRegisterOk() {
		return newUserRegisterOk;
	}
	public WebElement getNewUserRegisterOrActivate() {
		return newUserRegisterOrActivate;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getAccountNo() {
		return accountNo;
	}
	public WebElement getCifNo() {
		return cifNo;
	}
	public WebElement getBranchCode() {
		return branchCode;
	}
	public WebElement getSelCountry() {
		return selCountry;
	}
	public WebElement getMobileNo() {
		return mobileNo;
	}
	public WebElement getFacility() {
		return facility;
	}
	public WebElement getNewUserCaptcha() {
		return newUserCaptcha;
	}
	public WebElement getiAgree() {
		return iAgree;
	}
	public WebElement getSubmit() {
		return submit;
	}
}