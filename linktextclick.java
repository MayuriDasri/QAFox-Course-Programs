package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextclick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("compendiumdev")).click();
		//Thread.sleep(1000);
		
		driver.findElement(By.name("textboxn")).click();

	}

}
