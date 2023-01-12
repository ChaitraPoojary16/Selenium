package Project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String link = driver.findElement(By.linkText("Best Sellers")).getAttribute("href");
		HttpURLConnection conn;
		conn = (HttpURLConnection) (new URL(link)).openConnection();
		conn.connect();
		int code = conn.getResponseCode();
		if (code > 400 || code > 500) {
			System.out.println(code + " the link is broken");
		} else {
			System.out.println(code + " The link is working");
		}

	}
}
