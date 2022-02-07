package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Environment {
    private static WebDriver driver;            // there are 3 access modifiers: private (restricts access to method or variable to current class only)
                                                // protected - limits the access of the method or variable to the current package only
                                                // public - the variable or method can be accessed from anywhere
                                                //we have defined the driver variable to store the instance in which the driver will run
                                                //I used the static keyword to be able to access the driver variable through the class
    @Before                                     // The Before tag notifies the system that the next method that is being written must be run before all tests
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Costina/Desktop/Drivers/chromedriver_win32 (2)/chromedriver.exe");
        driver = new ChromeDriver();  //start driver
    }
    @After                                      //notifies the system that the next set of instructions must be executed after
    public void tearDown () throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }
    public static  WebDriver getDriver(){
        //the getDriver method is used to send the private variable to the driver and is declared static so that it can be accessed through the class
        return driver;
    }
    //a method / function is a set of instructions grouped under a specific name
    //when we want to execute the respective instruction we do not have to rewrite them but only to specify to the system the name under which they are
}
