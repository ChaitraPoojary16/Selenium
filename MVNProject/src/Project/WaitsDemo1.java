package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		System.out.println("URl is launched");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		String txt=driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
		System.out.println(txt);
	}
}
