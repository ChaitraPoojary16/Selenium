package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	System.setProperty("webdiver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.flipkart.com/");
	driver.get("https://www.naukri.com/");
	driver.findElement(By.id("login_Layer")).click();
	
}
}
