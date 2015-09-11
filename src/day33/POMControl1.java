package day33;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day33.pom.WelcomeMercuryTours;

public class POMControl1 {
	
	@Test
	public void POMTest()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		/*wm.findAFlight("admin","Pass@123");
		driver.navigate().back();
		wm.destinations();*/
		wm.menu.contact();
		driver.navigate().back();
		wm.menu.register();
		driver.navigate().back();
		wm.menu.support();
		driver.navigate().back();
		wm.menu.signon();
	}

}
