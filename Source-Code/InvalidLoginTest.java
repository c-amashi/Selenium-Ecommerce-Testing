import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Invalid username
        driver.findElement(By.id("user-name"))
              .sendKeys("wrong_user");

        // Invalid password
        driver.findElement(By.id("password"))
              .sendKeys("wrong_password");

        // Click login
        driver.findElement(By.id("login-button"))
              .click();

        // Capture error message
        String errorMessage = driver.findElement(
                By.cssSelector("h3[data-test='error']"))
                .getText();

        System.out.println("Error Message: " + errorMessage);
        
        driver.quit();
    }
}
