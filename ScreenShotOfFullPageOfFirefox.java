package QAFox_Practise;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfFullPageOfFirefox {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File screenShot = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenShot,new File("ScreenShots\\FullPageScreenShot.png"));
		
		driver.quit();
		
	}

}
