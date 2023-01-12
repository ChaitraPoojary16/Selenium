import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {
	public static void main(String[] args) {
		String url="https://www.youtube.com/";
		System.setProperty("webriver.gecko.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String currentUrl=driver.getCurrentUrl();
		System.out.println("currentUrl= "+currentUrl);
		if(url.equals(currentUrl)) {
			System.out.println("Url are same");
		}else
		{
			System.out.println("Url are not same");
		}
		String title=driver.getTitle();
		System.out.println("Title= "+title);
	}
}
