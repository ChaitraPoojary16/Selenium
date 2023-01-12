package Project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipLinkBroken {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.edge",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("URl is launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();

		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@class='eFQ30H']/a"));
		for (int i = 0; i < allLinks.size(); i++) {
			String url = allLinks.get(i).getAttribute("href");
			checkLink(url);
		}
	}

	public static void checkLink(String url) throws IOException {
		HttpURLConnection conn;
		conn = (HttpURLConnection) (new URL(url)).openConnection();
		conn.connect();
		int code = conn.getResponseCode();
		if (code > 400 || code > 500) {
			System.out.println(code + " the link is broken");
		} else {
			System.out.println(code + " The link is working");
		}
	}
}
