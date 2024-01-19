package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class GuestUser {
    public GuestUser(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
