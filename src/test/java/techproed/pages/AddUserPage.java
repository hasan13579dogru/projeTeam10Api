package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

import java.util.List;

public class AddUserPage {
    public AddUserPage(){PageFactory.initElements(Driver.getDriver(),this);}

    //Menu Basliklar

    @FindBy(xpath = "//a[text()='Admin Management']")
    public WebElement adminMannagement;

    @FindBy(xpath = "//a[text()='Dean Management']")
    public WebElement deanMannagement;
    @FindBy(xpath = "(//*[@class='text-white'])[1]")
    public WebElement viceDeanMannagement;
    @FindBy(xpath = "//a[text()='Teacher Management']")
    public WebElement teacherMannagement;
    @FindBy(xpath = "//a[text()='Student Management']")
    public WebElement studentMannagement;

    //Lis bolumu locetleri

    //List baslik
    @FindBy(xpath = "(//tr[1]//th[1])[1]")
    public WebElement nameBaslik;

    @FindBy(xpath = "(//tr[1]//th[2])[1]")
    public WebElement phoneBaslik;

    @FindBy(xpath = "(//tr[1]//th[3])[1]")
    public WebElement ssnBaslik;

    @FindBy(xpath = "(//tr[1]//th[4])[1]")
    public WebElement usernameBaslik;



    //List ilk satir verileri
    @FindBy(xpath = "(//h5)[2]")
    public WebElement list;//List baslik
    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement listNameVeri;//List Name
    @FindBy(xpath = "(//tr//td)[2]")
    public WebElement listPhoneNumberVeri;//List PhoneNumber
    @FindBy(xpath = "(//tr//td)[3]")
    public WebElement listSsnVeri;//List Ssn
    @FindBy(xpath = "(//tr//td)[4]")
    public WebElement listUserNameVeri;//List Name

