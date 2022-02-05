import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //pornire driver
                                                //am creat o instanta a driverului care sa fie incarcata in program
                                                //variabila driver este un obiect al clasei ChromeDriver. Variabila driver are tipul de data WebDriver
                                                //tip de data = proprietate care arata ce fel de informatii pot fi stocate intr-o variabila
                                                //variabila = simboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatisimboluri pentru o informatie, poate contine un nr, text, cu care putem face diverse operatii
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //metoda get este folosita pt a putea deschide browserul web
        //metodele = actiunile pe care le fac obiectele noastre
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  //aici am identificat input fieldulpt adresa identificat prin idul "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        Thread.sleep(3000);     //se asteapta 3 secunde
        driver.findElement(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")).click();
        //aici am identificat un element pe baza de cssSelector

        WebElement street_number = driver.findElement(By.id("street_number"));
        street_number.sendKeys("teeeeesdttttttt");
        Thread.sleep(1000);
        driver.quit(); //cu aceasta instructiune se inchide complet browserul de chrome
    }

}
