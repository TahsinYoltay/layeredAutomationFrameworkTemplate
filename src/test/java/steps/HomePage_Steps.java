package steps;


import com.google.inject.Inject;
import helper.DriverBase;
import helper.TestConfiguration;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import page.HomePage;

@ScenarioScoped
public class HomePage_Steps {

    final HomePage homePage;

    @Inject
    public HomePage_Steps(DriverBase web, HomePage homePage) {
        this.homePage = homePage;
    }


    /**
     * Go to home page
     *
     * @param url
     */
    @Given("I am on the automationpractice.com {string}")
    public void i_am_on_the_homepage(String url) {
        String homepage = TestConfiguration.getProperty("webURL." + url);
        homePage.goToUrl(homepage);
    }

    /**
     * Navigate to Sing in Page
     */
    @And("I navigate to Sing in Page")
    public void i_navige_to_sing_in_page() {
        homePage.clickHomePageSignInBtn();
    }

    /**
     * Type the user name
     *
     * @param string
     */
    @And("I fill username with {string}")
    public void i_fill_username_with(String string) {
        homePage.clickUserNameField(string);
    }

    /**
     * Type the password
     *
     * @param string
     */
    @And("I fill password with {string}")
    public void i_fill_password_with(String string) {
        homePage.clickPasswdFiled(string);

    }

    /**
     * Click sign in button
     */
    @And("I click Sign in button")
    public void i_click_sign_in_button() {
        homePage.clickSignInBtn();
    }

    /**
     * Verify error messages
     *
     * @param string
     */
    @Then("I should see the correct {string}")
    public void i_should_see_the_correct_message(String string) {
        Assert.assertEquals(homePage.errMessageCheck(), string);
    }
}
