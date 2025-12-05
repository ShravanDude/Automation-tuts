import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class FleetproLogin {

	public static void main(String[] args) throws InterruptedException, IOException {

		// System.setProperty("webdriver.gecko.driver",
		// "D:\\Users\\Shravan.Dude\\Documents\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.fleetnetpro.qa");
		driver.findElement(By.id("UserName")).sendKeys("SU");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("Password")).sendKeys("Test123#");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(15000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// driver.close();
		// String newUrl = driver.getCurrentUrl();
		// System.out.println(newUrl);
		driver.findElement(By.xpath("//input[@id='SearchCustID']")).sendKeys("124002");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@id='SearchCustomerGrid']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='submitbutton']")).click();
		Thread.sleep(9000);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@class='custom-combobox-input ui-widget ui-widget-content ui-state-default ui-corner-left ui-autocomplete-input']")).getText());
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//form/a")).click();
		// System.out.println(customerName);
		// driver.close();
		System.out.println("ok");
		//driver.close();
		
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\Users\\Shravan.Dude\\Documents\\autoscreenshot.png"));

	}

}
