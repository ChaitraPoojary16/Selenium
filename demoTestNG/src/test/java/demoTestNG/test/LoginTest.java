package demoTestNG.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test(groups = { "smoke" })
	public void verifyLogin() {
		System.out.println("inside verify login test case");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

	@Test(groups = { "smoke","sanity" })
	public void logout() {
		System.out.println("inside logout test case");
	}

	@Test
	public void forgetPassword() {
		System.out.println("inside forget password test case");
	}

}
