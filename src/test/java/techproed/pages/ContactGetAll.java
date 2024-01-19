package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class ContactGetAll {

    public ContactGetAll() {
        PageFactory.initElements(Driver.getDriver(),this);}

    //Dean olarak giriş(enter as a Dean)
    @FindBy(xpath ="//a[@class='header_link ms-2']")
    public WebElement loginButtonAnaSayfa;

    @FindBy(id="username")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginBelow;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu;
    //contact get all bolumu
    @FindBy(xpath = "//*[text()='Contact Get All']")
    public WebElement contactGetAllBtn;
    @FindBy(xpath = "//*[text()='Contact Message']")
    public WebElement contactMessageTxt;

    @FindBy(id="Name")
    public WebElement NameTxt;

    @FindBy(id="Email")
    public WebElement EmailTxt;

    @FindBy(id="Date")
    public WebElement DateTxt;


    @FindBy(id="Subject")
    public WebElement SubjectTxt;

    @FindBy(id="Message")
    public WebElement MessageTxt;






    //US016 LOCATE
    @FindBy(xpath = "(//*[@role='button'])[21]")
    public WebElement contactGetAll;
    @FindBy(xpath = "(//th[1])")
    public WebElement nameTitle;
    @FindBy(xpath = "(//th[2])")
    public WebElement emailTitle;
    @FindBy(xpath = "(//th[3])")
    public WebElement dateEmail;
    @FindBy(xpath = "(//th[4])")
    public WebElement subjectTitle;
    @FindBy(xpath = "(//th[5])")
    public WebElement messageTitle;
    @FindBy(xpath = "//tr")
    public List<WebElement> satir;
    @FindBy(xpath = "//tr//td[1]")
    public List<WebElement> nameVerify;
    @FindBy(xpath = "//tr//td[2]")
    public List<WebElement> emailVerify;
    @FindBy(xpath = "//tr//td[3]")
    public List<WebElement> dateVerify;
    @FindBy(xpath = "//tr//td[4]")
    public List<WebElement> subjectVerify;
    @FindBy(xpath = "//tr//td[5]")
    public List<WebElement> messageVerify;
    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement deleteVerify;



}
