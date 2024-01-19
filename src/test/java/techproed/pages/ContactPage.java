package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
