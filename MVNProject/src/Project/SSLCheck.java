package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		ChromeOptions options =new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com");
		System.out.println("URl is launched");//how to create a mvn project and add jar files 
		
		
		
	}
}
