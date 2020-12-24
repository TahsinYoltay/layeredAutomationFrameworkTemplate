package steps;

import com.google.inject.Inject;
import helper.DriverBase;
import helper.TestConfiguration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;

public class Hooks {
    private static Logger log;
    @Inject
    private DriverBase driverBase;

    @Before
    public static void beforeAll() throws Exception {
        TestConfiguration.loadAPropertiesFile("src/test/resources/testConfiguration.yaml");
    }

    @Before("@UI")
    public void setUp() throws Exception {

    }

    @After("@UI")
    public void tearDown() throws Exception {
        driverBase.driver.quit();
        Thread.sleep(1000);
    }

}
