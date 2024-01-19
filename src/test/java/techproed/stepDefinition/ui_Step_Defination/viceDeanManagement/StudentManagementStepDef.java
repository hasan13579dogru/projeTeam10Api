package techproed.stepDefinition.ui_Step_Defination.viceDeanManagement;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.*;

public class StudentManagementStepDef {

    AddUserPage page = new AddUserPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();


    @Given("Kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("Anasayfaya gidildigini dogrula")
    public void anasayfayaGidildiginiDogrula() {
        assert page.login.isDisplayed();
        ReusableMethods.bekle(3);
    }

    @When("Vice Dean hesabiyla login ol")
    public void viceDeanHesabiylaLoginOl() {
        page.login.click();
        page.username.sendKeys(ConfigReader.getProperty("loginusername"));
        page.passsword.sendKeys(ConfigReader.getProperty("loginPassword"));
        page.loginButton.click();
        ReusableMethods.bekle(2);

    }

    @Then("Vice Dean hesabi ile giris yapildigini dogrula")
    public void viceDeanHesabiIleGirisYapildiginiDogrula() {
        assert page.viceDeanMannagement.isDisplayed();
        ReusableMethods.bekle(2);
    }

    @When("Menu butonuna tikla")
    public void menuButonunaTikla() {
        js.executeScript("arguments[0].click();", page.menuButton);
        ReusableMethods.bekle(2);
    }

    @Then("Main Menu pencerisinin acildigini dogrula")
    public void mainMenuPencerisininAcildiginiDogrula() {
        assert page.mainMenu.isDisplayed();
    }

    @And("Acilan pencerede Student Managemen yazisinin gorundugunu dogrula")
    public void acilanPenceredeStudentManagemenYazisininGorundugunuDogrula() {
        assert page.studentMannagement.getText().contains("Student Management");
        ReusableMethods.bekle(2);
    }

    @When("Acilan pencerede Student Management alanina tikla")
    public void acilanPenceredeStudentManagementAlaninaTikla() {
        js.executeScript("arguments[0].click();", page.studentMannagement);
        ReusableMethods.bekle(2);
    }

    @Then("Acilan sayfada Student Management yazisini dogrula")
    public void acilanSayfadaStudentManagementYazisiniDogrula() {
        ReusableMethods.visibleWait(page.managementVerifyTitle, 15);
        assert page.managementVerifyTitle.isDisplayed();
        js.executeScript("window.scrollBy(0, 200);");
    }

    @And("Add Student yazisinin gorundugunu dogrula")
    public void addStudentYazisininGorundugunuDogrula() {
        assert page.addKullaniciYazisi.getText().contains("Add Student");
        ReusableMethods.bekle(2);
    }


    @Then("Required yazisini dogrula \\(Name)")
    public void requiredYazisiniDogrulaName() {
        assert page.nameRequired.isDisplayed();


    }

    @And("Required yazisini dogrula \\(Surname)")
    public void requiredYazisiniDogrulaSurname() {
        assert page.surnameRequired.isDisplayed();

    }


    @And("Required yazisini dogrula \\(Birth Place)")
    public void requiredYazisiniDogrulaBirthPlace() {
        assert page.birtPlaceRequired.isDisplayed();


    }

    @And("Required yazisini dogrula \\(Email )")
    public void requiredYazisiniDogrulaEmail() {

        assert page.emailRequired.isDisplayed();


    }

    @And("Required yazisini dogrula \\(Phone Number)")
    public void requiredYazisiniDogrulaPhoneNumber() {
        assert page.phoneRequired.isDisplayed();


    }

    @And("Required yazisini dogrula \\(Date Of Birth)")
    public void requiredYazisiniDogrulaDateOfBirth() {
        assert page.dateOfRequired.isDisplayed();


    }

    @And("Required yazisini dogrula \\(Ssn )")
    public void requiredYazisiniDogrulaSsn() {

        assert page.ssnRequired.isDisplayed();

    }

    @Then("Required yazisini dogrula \\(UserName)")
    public void requiredYazisiniDogrulaUserName() {
        assert page.userNameRequired.isDisplayed();

    }

    @And("Required yazisini dogrula \\(Father Name)")
    public void requiredYazisiniDogrulaFatherName() {
        assert page.fatherRequired.isDisplayed();

    }

    @And("Required yazisini dogrula \\(Mother Name)")
    public void requiredYazisiniDogrulaMotherName() {
        assert page.motherRequired.isDisplayed();

    }

    @Then("Enter your password yazisini dogrula \\(Password)")
    public void enterYourPasswordYazisiniDogrulaPassword() {
        assert page.passwordemassege.isDisplayed();

    }

    @And("Phone alanina {string} gir")
    public void phoneAlaninaGir(String phone) {
        page.phone.sendKeys(randomPhone());
        ReusableMethods.bekle(2);

    }

    @And("Name alanina name gir")
    public void nameAlaninaNameGir() {
        page.name.sendKeys(faker.name().lastName());
        ReusableMethods.bekle(2);
    }

    @And("Surname alanina surname gir")
    public void surnameAlaninaSurnameGir() {
        page.surname.sendKeys(faker.name().username());
        ReusableMethods.bekle(2);
    }

    @And("Birth Place alanina {string} gir")
    public void birthPlaceAlaninaGir(String birthPlace) {
        page.birthPlace.sendKeys(faker.country().capital());
        ReusableMethods.bekle(2);

    }

    @And("Phone alanina {int}.  ve {int}.  rakamadan  sonra  bir {string} birakarak bir {string} gir")
    public void phoneAlaninaVeRakamadanSonraBirBirakarakBirGir(int arg0, int arg1, String arg2, String arg3) {
        page.phone.sendKeys(randomPhone());
        ReusableMethods.bekle(2);
    }


    @And("Date Of Birth alaninda date ikonuna tikla")
    public void dateOfBirthAlanindaDateIkonunaTikla() {
        page.birthday.sendKeys("05101995");
        ReusableMethods.bekle(2);
    }

    @And("Ssn alanina {int}. ve {int}. rakamdan sonra {string} iceren {string} gir")
    public void ssnAlaninaVeRakamdanSonraIcerenGir(int first, int second, String tire, String ssn) {

        page.ssn.sendKeys(randomSsn());
        ReusableMethods.bekle(2);
    }


    @And("Father Name alanina Father name gir")
    public void fatherNameAlaninaFatherNameGir() {
        page.fatherName.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }

    @And("Mother Name alanina Mother name gir")
    public void motherNameAlaninaMotherNameGir() {
        page.motherName.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }


    @And("Password alanina en az {int} karakterli buyuk harf, kucuk harf ve bir rakam iceren {string} \"gir")
    public void passwordAlaninaEnAzKarakterliBuyukHarfKucukHarfVeBirRakamIcerenGir(int arg0, String arg1) {
        page.password.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.bekle(2);
    }


    @Then("{string} mesajinin gorundugunu dogrula")
    public void mesajininGorundugunuDogrula(String message) {

        assert page.verifyMessaj.isDisplayed();
        ReusableMethods.bekle(2);

    }

    @And("Gender seceneklerinden {string}  sec")
    public void genderSeceneklerindenSec(String arg0) {
        page.male.click();
        ReusableMethods.bekle(2);
    }

    @Then("Gender kutucugunun tiklanabildigini dogrula")
    public void genderKutucugununTiklanabildiginiDogrula() {
        assert page.male.isEnabled();
        ReusableMethods.bekle(2);

    }

    @And("Email email alanina email gir")
    public void emailEmailAlaninaEmailGir() {
        page.email.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }


    @And("Email alaninin uzerinde mause ile bekle")
    public void emailAlanininUzerindeMauseIleBekle() {


        actions.moveToElement(page.email).perform();
        ReusableMethods.bekle(2);
    }

    @Then("Giris yapilamadigini dogrula")
    public void girisYapilamadiginiDogrula() {
        ReusableMethods.visibleWait(page.verifyMessaj, 15);
        assert page.verifyMessaj.isDisplayed();
        ReusableMethods.bekle(2);
    }


    @When("Email alanini sil")
    public void emailAlaniniSil() {
        page.email.clear();
    }

    @Then("{string} mesajinin gorundugu dogrula")
    public void mesajininGorunduguDogrula(String email) {
        page.verifyMessaj.sendKeys(email);
        ReusableMethods.bekle(3);
    }

    @And("Sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();

    }


    @When("Email alanina {string} gir")
    public void emailAlaninaGir(String gmail) {
        page.email.sendKeys(gmail);
        ReusableMethods.bekle(3);

    }

    @And("Cikan seceneklerden {string} sec")
    public void cikanSeceneklerdenSec(String teacher) {
        page.selectTeacherDdm.sendKeys(teacher);
        ReusableMethods.bekle(3);
    }

    @When("Choose Teacher yazisina tikla")
    public void chooseTeacherYazisinaTikla() {
        page.selectTeacherDdm.sendKeys("team10 Team10");
        ReusableMethods.bekle(2);
    }


    @And("Date Of Birth alaninda {string} gir")
    public void dateOfBirthAlanindaGir(String arg0) {
        page.birthday.sendKeys("28051999");
        ReusableMethods.bekle(2);
    }


    @And("Birth Place alanına birth place gir\\(Dogum Yeri)")
    public void birthPlaceAlanınaBirthPlaceGirDogumYeri() {
        page.birthPlace.sendKeys("c");
        ReusableMethods.bekle(2);
    }

    @When("Email alanına email gir")
    public void emailAlanınaEmailGir() {
        page.email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.bekle(3);

    }


    @And("User Name alanini sil")
    public void userNameAlaniniSil() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value=''", page.userName);
        ReusableMethods.bekle(2);
    }


