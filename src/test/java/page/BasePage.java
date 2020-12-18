package page;

import helper.DriverBase;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected DriverBase web;

    public BasePage(DriverBase web){
        this.web = web;
        PageFactory.initElements(web.driver,this);
    }

}
