package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textareaclick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ta1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("gsc-search-button")).click();
		

	}

}