    @And("Sayfayi yenile")
    public void sayfayiYenile() {
        Driver.getDriver().navigate().refresh();
        js.executeScript("window.scrollBy(0, 200);");
        ReusableMethods.bekle(3);

    }


    @And("BirthPlace alanına {string} gir\\(Dogum Yeri)")
    public void birthplaceAlanınaGirDogumYeri(String birthPlace) {
        page.birthPlace.sendKeys(birthPlace);
        ReusableMethods.bekle(2);
    }


    @And("User Name alanina tek karakter  {string} gir")
    public void userNameAlaninaTekKarakterGir(String username) {
        page.userName.sendKeys(username);
        ReusableMethods.bekle(2);
    }

    @And("Father Name alanina tek karakter  {string} gir")
    public void fatherNameAlaninaTekKarakterGir(String father) {
        page.fatherName.sendKeys(father);
        ReusableMethods.bekle(2);


    }

    @And("Mother Name alanina tek karakter {string} gir")
    public void motherNameAlaninaTekKarakterGir(String mother) {
        page.motherName.sendKeys(mother);
        ReusableMethods.bekle(2);
    }

    @And("Name alanına tek karakter {string} gir")
    public void nameAlanınaTekKarakterGir(String namee) {
        page.name.sendKeys(namee);
        ReusableMethods.bekle(3);
    }


