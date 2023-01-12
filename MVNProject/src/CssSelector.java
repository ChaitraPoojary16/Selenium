import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		// driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");//tag#value
		// of id/name
		// driver.findElement(By.cssSelector("input.input_error
		// form_input")).sendKeys("secret_sauces");//tag.class
		// driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauces");//tag[attribute='value]
		// driver.findElement(By.cssSelector("input.submit-button
		// btn_action[name='login-button']")).click();//tag.class[attribute='value']
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//form/input")).click();
	}
}
