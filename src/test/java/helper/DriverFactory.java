package helper;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public WebDriver getManager() {
        return new ChromeManager().getDriver();
    }
}