package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorCommand {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\omayo.blogspot.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.cssSelector("button[value='LogIn']"));
		
		//driver.findElement(By.partialLinkText("diumdev")).click();
	
		
		driver.findElement(By.id("textbox1")).clear();
		driver.close();
	}

}
