import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().window().minimize();
		// driver.close();
		driver.quit();
	}
}
