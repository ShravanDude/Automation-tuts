import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBtTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@target='_blank'][1]")).click();
		/*
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); 
		 * Set<String> windows=driver.getWindowHandles(); 
		 * Iterator<String> it = windows.iterator();
		 * String parent = it.next(); String child = it.next();
		 * driver.switchTo().window(child);
		 * System.out.println("*********after switching**********************");
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); Thread.sleep(2000); String[]
		 * exact=driver.findElement(By.xpath("//p[@class='im-para red']")).getText().
		 * split("at"); String[] email = exact[1].trim().split("with"); String
		 * formatEmail=email[0].trim(); driver.switchTo().window(parent);
		 * driver.findElement(By.cssSelector("#username")).sendKeys(formatEmail);
		 */
		
		
		
		

	}

}
