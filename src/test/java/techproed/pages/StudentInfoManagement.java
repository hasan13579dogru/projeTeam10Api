package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class StudentInfoManagement {
    public StudentInfoManagement(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    @FindBy(xpath = "//a[@class='header_link ms-2']")
//    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;


    @FindBy(xpath = "//h3")
    public WebElement studentInfoManagement; //Student Info Management sayfasında olduguna dair locator

    @FindBy(xpath = "//select[@id='lessonId']")
    public WebElement lessonId;

    @FindBy(xpath = "//select[@id='studentId']")
    public WebElement studentId;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement educationTerm;

    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee;

    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam;

    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submit;

    @FindBy(xpath = "//div[text()='Student Info saved Successfully']")
    public WebElement successfulLogin; //Teacher öğrenciyi başarıyla kaydetti

    @FindBy(xpath = "//*[text()=\"'100.0' değerinden küçük yada eşit olmalı\"]")
    public WebElement NotAralikHatasiBS;

    @FindBy(xpath = "//div[text()=\"'0.0' değerinden büyük yada eşit olmalı\"]")
    public WebElement NotAralikHatasiKS;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement NotHarfHatasi;

    @FindBy(xpath = "//div[text()='Info should be at least 10 characters']")
    public WebElement infoNoteKarakterSayisiHatasi;

    @FindBy(xpath = "(//div[text()='Required'])[1]")
    public WebElement absenteeRequired;

    @FindBy(xpath = "(//div[text()='Required'])[2]")
    public WebElement midtermExamRequired;

    @FindBy(xpath = "(//div[text()='Required'])[3]")
    public WebElement finalExamRequired;

    @FindBy(xpath = "(//div[text()='Required'])[4]")
    public WebElement infoNoteRequired;


    @FindBy(xpath = "//div[text()='Please select lesson']")
    public WebElement lessonBosBirakilamazMesaji; //Lesson alanı boş bırakılamaz

    @FindBy(xpath = "//div[text()='Please select student']")
    public WebElement studentBosBirakilamazMesaji; //Student alanı boş bırakılamaz

    @FindBy(xpath = "//div[text()='Please select education term ']")
    public WebElement educationTermBosBirakilamazMesaji; //Education Term alanı boş bırakılamaz

    //Student info List alanı
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]/span")
    public WebElement verifyName;  //name alanı (dogrulama)  Choose Student

    @FindBy(xpath = "//table/tbody/tr[1]/td[2]/span")//
    public WebElement verifyLessonName;  //LessonName dogrulama Choose Lesson

    @FindBy(xpath = "//table/tbody/tr[1]/td[3]/span")
    public WebElement verifyAbsentee;  //absentee dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[4]/span")
    public WebElement verifyMidtermExam;  //Midterm Exam dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[5]/span")
    public WebElement verifyFinalExam;  //Final Exam dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[6]/span")
    public WebElement verifyNote;  //Note dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[7]/span")
    public WebElement verifyInfoNote;  //Info Note dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[8]/span")
    public WebElement verifyAverage;  //Average dogrulama

    @FindBy(xpath = "//table/tbody/tr[1]/td[9]/span")
    public WebElement editButton;  //Edit butonu locator

    //Edit alanı locatorleri
    @FindBy(xpath = "(//select[@id='lessonId'] )[2]")
    public WebElement editLesson;  //Edit alanındaki lesson locat

    @FindBy(xpath = "(//select[@id='educationTermId'])[2]")
    public WebElement editEducationTerm;  //Edit alanındaki Education Term locat

    @FindBy(xpath = "(//input[@id='absentee'])[2]")
    public WebElement editAbsentee;  //Edit alanındaki Absentee locat

    @FindBy(xpath = "(//input[@id='midtermExam'])[2]")
    public WebElement editMidtermExam;  //Edit alanındaki Midterm Exam locat

    @FindBy(xpath = "(//input[@id='finalExam'])[2]")
    public WebElement editFinalExam;  //Edit alanındaki FinalExam locat

    @FindBy(xpath = "(//input[@id='infoNote'])[2]")
    public WebElement editInfoNote;  //Edit alanındaki Info Note locat

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmit;  //Edit alanındaki Submit locat

    @FindBy(xpath = "//div[text()='Student Info updated Successfully']")
    public WebElement editIslemiBasarili;  //Edit olayı başarıyla gerçekleşti

    @FindBy(xpath = "(//button[@class='btn-close'])[3]")
    public WebElement editCikis;  //Edit sayfası çıkış locat

    @FindBy(xpath = "//table//tbody//tr//td[10]//span")
    public WebElement deleteButton;  //Edit

    @FindBy(xpath = "//div[text()='Student Info deleted Successfully']")
    public WebElement silmeIslemiBasarili;  //Öğrenci not bilgisini silme işlemi başarıyla gerçekleşti

    @FindBy(xpath = "//h5[text()='Student Info List']")
    public WebElement studentInfoListBaslik;  //Student Info List baslığı locators
}