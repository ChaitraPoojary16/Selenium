package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/div[1]")).click();

		// driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
        // we can use both up and down codes.
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

		WebElement adultPlus = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
		for (int i = 0; i < 3; i++) {
			adultPlus.click();
		}
		String count = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']/following-sibling::div[1]/div")).getText();
		String s = count.equals("4") ? "correct number of passengers" : "Incorrect number of passengers";
		System.out.println(s);

		WebElement childPlus=driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
		for(int i=0;i<2;i++) {
			childPlus.click();
		}
		String sCount=driver.findElement(By.xpath("//div[@data-testid='Children-testID-minus-one-cta']/following-sibling::div[1]/div")).getText();
		String s1=sCount.equals("2")?"Correct Number":"Incorrect Number";
		System.out.println(s1);
}
}
