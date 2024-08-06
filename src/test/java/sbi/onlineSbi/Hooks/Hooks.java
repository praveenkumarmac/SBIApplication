package sbi.onlineSbi.Hooks;

import java.time.Duration;

import io.cucumber.java.Before;
import sbi.onlineSbi.BaseClass.BaseClass;

public class Hooks {
	
	BaseClass base1 = new BaseClass();
	BaseClass base = BaseClass.getInstance();
	
	@Before
	public void launchBrowser() {
		base.browserLaunch();
		base.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
	}

}
