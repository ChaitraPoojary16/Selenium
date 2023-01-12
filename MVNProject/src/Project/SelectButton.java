package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.edge","C:\\Users\\chaitra\\Desktop\\Drivers\\chromedriver_win32\\chromediver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	System.out.println("URl is launched");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	WebElement fruit=driver.findElement(By.id("fruits"));
	Select obj=new Select(fruit);
	obj.selectByVisibleText("Mango");
	List<WebElement> allFruits=obj.getOptions();
	for(int i=0;i<allFruits.size();i++) {
		String fr=allFruits.get(i).getText();
		System.out.println(fr);
		}
	
	WebElement lang=driver.findElement(By.id("lang"));
	Select s=new Select(lang);
	s.selectByIndex(1);
	//Two ways to print the selected element
	//s.getFirstSelectedOption().getText();
	WebElement web=s.getFirstSelectedOption();
	System.out.println(web.getText());
	
	
	WebElement ele=driver.findElement(By.id("country"));
	Select s1=new Select(ele);
	s1.selectByValue("India");

}
}
