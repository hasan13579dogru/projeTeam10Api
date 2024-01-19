package techproed.stepDefinition.ui_Step_Defination.viceDeanManagement;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;
import techproed.pages.HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.Methods;
import techproed.utilities.ReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

import static techproed.utilities.JDBCUtils.executeQuery;
import static techproed.utilities.ReusableMethods.bekle;

public class TeacherViceDeanStepDef {

    Methods methods = new Methods();
    HomePage homePage = new HomePage();
    AddUserPage addUserPage = new AddUserPage();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();


    //Database için eklene satırlar
    String username = faker.name().username();
    ResultSet resultSet;

    @Given("Anasayfaya gider")
    public void anasayfayaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }

    @Given("kullanici vice dean ile Logine olur")
    public void kullaniciViceDeanIleLogineOlur() {

        methods.ViceDeanLogin("ViceDeanTeam10", "ViceDeanTeam10");
    }


    @And("kullanici Add Teacher formu doldurur")
    public void kullaniciAddTeacherFormuDoldurur() {
        methods.teacheradd(faker.name().name(),
                faker.name().lastName(),
                faker.address().city(),
                faker.internet().emailAddress(),
                faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}"),
                faker.demographic().sex(),
                "15.06.2015",
                faker.regexify("[0-9]{3}-[0-9]{2}-[0-9]{4}"),

                 username,

                faker.regexify("[A-Z][a-z]{1}[0-9]{6}"));
        ReusableMethods.bekle(3);
        System.out.println(username);
            }

    @And("kullanici  bos birakilan name alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanNameAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.nameRequired);
    }

    @And("kullanici  bos birakilan Surname alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanSurnameAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.surnameRequired);
    }

    @And("kullanici  bos birakilan Birth Place alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanBirthPlaceAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.birtPlaceRequired);
    }

    @And("kullanici  bos birakilan Email alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanEmailAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.emailRequired);
    }

    @And("kullanici  bos birakilan Phone Number alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanPhoneNumberAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.phoneRequired);
    }

    @And("kullanici  bos birakilan Date Of Birth alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanDateOfBirthAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.dateOfRequired);
    }

    @And("kullanici  bos birakilan SSN alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanSSNAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required", addUserPage.ssnRequired);
    }

    @And("kullanici username ve password alanini siler")
    public void kullaniciUsernameVePasswordAlaniniSiler() {
        addUserPage.username.clear();
        addUserPage.password.clear();
    }

    @And("kullanici Enter your password yazisini dogrular")
    public void kullaniciEnterYourPasswordYazisiniDogrular() {
        Assert.assertEquals("Enter your password", addUserPage.passwordemassege);
    }

    @And("kullanici {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} bilgilerini girer")
    public void kullaniciBilgileriniGirer(String Name, String Surname, String BirthPlace, String Email, String Phone, String Gender, String Birthdate, String Ssn, String Username, String Password) {
        addUserPage.name.sendKeys(Name, Keys.TAB, Surname, Keys.TAB, BirthPlace, Keys.TAB, Email, Keys.TAB, Phone, Keys.PAGE_DOWN);
        ReusableMethods.click(addUserPage.male);
        addUserPage.birthday.sendKeys(Birthdate, Keys.TAB, Ssn, Keys.TAB, Username, Keys.TAB, Password);
    }


    @And("kullanici  bos birakilan username alaninda Required uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanUsernameAlanindaRequiredUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Required",addUserPage.userNameRequired);
    }
    @Then("kullanici  bos birakilan phoneNumber alaninda Minimum {int} character XXX-XXX-XXXX uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanPhoneNumberAlanindaMinimumCharacterXXXXXXXXXXUyariYazisiGeldiginiDogrular(int arg0) {
        Assert.assertEquals("Minimum 12 character (XXX-XX-XXXX)",addUserPage.phonemissingmessage);
    }
    @And("kullanici  bos birakilan ssn alaninda Minimum {int} character \\(XXX-XX-XXXX) uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanSsnAlanindaMinimumCharacterXXXXXXXXXUyariYazisiGeldiginiDogrular(int arg0) {
        Assert.assertEquals("Minimum 11 character (XXX-XX-XXXX)",addUserPage.ssnmissingmessage);
    }
    @And("kullanici  bos birakilan password alaninda One lowercase character uyari yazisi geldigini dogrular")
    public void kullaniciBosBirakilanPasswordAlanindaOneLowercaseCharacterUyariYazisiGeldiginiDogrular() {
        Assert.assertEquals("Minimum 11 character (XXX-XX-XXXX)",addUserPage.ssnmissingmessage);
    }
    @Then("Kullanici Login yazisina tiklar")
    public void kullaniciLoginYazisinaTiklar() {
        addUserPage.login.click();
    }

    @Then("Kullanici User Name alanina {string} password alanina {string} degerini girip giris yapar")
    public void kullaniciUserNameAlaninaPasswordAlaninaDegeriniGiripGirisYapar(String arg0, String arg1) {
        addUserPage.username.clear();
        addUserPage.username.sendKeys("ViceDeanTeam10");
        addUserPage.passsword.clear();
        addUserPage.passsword.sendKeys("ViceDeanTeam10");
        addUserPage.loginButton.click();
        bekle(3);
    }

    @Then("Kullanici Menu tiklar")
    public void kullaniciMenuTiklar() {
        addUserPage.menuButton.click();
        bekle(3);
    }
    @Then("Kullanici Teacher Management yazisina tiklar")
    public void kullaniciTeacherManagementYazisinaTiklar() {
        addUserPage.teacherMannagement.click();
        bekle(2);
    }
    @Then("Kullanici Choose Lessons'dan herhangi bir ders secer")
    public void kullaniciChooseLessonsDanHerhangiBirDersSecer() {
        addUserPage.name.sendKeys(Keys.SHIFT, Keys.TAB);
        actions.click(addUserPage.selectLesson).perform();
        actions.sendKeys(Keys.ENTER).perform();
        bekle(2);
    }
    @Then("Kullanici submit butonu tiklar")
    public void kullaniciSubmitButonuTiklar() {
        bekle(1);
        //addUserPage.submitButton.click();
        ReusableMethods.click(addUserPage.submitTeacherButton);
    }
    @Then("Kullanici {string} yazisinin gorunurlugunu dogrular")
    public void kullaniciYazisininGorunurlugunuDogrular(String str) {
        Assert.assertTrue(str,addUserPage.alertMessage.isDisplayed());
    }
    @Then("Kullanici Name alanina {string} girer.")
    public void kullaniciNameAlaninaGirer(String str) {
        addUserPage.name.sendKeys(faker.name().name());
    }
    @Then("Kullanici Surname alanina {string} girer.")
    public void kullaniciSurnameAlaninaGirer(String str) {
        addUserPage.surname.sendKeys(faker.name().lastName());
    }
    @Then("Kullanici Birth place alanina {string} girer.")
    public void kullaniciBirthPlaceAlaninaGirer(String str) {
        addUserPage.birthPlace.sendKeys(faker.address().city());
    }
    @Then("Kullanici e-mail alanina {string} girer.")
    public void kullaniciEMailAlaninaGirer(String str) {
        addUserPage.email.sendKeys(faker.internet().emailAddress());
    }
    @Then("ogretmenin danismanligi Is Advisor Teacher a tiklanarak secilir.")
    public void ogretmeninDanismanligiIsAdvisorTeacherATiklanarakSecilir() {
        addUserPage.isAdvicerTeacherCheckbox.click();
        bekle(2);
    }
    @Then("Cinsiyet secilmez.")
    public void cinsiyetSecilmez() {
        Assert.assertFalse(addUserPage.female.isSelected());
        bekle(1);
    }
    @Then("Dogum tarihi {string} girilir.")
    public void dogumTarihiGirilir(String str) {
        addUserPage.birthday.sendKeys(str);
        bekle(1);
    }
    @Then("Gecerli SSN {string} girilir.")
    public void gecerliSSNGirilir(String str) {
        addUserPage.ssn.sendKeys(faker.regexify("[0-9]{3}-[0-9]{2}-[0-9]{4}"));
        bekle(1);
    }
    @Then("Kullanici Username  alanina {string} girer.")
    public void kullaniciUsernameAlaninaGirer(String str) {
        addUserPage.username.clear();
        addUserPage.username.sendKeys(faker.name().username());
        bekle(1);
    }
    @Then("Kullanici gecerli password {string} girer.")
    public void kullaniciGecerliPasswordGirer(String str) {
        addUserPage.password.clear();
        addUserPage.password.sendKeys(faker.regexify("[A-Z][a-z]{1}[0-9]{6}"));
        bekle(1);
    }
    @Then("Kullanici hata mesajinin ekran goruntusunu alir")
    public void kullaniciHataMesajininEkranGoruntusunuAlir() {
        ReusableMethods.tumSayfaResmi("Gender");
    }
    @Then("Kullanici phone alanina {string} girer.")
    public void kullaniciPhoneAlaninaGirer(String str) {
        addUserPage.phone.sendKeys( faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}"));
    }
    @Then("Kullanici cinsiyet girer")
    public void kullaniciCinsiyetGirer() {
        addUserPage.male.click();
    }
    @Then("Kullanici {string} SSN degeri girer")
    public void kullaniciSSNDegeriGirer(String str) {
    }
    @Then("Kullanici SSN alanina harf iceren bir SSN degeri girer")
    public void kullaniciSSNAlaninaHarfIcerenBirSSNDegeriGirer() {
        addUserPage.ssn.sendKeys(ConfigReader.getProperty("SSN1"));
    }
    @Then("Kullanici SSN alanina ucuncu rakamdan sonra {string} icermeyen bir SSN degeri girer")
    public void kullaniciSSNAlaninaUcuncuRakamdanSonraIcermeyenBirSSNDegeriGirer() {
        addUserPage.ssn.sendKeys(ConfigReader.getProperty("SSN3"));
    }
    @Then("Kullanici SSN alanina besinci rakamdan sonra {string} icermeyen bir SSN degeri girer")
    public void kullaniciSSNAlaninaBesinciRakamdanSonraIcermeyenBirSSNDegeriGirer() {
        addUserPage.ssn.sendKeys(ConfigReader.getProperty("SSN4"));
    }
    @Then("Kullanici SSN alanina ucuncu ve besinci rakamdan sonra {string} icermeyen bir SSN degeri girer")
    public void kullaniciSSNAlaninaUcuncuVeBesinciRakamdanSonraIcermeyenBirSSNDegeriGirer() {
        addUserPage.ssn.sendKeys(ConfigReader.getProperty("SSN2"));
    }
    @Then("Kullanici En az sekiz karakterli kucuk harf icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliKucukHarfIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password1"));
    }
    @Then("Kullanici En az sekiz karakterli buyuk harf icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliBuyukHarfIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password2"));
    }
    @Then("Kullanici En az sekiz karakterli rakam icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliRakamIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password3"));
    }
    @Then("Kullanici En az sekiz karakterli kucuk ve buyuk harf icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliKucukVeBuyukHarfIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password4"));
    }
    @Then("Kullanici En az sekiz karakterli kucuk harf ve rakam icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliKucukHarfVeRakamIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password5"));
    }
    @Then("Kullanici En az sekiz karakterli buyuk harf ve rakam icermeyen {string} girer")
    public void kullaniciEnAzSekizKarakterliBuyukHarfVeRakamIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password6"));
    }
    @Then("Kullanici sekiz karakterden az buyuk ,kucuk harf ve rakam iceren {string} girer")
    public void kullaniciSekizKarakterdenAzBuyukKucukHarfVeRakamIcerenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password7"));
    }
    @Then("Kullanici sekiz karakterden az buyuk  ve kucuk harf  icermeyen {string} girer")
    public void kullaniciSekizKarakterdenAzBuyukVeKucukHarfIcermeyenGirer(String arg0) {
        addUserPage.password.sendKeys(ConfigReader.getProperty("password8"));
    }
    @Then("Kullanici e-mail alanina {string} seklinde girer.")
    public void kullaniciEMailAlaninaSeklindeGirer(String arg0) {
        addUserPage.email.sendKeys(ConfigReader.getProperty("email1"));
    }
    @Then("Kullanici e-mail alanina {string} seklinde degir girer")
    public void kullaniciEMailAlaninaSeklindeDegirGirer(String arg0) {
        addUserPage.email.sendKeys(ConfigReader.getProperty("email2"));
    }
    @Then("Kullanici phone alanina {string} seklinde {string} girer.")
    public void kullaniciPhoneAlaninaXXXXXXXXXSeklindeGirer(String arg0) {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("phone1"));
    }
    @Then("Kullanici phone alanina XXXXXX-XXXX  seklinde {string} girer.")
    public void kullaniciPhoneAlaninaXXXXXXXXXXSeklindeGirer(String arg0) {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("phone2"));
    }
    @Then("Kullanici phone alanina XXX-XXXYXXX  seklinde {string} girer.")
    public void kullaniciPhoneAlaninaXXXXXXYXXXSeklindeGirer(String arg0) {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("phone3"));
    }
    @Then("Kullanici phone alanina XXYXXXYXXX  seklinde {string} girer.")
    public void kullaniciPhoneAlaninaXXYXXXYXXXSeklindeGirer(String arg0) {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("phone4"));
    }
    @Then("Kullanici phone alanina XXY-XX-XYXYX  seklinde {string} girer.")
    public void kullaniciPhoneAlaninaXXYXXXYXYXSeklindeGirer(String arg0) {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("phone5"));
    }

    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) {
        ReusableMethods.bekle(2);
    }


    @Then("Kullanici {string} yazisinin gorulmedigini dogrular")
    public void kullaniciYazisininGorulmediginiDogrular(String str) {
        Assert.assertFalse(str,addUserPage.alertMessage.isDisplayed());
    }

    @Then("Vice Dean listenin sag alt kosesindeki {string} butonuna tiklar")
    public void viceDeanListeninSagAltKosesindekiButonunaTiklar(String arg0) {
        addUserPage.sonkayitgit.click();
    }


    @And("Olusturulan ogretmenin Name bilgisinin goruldugunu dogrular")
    public void olusturulanOgretmeninNameBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(addUserPage.NameEdit.isDisplayed());
    }

    @And("Olusturulan ogretmenin Phone Number bilgisinin goruldugunu dogrular")
    public void olusturulanOgretmeninPhoneNumberBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(addUserPage.PhoneNumberEdit.isDisplayed());
    }


    @And("Olusturulan ogretmenin Ssn bilgisinin goruldugunu dogrular")
    public void olusturulanOgretmeninSsnBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(addUserPage.SSNEdit.isDisplayed());
    }


    @And("Olusturulan ogretmenin User Name bilgisinin goruldugunu dogrular")
    public void olusturulanOgretmeninUserNameBilgisininGoruldugunuDogrular() {
        Assert.assertTrue(addUserPage.UserNameEdit.isDisplayed());
    }

    @And("Olusturulan ogretmen satirinda Edit butonuna tıklar")
    public void olusturulanOgretmenSatirindaEditButonunaTıklar() {
        addUserPage.editButon.click();
    }

    @And("Ogretmen bilgilerini gunceller")
    public void ogretmenBilgileriniGunceller() {
        addUserPage.chooseLessonEdit.click();
    }

    @And("Vice Dean guncelleme icin Submit Butonuna Tiklar")
    public void viceDeanGuncellemeIcinSubmitButonunaTiklar() {
        addUserPage.submitButonEdit.click();
    }


    @And("Ogretmen bilgilerini yeniden secerek gunceller")
    public void ogretmenBilgileriniYenidenSecerekGunceller() {
        methods.autoTeacherEdit();



    }

    // JDBCUtils   executeQuery icinde methodu var
    @Given("Database bagla")
    public void databaseBagla() {

    }

    // executeQuery ile database bağlandık ve teacher bilgilerini alıp resultset içine atadık
    @When("username {string} ile teacheri getir")
    public void usernameIleTeacheriGetir(String arg0) {
        String query ="select * from teacher where username='"+username+"';";
        resultSet = executeQuery(query);

    }

    @Then("kullanici bodynin {string} {string} {string} {string} {string} {string} {string} {string} {string} bilgilerini icerdigini dogrular")
    public void kullaniciBodyninBilgileriniIcerdiginiDogrular(String name, String Surname, String BirthPlace, String email, String Phone, String Gender, String DateOfBirth, String Ssn, String UserName) throws SQLException {
        resultSet.next();

        //  FAker ile gelen form bilgilerini string konteynırına attık.
        String actualName = resultSet.getString("name");
        String actualSurname = resultSet.getString("surname");
        String actualBirthPlace = resultSet.getString("birth_place");
        String actualPhone = resultSet.getString("phone_number");
        String actualemail = resultSet.getString("email");
        String actualGender = resultSet.getString("gender");
        String actualDateOfBirth = resultSet.getString("birth_day");
        String actualSsn = resultSet.getString("ssn");
        String actualUserName = resultSet.getString("username");

        // Gelen Actual bilgileriyle senerio outile tablosunu karşılaştırıyoruz
        Assert.assertEquals(name, actualName);
        Assert.assertEquals(Surname, actualSurname);
        Assert.assertEquals(BirthPlace, actualBirthPlace);
        Assert.assertEquals(Phone, actualPhone);
        Assert.assertEquals(Phone, actualemail);
        Assert.assertEquals(Gender, actualGender);
        Assert.assertEquals(DateOfBirth, actualDateOfBirth);
        Assert.assertEquals(Ssn, actualSsn);
        Assert.assertEquals(UserName, actualUserName);


    }


    }






