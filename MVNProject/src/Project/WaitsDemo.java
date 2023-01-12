package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/waits");
	System.out.println("URl is launched");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.findElement(By.id("accept")).click();
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
}
}
