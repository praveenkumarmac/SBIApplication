package sbi.onlineSbi.BaseClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass implements IBaseClass{	
	public static BaseClass base = null;	
	public static BaseClass getInstance() {
		if(base == null) {
			base = new BaseClass();
		}
		return base;
	}	
	public static WebDriver driver;
	public static Actions action;
	public static Select select;
	@Override
	public void browserLaunch() {		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();			
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);		
//			driver.get(url);
			action=new Actions(driver);			
	}
	@Override
	public void launchApplication(String url) {
		driver.get(url);		
	}
	@Override
	public void inputKeys(WebElement ele, String value) {
		ele.sendKeys(value);		
	}
	@Override
	public void button(WebElement ele) {
		ele.click();		
	}
	@Override
	public boolean selected(WebElement ele) {
		boolean selected=ele.isSelected();
		return selected;
	}
	
	@Override
	public void indexSelect(WebElement ele, int i) {
		select =new Select(ele);
		select.deselectByIndex(i);		
	}
	@Override
	public void valueSelect(WebElement ele, String value) {
		select =new Select(ele);
		select.selectByValue(value); 		
	}	
	@Override
	public void visibleTextSelect(WebElement ele, String value) {
		select =new Select(ele);
		select.selectByValue(value); 		
	}
	@Override
	public void parentWindow() {
		String parentAddress = driver.getWindowHandle();
		driver.switchTo().window(parentAddress);
	}
	@Override
	public void childWindow() {		
		String parentAddress = driver.getWindowHandle();
		Set<String> addresses = driver.getWindowHandles();
		for(String eachAddress : addresses) {
			if(!(eachAddress.equals(parentAddress))) {
				driver.switchTo().window(eachAddress);
			}
		}		
	}
	@Override
	public void actionClick(WebElement ele, String value) {				
	}
	@Override
	public WebDriverWait waits() {
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return Wait;
	}			
}
