package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_quit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		driver.quit();
		
		

	}

}
