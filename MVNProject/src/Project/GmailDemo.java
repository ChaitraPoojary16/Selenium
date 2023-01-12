package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("automation6@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		//options.AddArguments("--disable-web-security", "--user-data-dir=true", "--allow-running-insecure-content");
		//driver.findElement(By.xpath("//*[@id='next']")).click();
}
}
