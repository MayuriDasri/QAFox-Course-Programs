package QAFox_Practise;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize_command {
	public static void main(String[] args) {
	
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
				
		Dimension d = new Dimension(300,500);
		driver.manage().window().setSize(d);
		
	}

}
