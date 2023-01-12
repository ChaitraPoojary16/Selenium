package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	WebElement item= driver.findElement(By.xpath("//*[contains(text(),'Bolt T-Shirt')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button"));
	item.click();
	
	}
}
