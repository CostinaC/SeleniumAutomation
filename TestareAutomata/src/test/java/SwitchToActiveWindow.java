import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton  = driver.findElement(By.id("new-tab-button"));  // I identified the button that opens a new window
        newTabButton.click();  // I clicked on the previously identified button
        Thread.sleep(3000);
        for(String handle1: driver.getWindowHandles()){     //handle1 = tab1
            driver.switchTo().window(handle1);
        }
        driver.close();  // driver.close command closes only the active window

    }
}
