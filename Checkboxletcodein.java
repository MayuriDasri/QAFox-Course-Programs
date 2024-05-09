package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxletcodein {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		driver.findElement(By.xpath("//label[contains(text(),' I agree to the')]/input")).click();
		
	}

}
