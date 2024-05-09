package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

		
	public static void main(String[] args) throws InterruptedException {
		boolean b = true;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		WebElement yesbutton = driver.findElement(By.id("one"));
		
		WebElement nobutton = driver.findElement(By.id("two"));
	
		yesbutton.click();
		if(yesbutton.isSelected() && !nobutton.isSelected())
		{
			b = true;
		}
		else
		{
			b = false;
		}
		Thread.sleep(1000);
		
		nobutton.click();
		if(b && !yesbutton.isSelected() && nobutton.isSelected())
		{
			b = true;
		}
		else
		{
			b = false;
		}
		
		if(b)
		{
			System.out.println("confirming only one radio button is"
					+ " getting selected");
		}
		else
		{
			System.out.println("Both the radio button are getting "
					+ "selected");
		}
	}

} 
