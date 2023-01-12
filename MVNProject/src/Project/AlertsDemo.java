package Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//simple alert
		driver.findElement(By.xpath("//*[@id='accept']")).click();
		Thread.sleep(3000);
		//waitForElementLoad(2);
		driver.switchTo().alert().accept();
		
		//confirm alert
		driver.findElement(By.id("confirm")).click();
		waitForElementLoad(2);
		driver.switchTo().alert().dismiss();
		
		//prompt
		driver.findElement(By.id("prompt")).click();
		waitForElementLoad(2);
		Alert a=driver.switchTo().alert();
		a.sendKeys("Selenium");
		a.accept();
		
		//Modern Alert
		driver.findElement(By.id("modern")).click();
		waitForElementLoad(2);
		
}

	private static void waitForElementLoad(int i) {
		// TODO Auto-generated method stub
		
	}

	 
}
