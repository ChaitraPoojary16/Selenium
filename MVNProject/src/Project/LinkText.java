package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Mobi")).click();
}
}
