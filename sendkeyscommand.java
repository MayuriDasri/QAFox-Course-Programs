package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeyscommand {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
		WebElement search1 = driver.findElement(By.name("search"));
		search1.sendKeys("software");
		Thread.sleep(2000);
		driver.findElement(By.className("input-group-btn")).click();

	}

}
