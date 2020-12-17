package steps;

import actions.CommonActions;
import actions.HomePage_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 18:20
 */
public class HomePage_Steps {

    CommonActions commonActions;
    HomePage_Actions homePage_actions;

    public HomePage_Steps(CommonActions commonActions, HomePage_Actions homePage_actions) {
        this.commonActions = commonActions;
        this.homePage_actions = homePage_actions;
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        this.commonActions.goToUrl("http://www.automationpractice.com/");

    }

    @And("I navigate to Sing in Page")
    public void i_navige_to_sing_in_page() {
        homePage_actions.clickHomePageSignInBtn();
    }

    @And("I fill username with {string}")
    public void i_fill_username_with(String string) {
        homePage_actions.clickUserNameField(string);
    }

    @And("I fill password with {string}")
    public void i_fill_password_with(String string) {
        homePage_actions.clickPasswdFiled(string);

    }

    @And("I click Sign in button")
    public void i_click_sign_in_button() {
        homePage_actions.clickSignInBtn();
    }

    @Then("I should see the correct {string}")
    public void i_should_see_the_correct_message(String string) {
        Assert.assertEquals(homePage_actions.errMessageCheck(),string);
    }
}
