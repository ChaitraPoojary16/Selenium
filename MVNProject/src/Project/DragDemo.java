package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropable");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement trgt = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, trgt).build().perform();

	}
}
