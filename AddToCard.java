import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCard {

    public static void main(String[] args) throws InterruptedException {

        // WebDriver setup
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Implicit wait

        String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        // Wait for page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Thread.sleep(3000); // Consider replacing with WebDriverWait in some places

        // Add items to cart
        addItems(driver, itemsNeeded);

        // Proceed to checkout
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        Thread.sleep(5000);

        // Selecting country from dropdown
        WebElement countrySelect = driver.findElement(By.xpath("//select[@style='width: 200px;']"));
        Select options = new Select(countrySelect);
        List<WebElement> list = options.getOptions();

        // Print all countries (options) in the dropdown
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
        }

        // Close the browser
        driver.quit();
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}
