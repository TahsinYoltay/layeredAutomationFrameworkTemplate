package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    private WebDriver driver;

    @Before("@UI")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After("@UI")
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1000);
    }

    public WebDriver getDrirver(){
        return driver;
    }

}
