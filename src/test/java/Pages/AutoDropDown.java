package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(5000);
        List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        
        for(WebElement option: options) {
        	if(option.getText().equalsIgnoreCase("India"))
        	{
        		option.click();
        		break;
        	}
        	
        }
        
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='HYD']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        WebElement dateInput = driver.findElement(By.className("ui-datepicker-calendar"));
        dateInput.click();
        
        Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
        monthDropdown.selectByVisibleText("May");
        
     // Select year
        Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
        yearDropdown.selectByVisibleText("2025");

        // Select day from calendar grid
       // WebElement calendar = driver.findElement(By.className("ui-datepicker-calendar"));
       // WebElement dayElement = calendar.findElement(By.xpath("//a[text()='" + 08 + "']"));
        //dayElement.click();
        
        
	}

}