    @And("Name alanına tek karakter ve bosluk {string} gir")
    public void nameAlanınaTekKarakterVeBoslukGir(String nameBosluk) {
        page.name.sendKeys(nameBosluk);
        ReusableMethods.bekle(3);
    }

    @And("Surname alanına tek karakter ve bosluk {string} gir")
    public void surnameAlanınaTekKarakterVeBoslukGir(String surnameBosluk) {
        page.surname.sendKeys(surnameBosluk);
        ReusableMethods.bekle(3);
    }

    @And("Birth Place alanına tek karakter ve bosluk {string} gir\\(Dogum Yeri)")
    public void birthPlaceAlanınaTekKarakterVeBoslukGirDogumYeri(String birthBosluk) {
        page.birthPlace.sendKeys(birthBosluk);
        ReusableMethods.bekle(2);
    }


    @And("Surname alanına tek karakter {string} gir")
    public void surnameAlanınaTekKarakterGir(String surname) {
        page.surname.sendKeys(surname);
        ReusableMethods.bekle(2);
    }

    @And("User Name alanina user name gir")
    public void userNameAlaninaUserNameGir() {
        page.userName.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }

    @And("User Name alanina tek karakter ve bosluk {string} gir")
    public void userNameAlaninaTekKarakterVeBoslukGir(String usernaneBosluk) {
        page.userName.sendKeys(usernaneBosluk);
        ReusableMethods.bekle(2);
    }

