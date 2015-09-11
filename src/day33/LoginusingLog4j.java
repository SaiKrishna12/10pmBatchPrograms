package day33;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginusingLog4j {

	private static Logger log=Logger.getLogger(LoginusingLog4j.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://newtours.demoaut.com");
		log.info("Navigated to url");
		driver.findElement(By.name("userName")).sendKeys("admin");
		log.info("Entered username");
		driver.findElement(By.name("password")).sendKeys("admin");
		log.info("Entered password");
		driver.findElement(By.name("login")).click();
		log.info("Clicked on Sigin");

	}

}
