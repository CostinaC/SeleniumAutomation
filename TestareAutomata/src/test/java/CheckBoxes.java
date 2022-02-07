import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //I created a driver instance to be loaded into the program
        // The driver variable is an object in the ChromeDriver class. The driver variable has the WebDriver data type
        // date type = property that shows what kind of information can be stored in a variable
        // variable = symbols for an information, can contain a number, text, with which we can do various operations symbols for an information, can contain a number, text, with which we can do various operations
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.cssSelector("#checkbox-2")).click();
        driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]")).click();  //identify element based on xpath which is the html address where the element is located

    }
}