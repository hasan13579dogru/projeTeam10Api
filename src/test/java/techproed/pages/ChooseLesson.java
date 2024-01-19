package techproed.pages;

import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class ChooseLesson {
    public ChooseLesson(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
