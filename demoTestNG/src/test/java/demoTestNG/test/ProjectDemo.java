package demoTestNG.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectDemo {
	
@BeforeSuite
public void urlLaunch() {
System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("http://www.saucedemo.com/");
System.out.println("Inside Beforesuite url is launched");
}
@BeforeTest
public void inputValues() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	
	WebDriver driver=new EdgeDriver();
	driver.get("http://www.saucedemo.com/");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	System.out.println("Inside Beforetest values are inserted");
}
@BeforeClass
public void LoginProcess() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");

	WebDriver driver=new EdgeDriver();
	driver.get("http://www.saucedemo.com/");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	System.out.println("Inside beforeClass login is successfull");
}
@BeforeMethod
public void selectItem() {
	System.setProperty("webdriver.edge.driver","C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");

	WebDriver driver=new EdgeDriver();
	driver.get("http://www.saucedemo.com/");

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	String[] items = { "Bolt T-Shirt", "Bike Light", "Onesie" };
	for (int i = 0; i < items.length; i++) {
	driver.findElement(By.xpath("//*[contains(text(),'" + items[i]	+ "')]/parent::a/parent::div/following-sibling::div[@class='pricebar']/button")).click();
	}
	System.out.println("inside BeforeMethod ");
}
@Test
public void testcase1() {
	System.out.println("Inside test case");
}
}
