package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autocomplete_steps {
    WebDriver driver = new Environment().getDriver();  //a variable called driver has been declared that stores the driver returned by the getDriver method
    public Autocomplete_steps(){}//this is a builder that must be empty due to the dependence on Serenity
    @Given("I am on herokuapp.com")
    public void i_am_on_herokuapp_com() {
        driver.get("https://formy-project.herokuapp.com/autocomplete");
    }
    @When("I insert some text in the autocomplete field")
    public void i_insert_some_text_in_the_autocomplete_field() throws InterruptedException {
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  //here we identified the input fieldulpt the address identified by the id "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        //Thread.sleep(3000);     //waits 3 sec
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteresults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")));
        //the variable with which to access the waiting methods has been defined
        autocompleteresults.click();
    }
    @Then("I can consider my test passed")
    public void i_can_consider_my_test_passed() {
        System.out.println("The test has passed");

    }

}
