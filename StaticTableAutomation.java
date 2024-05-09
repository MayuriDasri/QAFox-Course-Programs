package QAFox_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableAutomation {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/#");
		
		System.out.println("Table Head Data");
		List<WebElement> headData = driver.findElements(By.xpath("//table[@id='table1']//th"));
		for(WebElement data : headData)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Table Data");
		List<WebElement> td = driver.findElements(By.xpath("//table[@id='table1']//tr/th"));
		for(WebElement data : td)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Complete Table");
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//tr//*"));
		for(WebElement data : tableData)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Second Row Data");
		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td"));
		for(WebElement data : secondRowData)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Last Column Data");
		List<WebElement> lastColData = driver.findElements(By.xpath("//table[@id='table1']//tr//td[3]"));
		for(WebElement data : lastColData)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		
		System.out.println("------------------------------------------------------");
		System.out.println("Second Row Second Data");
		List<WebElement> secondRowSecondData = driver.findElements(By.xpath("//table[@id='table1']//tr[3]//td[2]"));
		for(WebElement data : secondRowSecondData)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Fourth Row Third Column");
		List<WebElement> fourthRowThirdColumn = driver.findElements(By.xpath("//table[@id='table1']//tr[4]//td[3]"));
		for(WebElement data : fourthRowThirdColumn)
		{
			String tdata = data.getText();
			System.out.println(tdata);
		}
		
		System.out.println("------------------------------------------------------");
		System.out.println("Row Count of Table");
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		System.out.println("Row Count is : "+rowCount.size());
		
		System.out.println("------------------------------------------------------");
		System.out.println("Column Count of Table");
		List<WebElement> colCount = driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("Column Count is : "+colCount.size());

		driver.quit();
		
	}

}
