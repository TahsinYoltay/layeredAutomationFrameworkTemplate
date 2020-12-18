package helper;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;

@ScenarioScoped
public class DriverBase {
    public WebDriver driver = new DriverFactory().getManager();
//    public Support support = new Support();
    public Wait wait = new Wait(driver);
}
