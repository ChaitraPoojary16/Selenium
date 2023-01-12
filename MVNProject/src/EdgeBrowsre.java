import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowsre {
public static void main(String[] args) {
	String url="https://www.whatsapp.com/";
	System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
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
