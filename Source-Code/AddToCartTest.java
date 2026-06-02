import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    public static void main(String[] args){

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

        System.out.println("Product added to cart successfully");
        
        driver.quit();
    }
}
