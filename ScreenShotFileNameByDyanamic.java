package QAFox_Practise;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotFileNameByDyanamic {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filename = "ScreenShots\\"+ dyanamicFileName() +".png";
		FileHandler.copy(file,new File(filename));

		driver.quit();
	}
	
	public static String dyanamicFileName()
	{
		Date date = new Date();
		System.out.println(date);
		String stringdate = date.toString();
		String newDate = stringdate.replace(" ","_").replace(":","_");
		System.out.println(newDate);
		return newDate;
		
	}

}
