package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions extends Constants{
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://localhost:8090/orangehrm");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}

}