    @And("Father Name alanina tek karakter ve bosluk {string} gir")
    public void fatherNameAlaninaTekKarakterVeBoslukGir(String fatherSpace) {
        page.fatherName.sendKeys(fatherSpace);
        ReusableMethods.bekle(2);
    }

    @And("Mother Name alanina tek karakter ve bosluk {string} gir")
    public void motherNameAlaninaTekKarakterVeBoslukGir(String motherSpace) {
        page.motherName.sendKeys(motherSpace);
        ReusableMethods.bekle(2);
    }

    @And("Giris yapilamadigini dogrulaa")
    public void girisYapilamadiginiDogrulaa() {
        Assert.assertFalse(page.successfullyMessage.getText().contains("Student saved Sccessfully"));
    }

    @And("Name alanına rakam {string} gir")
    public void nameAlanınaRakamGir(String name) {
        page.name.sendKeys(name);
    }

    @When("Surname alanına  spesifik karakter, rakam {string} gir")
    public void surnameAlanınaSpesifikKarakterRakamGir(String surname) {
        page.surname.sendKeys(surname);
    }


    @And("Birth Place alanına spesifik karakter, rakam {string} gir\\(Dogum Yeri)")
    public void birthPlaceAlanınaSpesifikKarakterRakamGirDogumYeri(String birtPlace) {
        page.birthPlace.sendKeys(birtPlace);
    }

    @When("Phone alanına {int}.  ve {int}.  rakamadan  sonra bosluk bir bosluk bırakarak bır {string} gır  \\(Kayitli phone )")
    public void phoneAlanınaVeRakamadanSonraBoslukBirBoslukBırakarakBırGırKayitliPhone(int first, int second, String three) {
        page.phone.sendKeys("312 546 9852");
    }

    @And("Father Name alanina spesifik karakter, rakam {string}  gir")
    public void fatherNameAlaninaSpesifikKarakterRakamGir(String father) {
        page.fatherName.sendKeys(father);
    }

    @And("Mother Name alanina spesifik karakter, rakam {string} gir")
    public void motherNameAlaninaSpesifikKarakterRakamGir(String mother) {
        page.motherName.sendKeys(mother);
    }

    @And("UserName alanina kayitli bir {string} gir")
    public void usernameAlaninaKayitliBirGir(String username) {
        page.username.sendKeys(username);
    }

    @Then("Error: User with username ViceDeanTeam{int} already register' mesajinin gorundugunu dogrula")
    public void errorUserWithUsernameViceDeanTeamAlreadyRegisterMesajininGorundugunuDogrula(int usernameVerify) {
        ReusableMethods.visibleWait(page.verifyMessaj, 15);
        assert page.verifyMessaj.isDisplayed();
    }

    @Then("Error: User with phone number {int} {int} {int} already register mesajinin gorundugunu dogrula")
    public void errorUserWithPhoneNumberAlreadyRegisterMesajininGorundugunuDogrula(int arg0, int arg1, int arg2) {
        assert page.verifyMessaj.getText().contains("Error: User with phone number 312 546 9852 already register");
    }


    @And("Ssn alanina {int}. ve {int}. rakamdan sonra {string} içeren {string} gir \\(Kayitli ssn )")
    public void ssnAlaninaVeRakamdanSonraIçerenGirKayitliSsn(int arg0, int arg1, String arg2, String arg3) {
        page.ssn.sendKeys("562-84-9523");
    }

