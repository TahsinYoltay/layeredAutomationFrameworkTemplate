package steps;


import com.google.inject.Inject;
import page.HomePage;
import helper.DriverBase;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

@ScenarioScoped
public class HomePage_Steps {

    private DriverBase web;
    HomePage homePage;

    @Inject
    public HomePage_Steps(DriverBase web, HomePage homePage) {
        this.web = web;
        this.homePage = homePage;
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        homePage.goToUrl("http://www.automationpractice.com/");
    }

    @And("I navigate to Sing in Page")
    public void i_navige_to_sing_in_page() {
        homePage.clickHomePageSignInBtn();
    }

    @And("I fill username with {string}")
    public void i_fill_username_with(String string) {
        homePage.clickUserNameField(string);
    }

    @And("I fill password with {string}")
    public void i_fill_password_with(String string) {
        homePage.clickPasswdFiled(string);

    }

    @And("I click Sign in button")
    public void i_click_sign_in_button() {
        homePage.clickSignInBtn();
    }

    @Then("I should see the correct {string}")
    public void i_should_see_the_correct_message(String string) {
        Assert.assertEquals(homePage.errMessageCheck(),string);
    }
}
