package actions;

import org.openqa.selenium.WebDriver;
import steps.Hooks;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 04/12/2020
 * Time: 22:49
 */
public class CommonActions {

    private WebDriver driver;
    Hooks hooks;

    public CommonActions(Hooks hooks) {
        this.driver = hooks.getDrirver();
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public  void quitWebDriver(){
        driver.quit();
    }
}