    public static String randomPhone() {
        Random random = new Random();
        String sayi1 = Integer.toString(random.nextInt(899) + 100);
        String sayi2 = Integer.toString(random.nextInt(899) + 100);
        String sayi3 = Integer.toString(random.nextInt(8999) + 1000);
        String phone = sayi1 + "-" + sayi2 + "-" + sayi3;
        return phone;

    }

    public static String randomSsn() {
        Random random = new Random();
        String sayi1 = Integer.toString(random.nextInt(899) + 100);
        String sayi2 = Integer.toString(random.nextInt(89) + 10);
        String sayi3 = Integer.toString(random.nextInt(8999) + 1000);
        String ssn = sayi1 + "-" + sayi2 + "-" + sayi3;
        return ssn;

    }


    @And("Phone Number alanina on iki karakterden az {string} gir")
    public void phoneNumberAlaninaOnIkiKarakterdenAzGir(String phone) {
        page.phone.sendKeys(phone);

    }


    @When("SSN alanına  on bir charecterden az bir {string} gir")
    public void ssnAlanınaOnBirCharecterdenAzBirGir(String ssn) {
        page.ssn.sendKeys(ssn);
    }

    @Then("{string} mesajının gorunurlugunu dogrulaa")
    public void mesajınınGorunurlugunuDogrulaa(String ssnVerify) {
        assert page.minumumCharacterSsn.getText().contains(ssnVerify);
    }

    @Then("Minimum {int} character \\(XXX-XXX-XXXX) mesajının gorunurlugunu dogrula")
    public void minimumCharacterXXXXXXXXXXMesajınınGorunurlugunuDogrula(int arg0) {
        assert page.minumumCharacterPhone.getText().contains("Minimum 12 character (XXX-XXX-XXXX)");

    }

    @Then("Minimum {int} character \\(XXX-XX-XXXX) mesajının gorunurlugunu dogrula")
    public void minimumCharacterXXXXXXXXXMesajınınGorunurlugunuDogrula(int arg0) {
        assert page.minumumCharacterSsn.getText().contains("Minimum 11 character (XXX-XX-XXXX)");
    }

    @When("Date Of Birth alaninda {string} girr")
    public void dateOfBirthAlanindaGirr(String date) {
        page.birthday.sendKeys(date);
    }

    @When("Email email alanina {string} gir")
    public void emailEmailAlaninaGir(String besKarakterdenAz) {
        page.email.sendKeys(besKarakterdenAz);
    }


    @When("Password alanina sekiz karakterden az bir {string} girer")
    public void passwordAlaninaSekizKarakterdenAzBirGirer(String password) {
        page.password.sendKeys(password);
        ReusableMethods.bekle(2);
    }

    @Then("{string} password mesajinin gorundugunu dogrula")
    public void passwordMesajininGorundugunuDogrula(String passwordVerify) {
        assert page.passwordemassege.isDisplayed();
        ReusableMethods.bekle(2);
    }

    @And("Password alanina sekiz karakterli buyuk harf icermeyen {string} gir")
    public void passwordAlaninaSekizKarakterliBuyukHarfIcermeyenGir(String pasword1) {
        page.password.sendKeys(pasword1);
        ReusableMethods.bekle(2);
    }


    @And("Password alanina sekiz karakterli rakam icermeyen {string} gir")
    public void passwordAlaninaSekizKarakterliRakamIcermeyenGir(String password3) {
        page.password.sendKeys(password3);
        ReusableMethods.bekle(2);
    }

    @And("Password alanina sekiz karakterli kucuk harf icermeyen {string} gir")
    public void passwordAlaninaSekizKarakterliKucukHarfIcermeyenGir(String password4) {
        page.password.sendKeys(password4);
        ReusableMethods.bekle(2);
    }


    @Then("{string} passwordBir mesajinin gorundugunu dogrula")
    public void passwordbirMesajininGorundugunuDogrula(String upperCase) {
        assert page.passwordemassege.isDisplayed();

    }

