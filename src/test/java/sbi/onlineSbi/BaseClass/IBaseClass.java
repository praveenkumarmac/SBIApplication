package sbi.onlineSbi.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IBaseClass {
	
	void browserLaunch ();
	void inputKeys (WebElement ele, String value);
	void button (WebElement ele);
	boolean selected (WebElement ele);
	void indexSelect (WebElement ele, int i);
	void valueSelect (WebElement ele, String value);
	void visibleTextSelect (WebElement ele, String value);
	void parentWindow();
	void childWindow();
	void actionClick(WebElement ele, String value);
	WebDriverWait waits();
	void launchApplication(String url);

}
