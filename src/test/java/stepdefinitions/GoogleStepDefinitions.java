package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
GooglePage googlePage=new GooglePage();
    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }

    @When("user search for {string} on google")
    public void user_search_for_on_google(String string) {
        googlePage.googleSearchText.sendKeys(string+Keys.ENTER);
    }


    /*@Then("verify the page title contains mercedes")
    public void verify_the_page_title_contains_mercedes() {
Assert.assertTrue(Driver.getDriver().getTitle().contains("mercedes"));
    }*/

    @Then("close the application")
    public void close_the_application() {
Driver.closeDriver();
    }

   /* @When("user search for tesla on google")
    public void user_search_for_tesla_on_google() {
        googlePage.googleSearchText.sendKeys("tesla"+Keys.ENTER);
    }*/

    /*@Then("verify the page title contains tesla")
    public void verify_the_page_title_contains_tesla() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("tesla"));
    }*/
    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

}

