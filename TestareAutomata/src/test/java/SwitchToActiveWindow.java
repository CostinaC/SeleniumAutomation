import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //am creat o instanta a driverului care sa fie incarcata in program
        //variabila driver este un obiect al clasei ChromeDriver. Variabila driver are tipul de data WebDriver
        //tip de data = proprietate care arata ce fel de informatii pot fi stocate intr-o variabila
        //variabila = simboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatisimboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatii
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton  = driver.findElement(By.id("new-tab-button"));  //am identificat butonul care deschide o fereastra noua
        newTabButton.click();  //am dat clic pe butonul identificat anterior
        Thread.sleep(3000);
        for(String handle1: driver.getWindowHandles()){     //handle1 = tab1
            driver.switchTo().window(handle1);
        }
        driver.close();  //comanda driver.close inchide doar fereastra activa

    }
}
