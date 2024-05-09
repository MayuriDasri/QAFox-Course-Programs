package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOnTextAreaField {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		
		//Scroll To Top
		WebElement textAreaTop = driver.findElement(By.id("ta1"));
		for(int i=0;i<=50;i++)
		textAreaTop.sendKeys("Mayuri Dasri \n");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollTop=0", textAreaTop);
		
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight", textAreaTop);
	
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollTop=300", textAreaTop);
		
		
		//Scroll To Bottom not Working
		WebElement textAreaBottom = driver.findElement(By.id("ta1"));
		for(int i=0;i<=50;i++)
		textAreaBottom.sendKeys("Mayuri Dasri \t");
		
	
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollBottom=0", textAreaBottom);
		
		
		Thread.sleep(5000);
		jse.executeScript("arguments[0].scrollBottom=arguments[0].scrollWidth", textAreaBottom);
	
		Thread.sleep(3000);
		jse.executeScript("arguments[0].scrollBottom=300", textAreaBottom);
		
		
		
	}
	
	

}
