package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.fail;

public class EbayHome_steps {
    WebDriver driver = new Environment().getDriver();  //a variable called driver has been declared that stores the driver returned by the getDriver method
    public EbayHome_steps(){}                      //this is a builder that must be empty due to the dependence on Serenity
    @Given("I am on ebay home page")
    public void i_am_on_ebay_home_page() throws InterruptedException {
       driver.get("https://www.ebay.com/");
       Thread.sleep(5000);
       driver.manage().window().maximize();             //maximize the window to see the "Advanced" field
       Thread.sleep(2000);
    }
    @When("I click on the advanced search link")
    public void i_click_on_the_advanced_search_link() {
        WebElement advanced = driver.findElement(By.linkText("Advanced"));
        advanced.click();
    }
    @Then("I navigate to advaced search page")
    public void i_navigate_to_advaced_search_page() {
        String expURL = "https://www.ebay.com/sch/ebayadvsearch";
        String actURL = driver.getCurrentUrl();         //getCurrentURL extract the url of the page that is open
        if (!expURL.equals(actURL)) {
            fail("link does not navigate to the expected page");}
        else {
            System.out.println("Test has passed");
        }
    }
    /*
The components of a decision:
    1. the beginning of the decision(if)
    2. the conditional decision to be evaluated: what is inside the parentheses           T/F
    3.then - the branch on the right that is executed if the condition is true represented by the opening of the brace, set of instructions, and closing}
    4. else (the left branch that runs when the condition is false) - represented by the keyword else followed by {, set of instructions,}
    5. the end of the decision - which is represented by closing} at else or then if we don't have else
     */

}
