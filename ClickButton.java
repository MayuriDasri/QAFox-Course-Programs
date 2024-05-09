package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButton {

	public static void main(String[] args)throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		//WebElement alert = driver.findElement(By.id("alert1"));
		//alert.click();
		
		/* WebElement radiobutton1 = driver.findElement(By.className("widget-content"));
		radiobutton1.click();
		
		WebElement radiobutton2 = driver.findElement(By.name("gender"));
		radiobutton2.click(); */
		
		WebElement radiobutton1 = driver.findElement(By.id("radio1"));
		radiobutton1.click();
		
		Thread.sleep(1000);
		
		WebElement radiobutton2 = driver.findElement(By.id("radio2"));
		radiobutton2.click();
		
		
		//driver.quit();

	}

}
