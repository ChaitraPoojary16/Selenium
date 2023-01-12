import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("Village Cooking");
		driver.findElement(By.id("search-icon-legacy")).click();
	}
}
