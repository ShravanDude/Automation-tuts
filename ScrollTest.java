import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum =0;
		for(int i=0;i<values.size();i++) {
		
		//System.out.println(values.get(i).getText());
		sum = sum + Integer.parseInt(values.get(i).getText());
		
	}
		System.out.println(sum);
		String total=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		int totalvalue = Integer.parseInt(total);
		System.out.println(totalvalue);
		Assert.assertEquals(totalvalue, sum);
		System.out.println("************************************");
		List<WebElement> num = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int add = 0;
		for(int j=0;j<num.size();j++) {
			//System.out.println(num.get(j).getText());
			
			int val =Integer.parseInt(num.get(j).getText());
			add = add + val;
				
		}
		System.out.println(add);
	}
}
