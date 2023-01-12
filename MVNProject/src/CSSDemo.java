import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CSSDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");

		WebElement usn = driver.findElement(By.name("user-name"));
		WebElement pwd = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("login-button"));

		usn.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce4");
		login.click();

		usn.clear();
		pwd.clear();
		
		usn.sendKeys("standard_user");
		pwd.clear();
		pwd.sendKeys("secret_sauce");
		login.click();
		

	}
}
