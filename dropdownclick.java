package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownclick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement dropdownbutton = driver.findElement(By.className("combobox"));
		dropdownbutton.click();
		driver.close();
	}

}
