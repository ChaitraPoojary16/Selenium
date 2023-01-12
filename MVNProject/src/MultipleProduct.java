import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleProduct {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String[] items = { "Bolt T-Shirt", "Bike Light", "Onesie" };
		for (int i = 0; i < items.length; i++) {
		driver.findElement(By.xpath("//*[contains(text(),'" + items[i]	+ "')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button")).click();
		}
		driver.findElement(By.xpath("//select[@data-test='product_sort_container']/option[@value='lohi']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();

	}
}
