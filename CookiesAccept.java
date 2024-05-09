package QAFox_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CookiesAccept {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bbc.com/marathi");
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			WebElement okPrivacyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-terms-banner='accept']")));
			okPrivacyButton.click();
			
			WebElement acceptCookies = driver.findElement(By.xpath("//button[@data-cookie-banner='accept']"));
			acceptCookies.click();
			

	}

}
