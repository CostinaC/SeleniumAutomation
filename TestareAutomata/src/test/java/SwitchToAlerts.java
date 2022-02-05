import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //am creat o instanta a driverului care sa fie incarcata in program
        //variabila driver este un obiect al clasei ChromeDriver. Variabila driver are tipul de data WebDriver
        //tip de data = proprietate care arata ce fel de informatii pot fi stocate intr-o variabila
        //variabila = simboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatisimboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatii
        driver.get("https://formy-project.herokuapp.com/");
        driver.findElement(By.linkText("Switch Window")).click();
        Thread.sleep(3000);
        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();
        //scris direct: driver.findElement(By.id("alert-button")).click;
        Alert windowsAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        windowsAlert.dismiss();
        driver.quit();
    }
}
