package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginToWeb {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letcode.in/test");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		LoginToWeb.waitForLoad(3);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='join']")).sendKeys(" Programmer");
		String txt=driver.findElement(By.xpath("//input[@id='getMe']")).getAttribute("value");
		System.out.println("The text inside the textbox is:" +txt);
		driver.findElement(By.xpath("//input[@id='clearMe']")).clear();
		boolean check=driver.findElement(By.xpath("//input[@id='noEdit']")).isEnabled();
		String s=check?"field is enabled":"field is disabled";
		System.out.println(s);
		
		boolean check1=driver.findElement(By.xpath("//input[@id='dontwrite']")).isEnabled();
		if(check1) {
			driver.findElement(By.xpath("//input[@id='dontwrite']")).sendKeys("hai");
		}
		else {
			System.out.println("The field is read only");
		}
	}
	public static void waitForLoad(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
