package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TeacherAdd {
    public TeacherAdd(){
        PageFactory.initElements(Driver.getDriver(),this);}


  /*
   @FindBy(xpath = "")
   public WebElement ;
   */
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement Login;

    ////input[@id='username']
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameAdminUS24;







}
