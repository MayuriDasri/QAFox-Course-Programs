package QAFox_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chekboxEnable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		List<WebElement> radioButtonDisables = driver.findElements(By.xpath(" //label[contains(text(),'Confirm last field is disabled')]"));
		int size  = radioButtonDisables.size();
		System.out.println("The Size of Web Element "+size);
	}

}
