package orangehrm;

import org.openqa.selenium.By;

public class AddEmployeeKeywords  extends Constants{
	public void clickPim()
	{
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		
	}
	public void clickAddEmployee()
	{
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}
	
	public void enterFirstName()
	{
		driver.findElement(By.id("firstName")).sendKeys("sai");
	}
	
	public void enterMiddleName()
	{
		driver.findElement(By.id("middleName")).sendKeys("krishna");
	}
	public void enterLastName()
	{
		driver.findElement(By.id("lastName")).sendKeys("sai");
	}
	public void enterempId()
	{
		driver.findElement(By.id("employeeId")).sendKeys("1111");
	}
	public void checkLoginDetails()
	{
		driver.findElement(By.id("chkLogin")).click();
	}
	public void enterUsername()
	{
		driver.findElement(By.id("user_name")).sendKeys("sai123");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("user_password")).sendKeys("pass@123");
	}
	
	public void confirmPassword()
	{
		driver.findElement(By.id("re_password")).sendKeys("pass@123");
	}
	
	public void enterStatus()
	{
		driver.findElement(By.id("status")).sendKeys("Enabled");
	}
	public void clickSave()
	{
		driver.findElement(By.id("btnSave")).click();
	}


}
