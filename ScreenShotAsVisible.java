package QAFox_Practise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotAsVisible {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	//	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("ScreenShots\\GetScreenShotASMuchView.png"));
		
		driver.quit();
	}

}
