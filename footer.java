package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		
		
		String footer[] = {"About Us","Delivery Information"};
		
		//driver.findElement(By.linkText("Delivery Information")).click();
		
		for(int i = 0;i<=footer.length;i++)
		{
		//	String foot=footer[i];
			driver.findElement(By.linkText("+'footer[i]'+")).click();
			Thread.sleep(1000);
		} 		
		
		

	}

}
