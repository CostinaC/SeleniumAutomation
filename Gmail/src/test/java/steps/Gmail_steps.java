package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Gmail_steps {
    WebDriver driver = new Environment().getDriver();  //s-a declarat o variabila numita driver care stocheaza driverul returnat de metoda getDriver
    public Gmail_steps(){}
    @Given("I access the site www.gmail.com")
    public void access_gmail(){
     driver.get("www.gmail.com");
    }
    @When("I click on Creati un cont nou")
    public void create_button(){
        WebElement createbutton = driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
        createbutton.click();
    }
}


