package QAFox_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_maximize {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
			driver.get("https:\\omayo.blogspot.com");
			driver.manage().window().maximize();
			driver.manage().window().fullscreen();
			driver.manage().window().minimize();
			driver.quit();

	}

}