    //Edit bolumu locatleri
    @FindBy(xpath = "(//tr//td)[5]")//Edit button==> son satirin locati olmali
    public WebElement editButton;
    @FindBy(xpath = "(//select[@id='advisorTeacherId'])[2]")
    public WebElement chooseLessonsEdit;
    @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]")
    public WebElement LessonSelectEdit;

    @FindBy(xpath = "(//input[@placeholder='Name'])[2]")
    public WebElement nameEdit;

    @FindBy(xpath = "(//input)[16]")
    public WebElement surnameEdit;

    @FindBy(xpath = "(//input)[17]")
    public WebElement birthEdit;
    @FindBy(xpath = "(//input)[18]")
    public WebElement emailEdit;
    @FindBy(xpath = "(//input)[19]")
    public WebElement phoneEdit;
    @FindBy(xpath = "(//input)[20]")
    public WebElement SsnEdit;
    @FindBy(xpath = "(//input)[21]")
    public WebElement advisorEdit;
    @FindBy(xpath = "(//input)[22]")
    public WebElement femaleEdit;
    @FindBy(xpath = "(//input)[23]")
    public WebElement maleEdit;
    @FindBy(xpath = "(//input)[24]")
    public WebElement dateOfBirthEdit;
    @FindBy(xpath = "(//input)[25]")
    public WebElement userNameEdit;
    @FindBy(xpath = "(//input)[26]")
    public WebElement passwordEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[10]")
    public WebElement requaredNameEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]")
    public WebElement requaredSurnameEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[12]")
    public WebElement requaredBirthPlaceEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[13]")
    public WebElement requaredEmailEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[14]")
    public WebElement requaredPhoneEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[15]")
    public WebElement requaredSsnEdit;//Minimum 11 character (XXX-XX-XXXX) + Requared yazisi
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[16]")
    public WebElement requaredDateOfBirthEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[17]")
    public WebElement requaredUserNameEdit;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[18]")
    public WebElement requaredPasswordEdit;//At least 8 characters + One number + One uppercase character + One lowercase character

    @FindBy(xpath = "(//button)[29]")
    public WebElement bSubmitdEdit;

    //==>Basarili ve basarisiz login mesajlari
    @FindBy(xpath =
            "//*[@class='Toastify__toast-body']")
    public WebElement verifyMessaj;//Please enter valid email /Please enter valid ssn /Please enter valid phone number/Teacher saved successfully

    @FindBy(xpath = "(//a)[2]")
    public WebElement login;

    //login ol
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='password']")
    public WebElement passsword;

    @FindBy(xpath = "(//button)[3]")
    public WebElement loginButton;

    //Admin Management/Dean Management/Vice Dean Management/Education Term Management/Student Info Management/Choose Lesson Management/ Student Management/Teacher Management yazısını
    @FindBy(xpath = "//h3")
    public WebElement managementVerifyTitle;

    //Menu buttonu
    @FindBy(xpath = "(//button)[1]")
    public WebElement menuButton;

    //Sol tarafta acılan  Main Menu basligi
    @FindBy(xpath = "(//*[@class='offcanvas-body'])[2]")
    public WebElement mainMenu;


    //Add Admin/Dean/Vice Dean/Student/Teacher yazisinin
    @FindBy(xpath = "//h5")
    public WebElement addKullaniciYazisi;

    //Choose Advisor alanı
    @FindBy(xpath = "(//select[@id='advisorTeacherId'])[1]")
    public WebElement selectTeacherDdm;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement selectLesson;

    //Name alanı
    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    //Surname alanı
    @FindBy(xpath = "//*[@id='surname']")
    public WebElement surname;

    //Birth Place alanı
    @FindBy(xpath = "//*[@id='birthPlace']")
    public WebElement birthPlace;
    //Email alanı
    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    //Phone alanı
    @FindBy(xpath = "//*[@id='phoneNumber']")
    public WebElement phone;
    //Gender
    @FindBy(xpath = "(//*[@name='gender'])[1]")
    public WebElement female;
    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement male;

    //Date Of Birth alanı
    @FindBy(xpath = "//*[@id='birthDay']")
    public WebElement birthday;
    //Ssn alanı
    @FindBy(xpath = "//*[@id='ssn']")
    public WebElement ssn;

    //User Name alanı
    @FindBy(css = "#username")
    public WebElement userName;

    //Password alanını
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    //Mother Name alanı
    @FindBy(xpath = "//*[@id='motherName']")
    public WebElement motherName;

    @FindBy(xpath = "//*[@id='fatherName']")
    public WebElement fatherName;

    //Submit butonuna tıkla
    @FindBy(xpath = "(//button)[5]")
    public WebElement submitButton;
    @FindBy(xpath = "(//button)[7]")
    public WebElement submitTeacherButton;

    //Olusturdugun  Studentin oldugu satira gitmek icin listedeki son sayfaya giden tus
    @FindBy(xpath = "//*[.='Last']")
    public WebElement listeSonuButonu;

    @FindBy(xpath = "(//tr)[last()]")
    public WebElement listSonSatir;

    //Required yazisi
    @FindBy(xpath = "(//*[.='Required'])[1]")
    public WebElement nameRequired;
    @FindBy(xpath = "(//*[.='Required'])[2]")
    public WebElement surnameRequired;
    @FindBy(xpath = "(//*[.='Required'])[3]")
    public WebElement birtPlaceRequired;
    @FindBy(xpath = "(//*[.='Required'])[4]")
    public WebElement emailRequired;
    @FindBy(xpath = "(//*[.='Required'])[5]")
    public WebElement phoneRequired;
    @FindBy(xpath = "(//*[.='Required'])[6]")
    public WebElement dateOfRequired;
    @FindBy(xpath = "(//*[.='Required'])[7]")
    public WebElement ssnRequired;
    @FindBy(xpath = "(//*[.='Required'])[8]")
    public WebElement userNameRequired;
    @FindBy(xpath = "(//*[.='Required'])[9]")
    public WebElement fatherRequired;
    @FindBy(xpath = "(//*[.='Required'])[10]")
    public WebElement motherRequired;
    @FindBy(xpath = "(//*[@class='invalid-feedback'])[11]")
    public WebElement passwordemassege;

    //saved Sccessfully mesajini
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public List<WebElement> userMessagesVerify;

    //saved Sccessfully mesajini
    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement userMessageVerify;

    //List baslik
    @FindBy(xpath = "(//h5)[2]")
    public WebElement studentListVerify;


    //US15-US22 LOCATE
    @FindBy(xpath = "(//*[@name='gender'])[2]")
    public WebElement gender;
    @FindBy(xpath = "(//*[@class='card-body'])[1]")
    public WebElement addStudent;
    @FindBy(xpath = "//*[text()='Student saved Successfully']")
    public WebElement successfullyMessage;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement minumumCharacterPhone;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement minumumCharacterSsn;
    @FindBy(xpath = "//div[text()='Error: User with ssn 562-84-9523 already register']")
    public WebElement ErrorUserSsn ;
    @FindBy(xpath = "//div[text()='Error: User with phone number 312 546 9836 already register']")
    public WebElement errorUserPhone ;
    @FindBy(xpath = "//*[text()='Student saved Successfully']")
    public WebElement studentSavedMessage ;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phonemissingmessage;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[7]")
    public WebElement ssnmissingmessage;

    @FindBy(xpath = "//*[@role='alert']")
    public WebElement alertMessage;

    // is Advicer Teacher Checkbox
    @FindBy(xpath = "//*[@type='checkbox']")
    public WebElement isAdvicerTeacherCheckbox;



    //  >> Buton Locate
    @FindBy(xpath = "(//*[@class='page-link'])[5]")//>> işareti locati
    public WebElement sonkayitgit;


    // EditButon En son sayfanın en son edit butonu
    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[15]")
    public WebElement editButon;

    //ViceDean Teacher List Başlıkları(Edit yapmak için )
    @FindBy(xpath = "(//h5[@class='fw-bold p-3 card-header'])[2]")
    public WebElement TeacherList;

    @FindBy(xpath = "(//th[text()='Name'])[1]")
    public  WebElement NameEdit;

    @FindBy(xpath = "//th[text()='Phone Number']")
    public WebElement PhoneNumberEdit;

    @FindBy(xpath = "(//th[text()='Ssn'])[1]")
    public WebElement SSNEdit;

    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement UserNameEdit;

    // Chose Lesson Edit
    @FindBy(xpath = "(//input[@role='combobox'])[2]")
    public  WebElement chooseLessonEdit;

    // Edit penceresinden submitButonu
    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement submitButonEdit;


    //US005 edit button
    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[8]")
    public WebElement lastEditButton;
    @FindBy(xpath = "//span[text()='»']")
    public WebElement lastOfList;
    @FindBy(xpath = "(//input[@value='MALE'])[2]")
    public WebElement editMale;
    @FindBy(xpath = "(//input[@id='password'])[2]")
    public WebElement editPassword;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editSubmit;
    @FindBy(xpath = "(//*[@role='alert'])[1]")
    public WebElement editUpdate;


    //25 hasan

    @FindBy(xpath ="//a[@class='header_link ms-2']")
    public WebElement loginButtonAnaSayfa;



    // ViceDean Edit Locateries
    @FindBy(xpath = "(//*[@id='name'])[2]")
    public WebElement editTeacherName;
    @FindBy(xpath = "(//*[@id='surname'])[2]")
    public WebElement editTeacherSurname;
    @FindBy(xpath = "(//*[@id='birthPlace'])[2]")
    public WebElement editTeacherBirthplace;
    @FindBy(xpath = "(//*[@id='email'])[2]")
    public WebElement editTeacherEmail;
    @FindBy(xpath = "(//*[@id='phoneNumber'])[2]")
    public WebElement editTeacherPhoneNumber;
    @FindBy(xpath = "(//*[@id='isAdvisorTeacher'])[2]")
    public WebElement editTeacherIsAdvisorTeacher;
    @FindBy(xpath = "(//*[@id='ssn'])[2]")
    public WebElement editTeacherSsn;
    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement editTeacherUsername;
    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement editTeacherPassword;
    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement editTeacherBirthDay;
    @FindBy(xpath = "(//*[@value='FEMALE'])[2]")
    public WebElement editTeacherFemale;
    @FindBy(xpath = "(//*[@value='MALE'])[2]")
    public WebElement editTeacherMale;
    @FindBy(xpath = "(//*[@class='fw-semibold btn btn-primary btn-lg'])[2]")
    public WebElement editTeacherSubmitButton;
    @FindBy(xpath = "//*[text()='Teacher updated Successful']")
    public WebElement editSuccessMsg;




    //US008

  //  @FindBy(xpath ="//a[@class='header_link ms-2']")
  //  public WebElement loginButtonAnaSayfa;
   //@FindBy(id="username")
   //public WebElement username;
   //@FindBy(id="password")
   //public WebElement password;
    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginBelow;
    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menu;
    @FindBy(xpath ="/html/body")
    public WebElement lessonManagementTxt;
    @FindBy(xpath ="//*[@id=\"controlled-tab-example-tab-lessonsList\"]")
    public WebElement lessonsTxt;
    @FindBy(id="lessonName")
    public  WebElement lessonNameBox;
    @FindBy(id="compulsory")
    public static WebElement compulsoryBox;
    @FindBy(id="creditScore")
    public static WebElement creditScoreBox;
   // @FindBy(xpath = "//*[@id=\"controlled-tab-example-tabpane-lessonsList\"]/div[2]/div[1]/div/div/form/div/div[4]/div/button")
   // public WebElement submitBtn;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitBtnn;//stepDef submitBtnn n at

    @FindBy(id="Lesson Name")
    public WebElement lessonNameTxt;
    @FindBy(id="Compulsory")
    public WebElement compulsoryTxt;
    @FindBy(id="Credit Score")
    public WebElement creditScoreTxt;

    //US025



    @FindBy(id="username")
    public WebElement usernameBtnn;
    @FindBy(id="password")
    public WebElement passwordBtnn;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div/form/div[3]/button")
    public WebElement loginBeloww;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuBoxx;



    @FindBy(xpath ="//*[text()='Student Management']")
    public WebElement studentManagementTxt;

    @FindBy(id="advisorTeacherId")
    public WebElement advisorTeacherIdBx;

    @FindBy(id="name")
    public WebElement nameBx;

    @FindBy(id="surname")
    public WebElement surnameBx;

    @FindBy(id="birthPlace")
    public WebElement birthPlaceBx;

    @FindBy(id="email")
    public WebElement emailBx;
    @FindBy(id="phoneNumber")
    public WebElement phoneNumberBx;
    @FindBy(xpath ="//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/form/div[2]/div[4]/div/div[2]/div/input")
    public WebElement maleTxt;
    // @FindBy(id="birthday")
    // public WebElement birthdayBx;
    @FindBy(xpath ="//*[@id='birthDay']")
    public WebElement birthdayBox;
    @FindBy(id="ssn")
    public WebElement ssnBx;

    @FindBy(id="username")
    public WebElement usernameBx;
    @FindBy(id="fatherName")
    public WebElement fatherNameBx;
    @FindBy(id="motherName")
    public WebElement motherNameBx;
    @FindBy(id="password")
    public WebElement passwordBx;
    @FindBy(xpath="//*[@id='root']/div/main/div/div[1]/div[2]/div/div/form/div[3]/div[6]/div/button")
    public WebElement submitBtn;
    @FindBy(xpath ="//*[@id=root]/div/main/div/div[1]/div[3]/div/h5")
    public  WebElement studentListText;
    @FindBy(xpath = "//*[text()='Student saved Successfully']")
    public WebElement studentSavedMessages ;





    //seda
////input[@id='name']
    @FindBy(xpath = "//input[@id='name']")
    public WebElement addteach_name;
    ////div[@class=' css-13cymwt-control']
    @FindBy(xpath = "//div[@class=' css-13cymwt-control']")
    public WebElement addteachDdm;

    ////h5 [1]
    @FindBy(css = "//h5 [1]")
    public WebElement addTeachText;


    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[3]/div[1]/input[1]")
    public WebElement addTeachPassword;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[2]/div[1]/input[1]")
    public WebElement addTeachUsername;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/input[1]")
    public WebElement addTeacherSSN;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/div[4]/div[1]/button[1]")
    public WebElement addTeachSubmit;
    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement addTeachMesaj;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/div[2]/div[1]/input[1]")
    public WebElement addTeachMale;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement addTeachBirthDate;
    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public WebElement addTeachLesson;
    //(//div[@class='container-fluid'])[2]
    @FindBy(xpath = "(//div[@class='container-fluid'])[2]")
    public WebElement addTeachDIV;
    ////button[@aria-controls='offcanvasNavbar-expand-false']
    @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']")
    public WebElement addTeachMenu;

    @FindBy(linkText = "Vice Dean Management")
    public WebElement menuViceDeanManagement;


}

