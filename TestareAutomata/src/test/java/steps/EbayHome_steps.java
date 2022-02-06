package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.fail;

public class EbayHome_steps {
    WebDriver driver = new Environment().getDriver();  //s-a declarat o variabila numita driver care stocheaza driverul returnat de metoda getDriver
    public EbayHome_steps(){}                      //acesta este un constructor care trebuie sa fie gol din cauza dependintei de Serenity
    @Given("I am on ebay home page")
    public void i_am_on_ebay_home_page() throws InterruptedException {
       driver.get("https://www.ebay.com/");
       Thread.sleep(5000);
       driver.manage().window().maximize();             //maximizare fereastra pt a putea vedea "Advanced"
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
        String actURL = driver.getCurrentUrl();         //getCurrentURL extrage url paginii care este deschisa
        if (!expURL.equals(actURL)) {
            fail("link does not navigate to the expected page");}
        else {
            System.out.println("Test has passed");
        }
    }
    /*
    Componentele unei decizii:
    1. inceputul deciziei(if)
    2. decizia conditionala care se evalueaza: ce se afla in interiorul parantezelor            T/F
    3.then - ramura din dreapta care se executa  in cazul in care conditia este adevarata reprezentata de deschiderea acoladei, set de instructiuni, si inchiderea }
    4. else (ramura din stanga care se executa cand conditia este falsa) - reprezentata de keywordul else urmat de {, set de instructiuni, }
    5. sfarsitul deciziei - care este reprezentat de inchiderea } la else sau then in cazul in care nu avem else
     */

}
