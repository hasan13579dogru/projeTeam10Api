package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LessonManagement {
    public LessonManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //US009
    @FindBy(xpath = "//h3[@class='fw-bold p-3 card-header'][1]")
    public WebElement eduTermManageYazisi;


    @FindBy(xpath = "//button[@class='nav-link active']")
    public WebElement clickLesson;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement selectCompulsory;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScore;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg'][2]")
    public WebElement addLessonSubmit;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteLesson;

    @FindBy(xpath = "//a[@class='page-link'][8]")
    public WebElement lastLessonPage;


    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover'][2]")
    public WebElement lessonsTable;

    //US010

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement clickLessonProgram;

    @FindBy(xpath = "//h3[text()='Lesson Program Management']")
    public WebElement lessonProgramManageYazisi;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement selectLesson;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDay;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "//button[text()='Submit'][3]")
    public WebElement addLessonProgSubmit;



}
