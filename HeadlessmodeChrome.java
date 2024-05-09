package QAFox_Practise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessmodeChrome {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		option.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
