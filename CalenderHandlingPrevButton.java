package QAFox_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandlingPrevButton {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
		
		String expectedMonth = "June";
		String expectedYear = "2022";
		String expectedDate = "15";
		String futureYear = "2025";
		
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		
		WebElement currentMonthElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']"));
		String currentMonth = currentMonthElement.getText();
		WebElement currentYearElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']"));
		String currentYear = currentYearElement.getText();
		
		int year = 2022;
		int cyear = Integer.parseInt(currentYear);
		
		if(cyear < year)
		{
			
			while(!(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)))
			{
				WebElement prevButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']"));
				prevButton.click();
				
				
				currentMonthElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']"));
				currentMonth = currentMonthElement.getText();
				currentYearElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']"));
				currentYear = currentYearElement.getText();
			}
		}
		else
		{
			while(!(currentMonth.equals(expectedMonth) && currentYear.equals(futureYear)))
			{
				
				WebElement nextButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
				nextButton.click();
				
				currentMonthElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']"));
				currentMonth = currentMonthElement.getText();
				currentYearElement = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']"));
				currentYear = currentYearElement.getText();
			}
		}
		
		String xpathText = "//a[normalize-space()='"+expectedDate+"']";
		WebElement date = driver.findElement(By.xpath(xpathText));
		date.click();
		
		
		
		
		
	}
	

}
