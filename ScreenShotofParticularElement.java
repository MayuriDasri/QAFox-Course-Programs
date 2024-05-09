package QAFox_Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotofParticularElement {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement date = driver.findElement(By.xpath("//span[normalize-space()='Monday, May 13, 2013']"));
		File dateSCreenShot = date.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(dateSCreenShot, new File("ScreenShots\\dateScree.png"));
		
		driver.quit();
	}

}
