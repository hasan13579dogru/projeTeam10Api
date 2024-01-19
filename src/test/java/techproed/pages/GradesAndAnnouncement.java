package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class GradesAndAnnouncement {
    public GradesAndAnnouncement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
