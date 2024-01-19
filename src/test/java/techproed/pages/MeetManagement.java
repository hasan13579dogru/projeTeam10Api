package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MeetManagement {
    public MeetManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //US19-TC001--
    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@placeholder='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "(//a)[2]")
    public WebElement login;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Hi']")
    public WebElement hi;

    @FindBy(xpath = "(//div[text()='Main Menu'])[2]")
    public WebElement mainMenu;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagement;

    @FindBy(xpath = "//h5[text()='Add Meet']")
    public WebElement addMeet;

    @FindBy(xpath = "//h5[text()='Meet List']")
    public WebElement meetList;

    @FindBy(xpath = "//div[text()='Select Students']/following-sibling::div")
    public WebElement chooseStudents;

    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement required;

    @FindBy(xpath = "(//div[text()='Required'])[2]")
    public WebElement required2;

    @FindBy(xpath = "(//div[text()='Required'])[3]")
    public WebElement required3;

    @FindBy(xpath = "(//div[text()='Required'])[4]")
    public WebElement required4;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement dateOfMeet;

    @FindBy(xpath = "//input[@type='time']")
    public WebElement startTime;

    @FindBy(xpath = "(//input[@type='time'])[2]")
    public WebElement stopTime;

    @FindBy(xpath = "//input[@placeholder='Description']")
    public WebElement description;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[text()='Meet Saved Successfully'])[1]")
    public WebElement succesfullyTextVerify;

    @FindBy(xpath = "//div[text()='Edit Meet']")
    public WebElement editMeetText;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//h1[text()=' Are you really want to logout ? ']")
    public WebElement logoutText;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "//div[text()='muss ein Datum in der Zukunft sein']")
    public WebElement eskiTarihHatasi;

    @FindBy(xpath = "//button[@class='text-dark btn btn-outline-info']")
    public WebElement editButton;

    @FindBy(xpath = "(//input[@id='date'])[2]")
    public WebElement dateMeet;

    @FindBy(xpath = "(//input[@id='startTime'])[2]")
    public WebElement start;

    @FindBy(xpath = "(//input[@id='stopTime'])[2]")
    public WebElement stop;

    @FindBy(xpath = "(//input[@id='description'])[2]")
    public WebElement description2;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmitButton;

    @FindBy(xpath = "(//div[contains(@class,'Toastify__toast-icon Toastify--animate-icon')]/following-sibling::div)[2]")
    public WebElement editErrorMessage;

    @FindBy(xpath = "(//div[text()='Meet Updated Successfully'])[2]")
    public WebElement editSuccessfulyTextVerify;

    @FindBy(xpath = "//div[@aria-label='Remove Team10Student Team10']")
    public WebElement studentDelete;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement meetDelete;

    @FindBy(xpath = "(//div[text()='Meet deleted successfully'])[2]")
    public WebElement meetDeleteSuccessfullyText;

    /*@FindBy(xpath = "//tbody//tr")
    public List<WebElement> meetList;

     */

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement warningMessage;
}
