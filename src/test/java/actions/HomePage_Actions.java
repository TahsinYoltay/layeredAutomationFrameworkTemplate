package actions;

import elements.HomePage_Elements;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

/**
 * Created by IntelliJ IDEA.
 * User: TAHSIN YOLTAY
 * Date: 16/12/2020
 * Time: 18:37
 */
public class HomePage_Actions {

    private WebDriver driver;
    HomePage_Elements homePage_elements;

    public HomePage_Actions (Hooks hooks){
        this.driver = hooks.getDrirver();
        homePage_elements = new HomePage_Elements(driver);
    }

    public void clickHomePageSignInBtn(){homePage_elements.homePageSingInBtn.click();}
    public  void  clickUserNameField(String username){homePage_elements.emailField.sendKeys(username);}
    public void clickPasswdFiled(String passwd){homePage_elements.passwdFiled.sendKeys(passwd);}
    public void clickSignInBtn(){homePage_elements.singInBtn.click();}
    public  String errMessageCheck(){
        return homePage_elements.errorMsg.getText();}

}
