import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
}

}
