import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollToElements {
           public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
            WebDriver driver = new ChromeDriver();  //am creat o instanta a driverului care sa fie incarcata in program
            //variabila driver este un obiect al clasei ChromeDriver. Variabila driver are tipul de data WebDriver
            //tip de data = proprietate care arata ce fel de informatii pot fi stocate intr-o variabila
            //variabila = simboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatisimboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatii
            driver.get("https://formy-project.herokuapp.com/scroll");
            WebElement name = driver.findElement(By.id("name"));
               Actions actions = new Actions(driver);
               actions.moveToElement(name); //am instruit browserul sa faca scroll pana cand ajunge in dreptul elementului name
               name.sendKeys("Cooooostinaaaaaaa");
               WebElement date = driver.findElement(By.id("date"));
               date.sendKeys("30/10/2022");
               Thread.sleep(3000);
               driver.quit();

    }
}
