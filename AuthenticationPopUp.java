package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement abTesting = driver.findElement(By.linkText("A/B Testing"));
		abTesting.click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		WebElement basic_auth = driver.findElement(By.linkText("Basic Auth"));
		basic_auth.click();
		
		driver.navigate().back();
	

	}

}
