import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.com/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.id("a-autoid-0-announce")).click();//sort by
	driver.findElement(By.id("s-result-sort-select_4")).click();//select the newest arrival
	driver.findElement(By.name("url")).click();

	
}
}
