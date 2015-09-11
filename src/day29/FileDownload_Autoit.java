package day29;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload_Autoit {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.46.0")).click();
		
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\sai\\Desktop\\download.exe");

	}

}
