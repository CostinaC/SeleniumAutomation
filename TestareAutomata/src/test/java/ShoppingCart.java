import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class ShoppingCart {

    //Cautati un produs pe site-ul http://automationpractice.com/index.php si adaugati-l in shopping cart
    public static void tema1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("http://automationpractice.com/index.php");
        WebElement searchquerytop = driver.findElement(By.id("search_query_top"));
        Thread.sleep(2000);
        searchquerytop.sendKeys("Blouse");
        driver.findElement(By.cssSelector("#searchbox > button")).click();
        driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
//      WebElement proceedToCheckOut;
//      proceedToCheckOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")));
//      proceedToCheckOut.click();
        Thread.sleep(2000);
        driver.quit();
    }

    public static void tema2() throws InterruptedException {
        // Dati click pe butonul de youtube din partea dreapta jos pe site-ul http://automationpractice.com/index.php
        System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement youtube = driver.findElement(By.cssSelector("#social_block > ul > li.youtube > a"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", youtube);
        Thread.sleep(2000);
        //Actions actions = new Actions(driver);
        //actions.moveToElement(youtube); //am instruit browserul sa faca scroll pana cand ajunge in dreptul elementului name
        //actions.perform();
        youtube.click();
    }

    public static void tema3() throws InterruptedException {
        //Intrati in meniul dresses si dati click pe sub-meniul Casual Dresses
        System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a")).click();
        WebElement casualdresses = driver.findElement(By.xpath("//*[@id='subcategories']/ul/li[1]/h5/a"));
        casualdresses.click();
        driver.quit();

    }
    public static void tema4() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.openstreetmap.org");
    WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
    //String address = "hhhhhh";
        //String js = "arguments[0].setAttribute('value','"+address +"')";
        //((JavascriptExecutor) driver).executeScript(js, query);
    search.click();
    search.sendKeys("Strada Garii, Nr 85");
    Thread.sleep(2000);
      driver.quit();

    }
//For the ex. 3 write the steps implementation and run the test
//Using the following URL https://www.openstreetmap.org some tests that performs the following:
//1.Introduce an address in the search field, click on Go button, pick a result from the list
//2.Perform the same actions from point 1 for 5 different cities. Bucuresti, Cluj-Napoca, Bistrita, Sibiu, Ploiesti
//3.Click on direction button (the one near the Go one) and calculate a route by setting an address in From and To fields (e.g. between Bucharest and Cluj-Napoca). In the end click Go.
//4.Perform the same test as for point 3, by changing the profile in order to calculate the same route using all those available(bike, car & foot)
//5.Create another route between two locations using bike profile and click on each cell from the directions table
//6.Create a route between two destinations by your choice and get the Distance and Time values. Compare them with some hardcoded values.
//7.The last one would be to interact with the map by panning to different directions, zoom in, zoom out


    public static void main(String[] args) throws InterruptedException {
        //tema1();
        //tema2();
        //tema3();
        tema4();
    }


}
