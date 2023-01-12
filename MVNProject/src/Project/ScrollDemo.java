package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");
		WebElement link=driver.findElement(By.xpath("//*[@title='Koushik Chatterjee']"));
		js.executeScript("arguments[0].scrollIntoView();",link);
		
	}
}
