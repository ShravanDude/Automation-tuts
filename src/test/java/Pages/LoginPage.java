package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

          WebDriver driver;
          
          By txt_username = By.id("txtUserName");
          By txt_password = By.id("txtPassword");
          By btn_login = By.className("btn-background");
          
          public LoginPage(WebDriver driver) {
        	  
        	  this.driver = driver;
        	  
          }
          
          public void enterUsername(String username) {
        	  driver.findElement(txt_username).sendKeys(username);
          }
          
          public void enterPassword(String password) {
        	  driver.findElement(txt_password).sendKeys(password);
          }
          
          public void clickLoginbutton() {
        	  driver.findElement(btn_login).click();
          }
          
          public void ValidateUserLogin(String username,String password) {
        	  
        	  driver.findElement(txt_username).sendKeys(username);
        	  driver.findElement(txt_password).sendKeys(password);
        	  driver.findElement(btn_login).click();
          }

}
