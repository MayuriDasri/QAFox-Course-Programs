package QAFox_Practise;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampeDemoOne {

	public static void main(String[] args) throws IOException, Exception {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,new File("ScreenShots\\IHerkoApp.png"));
		
		WebElement jsAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		jsAlert.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dimension);
		BufferedImage bufferedImage = robot.createScreenCapture(rect);
		String destPath = System.getProperty("user.dir")+"\\ScreenShots\\Alert.png";
		ImageIO.write(bufferedImage,"png", new File(destPath));
		
	}

}
