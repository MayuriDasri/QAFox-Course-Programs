package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingBugRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		
		// TestCase 1 
		WebElement yesButton = driver.findElement(By.id("nobug"));
		WebElement noButton = driver.findElement(By.id("bug"));

		boolean b1=false;
		Thread.sleep(1000);
		yesButton.click();
		if(yesButton.isSelected() && !noButton.isSelected())
		{
			b1=true;
		}
		else
		{
			b1=false;
		}
	
		boolean b2= false;
		Thread.sleep(1000);
		noButton.click();
		if(!yesButton.isSelected() && noButton.isSelected())
		{
			b2=true;
		}
		else
		{
			b2=false;
		}
		
		if(b1 == true && b2 == true)
		{
			System.out.println("Test case 1 Passed  : Only one radio button getting selected ");
		}
		else
		{
			System.out.println("Test case 1 Failed : Both radio Buttons are getting selected  ");
		}
	
		//Test Case 2 
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		WebElement yesButton1 = driver.findElement(By.id("nobug"));
		WebElement noButton1 = driver.findElement(By.id("bug"));
		
		boolean b3 = false;
		Thread.sleep(1000);
		noButton1.click();
		if(!yesButton1.isSelected() && noButton1.isSelected())
		{
			b3=true;
		}
		else
		{
			b3=false;
		}
		
		Thread.sleep(1000);
		boolean b4 = false;
		yesButton1.click();
		if(yesButton1.isSelected() && !noButton1.isSelected())
		{
			b4=true;
		}
		else
		{
			b4=false;
		}
		
		if(b3 && b4)
		{
			System.out.println("Test case 2 Passed  : Only one radio button getting selected ");
		}
		else
		{
			System.out.println("Test case 2 Failed : Both radio Buttons are getting selected  ");
		}
		
		
	}
}
