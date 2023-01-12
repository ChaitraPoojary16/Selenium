import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsers {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	//System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	//WebDriver driver2=new EdgeDriver();
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
	WebDriver driver3=new FirefoxDriver();
}

}
