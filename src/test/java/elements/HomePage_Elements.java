package elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 18:31
 */
public class HomePage_Elements {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") public WebElement homePageSingInBtn;
    @FindBy(xpath = "//*[@id=\"email\"]") public WebElement emailField;
    @FindBy(xpath = "//*[@id=\"passwd\"]") public  WebElement passwdFiled;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]") public WebElement singInBtn;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li") public WebElement errorMsg;

    public HomePage_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
