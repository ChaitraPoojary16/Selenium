package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class AssertDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String title=driver.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(title,"PRODUCTS");
		System.out.println("login success");
		
		boolean check=driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
		Assert.assertEquals(check,true);
		System.out.println("login success");
		
}
}