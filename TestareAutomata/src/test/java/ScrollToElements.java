import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollToElements {
           public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://formy-project.herokuapp.com/scroll");
            WebElement name = driver.findElement(By.id("name"));
               Actions actions = new Actions(driver);
               actions.moveToElement(name); // I instructed the browser to scroll until it reaches the name element
               name.sendKeys("Cooooostinaaaaaaa");
               WebElement date = driver.findElement(By.id("date"));
               date.sendKeys("30/10/2022");
               Thread.sleep(3000);
               driver.quit();

    }
}