    @Then("{string} passwordIki mesajinin gorundugunu dogrula")
    public void passwordıkiMesajininGorundugunuDogrula(String oneNumber) {
        assert page.passwordemassege.isDisplayed();
    }

    @Then("{string} passwordUc mesajinin gorundugunu dogrula")
    public void passworducMesajininGorundugunuDogrula(String Lowercase) {
        assert page.passwordemassege.isDisplayed();
    }


    @Then("Giris yapilamadigini dogrula\\(ssn verify)")
    public void girisYapilamadiginiDogrulaSsnVerify() {
        assert page.ErrorUserSsn.isDisplayed();
    }


    @Then("{string} mesajının gorunurlugunu dogrula")
    public void mesajınınGorunurlugunuDogrula(String arg0) {
        ReusableMethods.visibleWait(page.verifyMessaj, 15);
        assert page.verifyMessaj.isDisplayed();
    }


    @Then("{string} mesajının  gorundugunu dogrula")
    public void mesajınınGorundugunuDogrula(String arg0) {
        List<String> messages = Arrays.asList(
                "Your name should be at least 2 characters",
                "Your surname should be at least 2 characters",
                "Your father name should be at least 2 characters",
                "Your mother name should be at least 2 characters",
                "Your birth place should be at least 2 characters",
                "Your username should be at least 4 characters"
        );
        for (String w : messages) {
            String script = "return document.documentElement.innerText.includes('" + messages + "');";
            boolean isMessageVisible = (boolean) js.executeScript(script);
            if (isMessageVisible) {
                System.out.println(messages);

            }
        }
    }

    @Then("Giris yapilamadigini dogrulaa\\(bug)")
    public void girisYapilamadiginiDogrulaaBug() {
        Assert.assertTrue(page.verifyMessaj.isDisplayed());
    }

    @And("Submit butonuna tiklaa")
    public void submitButonunaTiklaa() {
        actions.scrollToElement(page.submitButton);
        js.executeScript("arguments[0].click();", page.submitButton);
        ReusableMethods.bekle(3);
    }

    @Then("{string} mesajini dogrulaa")
    public void mesajiniDogrulaa(String arg0) {
        //ReusableMethods.visibleWait(page.verifyMessaj, 15);
        assert page.verifyMessaj.isDisplayed();
    }




    //US008
    @Given("go to managementonschools.com")
    public void go_to_managementonschools_com() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

    @And("Click the login button on the homepage")
    public void click_the_login_button_on_the_homepage() {
        // ReusableMethods.scrollHome();
        page.loginButtonAnaSayfa.click();
        ReusableMethods.bekle(2);

    }

    @Then("Log in as Dean")
    public void log_in_as_dean() {
        page.username.sendKeys("ViceDeanTeam10", Keys.TAB, "ViceDeanTeam10");
        page.loginBelow.click();
        ReusableMethods.bekle(2);
    }

    @Then("Click on the menu button")
    public void click_on_the_menu_button() {
        page.menu.click();
        ReusableMethods.bekle(2);
    }

    @And("Click Lesson Management")
    public void clickLessonManagement() {
        page.lessonManagementTxt.click();
        ReusableMethods.bekle(2);

    }

    @And("Verify that Lesson Name is clickable")
    public void verifyThatLessonNameIsClickable() {
        Assert.assertTrue(page.lessonNameTxt.isDisplayed());
    }

    @And("Enter Lesson Name")
    public void enterLessonName() {
        page.lessonNameBox.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }

    @And("Click the Lessons text")
    public void clickTheLessonsText() {
        //actions.sendKeys(Keys.HOME).perform();
        page.lessonsTxt.click();
        ReusableMethods.bekle(2);
    }

    @And("Click the lesson name box")
    public void clickTheLessonNameBox() {
        page.lessonNameBox.click();
        ReusableMethods.bekle(2);

    }

