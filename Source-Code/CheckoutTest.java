import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {

    public static void main(String[] args)throws InterruptedException  {

        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
              .click();

        // Open cart
        driver.findElement(By.className("shopping_cart_link"))
              .click();

        // Click checkout
        driver.findElement(By.id("checkout"))
              .click();

        // Fill checkout form
        driver.findElement(By.id("first-name"))
              .sendKeys("Chaduki");

        driver.findElement(By.id("last-name"))
              .sendKeys("Amashi");

        driver.findElement(By.id("postal-code"))
              .sendKeys("10000");

        // Continue checkout
        driver.findElement(By.id("continue"))
              .click();

        // Finish order
        driver.findElement(By.id("finish"))
              .click();

        System.out.println("Checkout completed successfully");
        
        Thread.sleep(10000);
        driver.quit();
    }
}
