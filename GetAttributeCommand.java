package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		
		WebElement searchTextBox = driver.findElement(By.name("q"));
		searchTextBox.sendKeys("software");
		
		Thread.sleep(1000);
		
		WebElement searchbutton = driver.findElement(By.className("gsc-search-button"));
		searchbutton.click();
		
		
	/*	String srchbuttontext = driver.findElement(By.className("gsc-search-button")).getAttribute("value");
		System.out.println(srchbuttontext);  */
		
		String searchtext = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("value");
		System.out.println(searchtext);
	}

}
