package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		System.out.println("URl is launched");

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		WebElement txt = driver.findElement(By.xpath("//div[@id='finish']/h4"));

		WebElement ele = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (txt.isDisplayed()) {
					return txt;
				} else {
					return null;
				}

			}
		});
		System.out.println(ele.getText());
	}
}
