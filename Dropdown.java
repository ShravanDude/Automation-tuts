import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
             WebDriver driver = new FirefoxDriver();
             driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			 WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
             Select dropdown = new Select(staticdropdown);
             List<WebElement> list = dropdown.getOptions();
             
             driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
             Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
             //boolean checkbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
             //System.out.println(checkbox);
            // dropdown.selectByIndex(2);
            // System.out.println(dropdown.getFirstSelectedOption().getText());
             for(int i=0;i<4;i++) {
             System.out.println(list.get(i).getText());
             }
             driver.findElement(By.id("divpaxinfo")).click();
             Thread.sleep(1000);
             for (int i=1;i<5;i++) {
             driver.findElement(By.id("hrefIncAdt")).click();
             }
             driver.findElement(By.id("btnclosepaxoption")).click();
             System.out.println("after selecting: "+driver.findElement(By.id("divpaxinfo")).getText());
             //driver.close();
             
             //dynamic dropdown1
             Thread.sleep(2000);
             
             driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
             
             driver.findElement(By.xpath("//a[@value='HYD']")).click();
             Thread.sleep(1000);
             driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
             //driver.close();
             
	}

}
