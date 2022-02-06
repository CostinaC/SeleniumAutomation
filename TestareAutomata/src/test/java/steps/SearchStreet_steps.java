package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchStreet_steps {
    WebDriver driver = new Environment().getDriver();  //s-a declarat o variabila numita driver care stocheaza driverul returnat de metoda getDriver
    public SearchStreet_steps(){}
    @Given("I open the site")
    public void open_street_map(){
        driver.get("https://www.openstreetmap.org/");
    }
    @When("I insert data in the text search")
    public void insert_Data() throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[1]/div/div[1]/div/div[1]/input"));
        search.click();
        search.sendKeys("Strada Garii, Nr 85");
        Thread.sleep(2000);
    }
    @And("I click on the go button")
    public void clickbutton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement gobutton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form[1]/div/div[1]/div/div[2]/input"));
        gobutton.click();
        Thread.sleep(2000);
          }
    @Then("I should have  results return")
    public void returnresults(){
        System.out.println("Test passed");
    }

    //Scenario 2--------------------------------------
    @When("I click on direction button")
    public void direction ()  {
    WebElement clickdirection1 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/form[1]/div/div[2]/a"));
    clickdirection1.click();
    }

    @And("I insert address in the text boxes")
    public void insert_data_text_boxes() throws InterruptedException {
        WebElement first_field = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[2]/div[2]/div[2]/input"));
        first_field.click();
        first_field.sendKeys("Bucuresti");
        WebElement second_field = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[2]/div[3]/div[2]/input"));
        second_field.click();
        second_field.sendKeys("Brasov");
        Thread.sleep(2000);
    }
    @And("I click on the go route")
    public void goroute() throws InterruptedException {
        WebElement clickroute = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form[2]/div[4]/div[2]/input"));
        clickroute.click();
        Thread.sleep(2000);
    }
}
