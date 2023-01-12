package Project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaDemo {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/forms");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Chaitra");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("T");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ganeshchaithra6@gmail.com");
		driver.findElement(By.xpath("//input[@id='gender-radio-2']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7306374120");
		
		
		

		

	}
}