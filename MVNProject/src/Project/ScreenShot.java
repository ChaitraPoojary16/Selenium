package Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		System.out.println("URl is launched");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.id("login-button")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\chaitra\\Documents\\Material\\image.login.png");
		FileUtils.copyFile(f,dest);
		//right click on project->select build path->configure build path ->class path->add external jar->inside desktop ->jar file->common.io
}
}
