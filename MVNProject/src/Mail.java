import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32//chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www..com/");
	
	
}
}
