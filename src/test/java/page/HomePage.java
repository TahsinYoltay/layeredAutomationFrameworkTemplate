package page;
import com.google.inject.Inject;
import helper.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @Inject
    public HomePage(DriverBase web){
        super(web);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a") public WebElement homePageSingInBtn;
    @FindBy(xpath = "//*[@id=\"email\"]") public WebElement emailField;
    @FindBy(xpath = "//*[@id=\"passwd\"]") public  WebElement passwdFiled;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]") public WebElement singInBtn;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div[1]/ol/li") public WebElement errorMsg;

    public void clickHomePageSignInBtn(){homePageSingInBtn.click();}
    public  void  clickUserNameField(String username){emailField.sendKeys(username);}
    public void clickPasswdFiled(String passwd){passwdFiled.sendKeys(passwd);}
    public void clickSignInBtn(){singInBtn.click();}
    public  String errMessageCheck(){
        return errorMsg.getText();}
    public void goToUrl(String url){
        web.driver.get(url);
    }

}
