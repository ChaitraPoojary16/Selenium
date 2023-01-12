import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String currentUrl=driver.getCurrentUrl();
		System.out.println("CurrentUrl= "+currentUrl);
		String title=driver.getTitle();
		System.out.println("title= "+title);
		driver.manage().window().maximize();//maximizing the window
	}
}
