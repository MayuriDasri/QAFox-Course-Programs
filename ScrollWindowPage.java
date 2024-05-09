package QAFox_Practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindowPage {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		

		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,-1250)");	
		Thread.sleep(3000);
		
		jse.executeScript("window.scrollBy(0,-1250)");	
		Thread.sleep(3000);
		
		
		
		
		
		
	}
		
	}

