package steps;

import com.google.inject.Inject;
import helper.DriverBase;
import helper.Props;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Inject
    private DriverBase driverBase;

    @Before("@UI")
    public void setUp(){

    }

    @After("@UI")
    public void tearDown() throws Exception {
        driverBase.driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDriver(){
        return driverBase.driver;
    }

}
