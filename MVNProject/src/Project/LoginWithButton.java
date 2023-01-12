package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginWithButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letcode.in/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Click']")).click();
		driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.navigate().to("https://letcode.in/buttons");
		WebElement ele=driver.findElement(By.id("position"));
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		System.out.println("x => "+x +" y => " +y);
		Thread.sleep(3000);
		WebElement btnColor=driver.findElement(By.id("color"));
		String color=btnColor.getCssValue("background-color");
		System.out.println("color is:" +color);
		
		Rectangle rect= driver.findElement(By.id("property")).getRect();
		System.out.println("height= " +rect.getHeight());
		System.out.println("Width= " +rect.getWidth());
		System.out.println(rect.getPoint());
		
		boolean isDisabled=driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isDisabled);
		
		//driver.findElement(By.xpath("//button[@id='isDisabled']")).click();
		//driver.quit();
		


}
}
