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
    WebDriver driver = new Environment().getDriver();  //s-a declarat o variabila numita driver care stocheaza driverul returnat de metoda getDriver
    public Autocomplete_steps(){}//acesta este un constructor care trebuie sa fie gol din cauza dependintei de Serenity
    @Given("I am on herokuapp.com")
    public void i_am_on_herokuapp_com() {
        driver.get("https://formy-project.herokuapp.com/autocomplete");
    }
    @When("I insert some text in the autocomplete field")
    public void i_insert_some_text_in_the_autocomplete_field() throws InterruptedException {
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));  //aici am identificat input fieldulpt adresa identificat prin idul "autocomplete"
        autocomplete.sendKeys("Municipiul Iaşi, Str. Sf. Lazăr, Nr. 27A, CLĂDIREA UNITED BUSINESS CENTER 5, Etaj 2, Județ Iaşi");
        //Thread.sleep(3000);     //se asteapta 3 secunde
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteresults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.pac-container > div > table > tr > td:nth-child(2) > button")));
        //s-a definit variabila cu care sa accesam metodele de asteptare
        autocompleteresults.click();
    }
    @Then("I can consider my test passed")
    public void i_can_consider_my_test_passed() {
        System.out.println("The test has passed");

    }

}