    @And("Click the Compulsory")
    public void clickTheCompulsory() {
        page.compulsoryBox.click();
        ReusableMethods.bekle(2);

    }

    @Then("Verify that the compulsory box can be selected")
    public void verifyThatTheCompulsoryBoxCanBeSelected() {
        Assert.assertTrue(page.compulsoryBox.isSelected());
        ReusableMethods.bekle(2);
    }

    @And("Click the credit score")
    public void clickTheCreditScore() {
        page.creditScoreBox.click();
        ReusableMethods.bekle(2);

    }

    @And("Enter the credit score\\({int})")
    public void enterTheCreditScore(int arg0) {
        page.creditScoreBox.sendKeys("8");

    }

    @Then("Click the Submit button")
    public void click_the_submit_button() {
        // viceDeanManagement.submitBtn.click();
        js.executeScript("arguments[0].click();", page.submitBtn);
        ReusableMethods.bekle(2);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("Verify that Lessons has been created")
    public void verify_that_lessons_has_been_created() {
        assert page.verifyMessaj.isDisplayed();


    }






    @Given("go to {string}")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

    }

    @And("Click the Login button on the home page")
    public void click_the_login_button_on_thehomepage() {
        page.loginButtonAnaSayfa.click();
        page.usernameBtnn.sendKeys("Team10Admin");
        page.passwordBtnn.sendKeys("Team10Admin");
        ReusableMethods.bekle(2);
    }

    @Then("Log in as admin")
    public void log_in_as_admin() {
        page.loginBeloww.click();
        ReusableMethods.bekle(2);

    }

    @Then("Click the Menu button")
    public void click_the_menu_button() {
        page.menuBoxx.click();
        ReusableMethods.bekle(2);
    }

    @Then("Verify that the Main Menu is visible")
    public void verify_that_the_main_menu_is_visible() {
        Assert.assertTrue(page.menuBoxx.isDisplayed());
        ReusableMethods.bekle(2);
    }

  /*
    @Then("Student Management verify that it is visible")

    public void student_management_verify_that_it_is_visible() {
        Assert.assertTrue(page.studentManagementTxt.isDisplayed());

    }

   */

    @Then("Click the Student Management")
    public void click_the_student_management() {
        page.studentManagementTxt.click();
    }

    @And("Click Choose Advisor Teacher box")
    public void clickChooseAdvisorTeacherBox() {
        page.advisorTeacherIdBx.click();
    }

    @Then("Choose Advisor Teacher Confirm selectable")
    public void choose_advisor_teacher_confirm_selectable() {
        // Assert.assertTrue(studentManagement.advisorTeacherIdBx.isSelected());
        page.advisorTeacherIdBx.sendKeys(ConfigReader.getProperty("AdvisorTeacher"));

    }

    @And("Enter name,surname,birth place,email,phone")
    public void enterNameSurnameBirthPlaceEmailPhone() {

        page.nameBx.sendKeys("Adil",
                Keys.TAB, "Sert", Keys.TAB, "Manisa",

                Keys.TAB, faker.internet().emailAddress(), Keys.TAB, randomPhone());


    }


    @And("Click Male")
    public void clickMale() {
        page.maleTxt.click();



    }




    @And("Enter date of birth,ssn,username, father name, mother name,password")
    public void enterDateOfBirthSsnUsernames_FatherNameMotherNamePassword() {


        js.executeScript("window.scrollBy(0, 200);");
        page.birthdayBox.sendKeys("03072000");
        ReusableMethods.bekle(2);
        page.ssnBx.sendKeys(faker.number().numberBetween(100, 999) + "-" + faker.number().
                numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999));


        page.usernameBx.sendKeys(faker.name().firstName(),
                Keys.TAB, "Taha",
                Keys.TAB, "Elif", Keys.TAB, "C257K.GLc3a");

    }


    @Then("Click the Submit buttonnn")
    public void click_the_submit_buttonnn() {
        ReusableMethods.click(page.submitBtn);
        ReusableMethods.bekle(2);
    }
}