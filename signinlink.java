package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signinlink {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create an Account")).click();
		

	}

}
