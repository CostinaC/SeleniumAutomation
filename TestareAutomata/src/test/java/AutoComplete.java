import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //start driver
                                                //I created a driver instance to be loaded into the program
                                                //The driver variable is an object in the ChromeDriver class. The driver variable has the WebDriver data type
                                                //date type = property that shows what kind of information can be stored in a variable
                                                //variable = symbols for an information, can contain a number, text, with which we can do various operations symbols for an information, can contain a number, text, with which we can do various operations
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        //the get method is used to open the web browser
        //methods = the actions of our objects
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  //here I identified the input field and the address identified by the "autocomplete" id
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")).click();
            WebElement street_number = driver.findElement(By.id("street_number"));
        street_number.sendKeys("teeeeesdttttttt");
        Thread.sleep(1000);
        driver.quit();
    }

}
