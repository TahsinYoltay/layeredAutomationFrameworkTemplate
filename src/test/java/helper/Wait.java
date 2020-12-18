package helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait {

    private WebDriver driver;

    public Wait(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void waitElement(WebElement element) {
        new WebDriverWait(driver, 5000);
//                until(ExpectedConditions.elementToBeClickable(element));
    }
}