import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		//System.out.println(driver.findElement(By.cssSelector("//div[@class='a-row a-text-center']/img")).getText());
		//driver.close();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("mobiles").doubleClick().build().perform();
		
	a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Login')]"))).contextClick().build().perform();
		

	}

}
