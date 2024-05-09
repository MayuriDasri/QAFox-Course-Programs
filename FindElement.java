package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		
		WebElement text = driver.findElement(By.id("pah"));
		String returntext = text.getText();
		System.out.println(returntext);
		driver.quit();
	}
	

}
