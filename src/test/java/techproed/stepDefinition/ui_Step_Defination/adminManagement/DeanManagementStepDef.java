package techproed.stepDefinition.ui_Step_Defination.adminManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import techproed.pages.AddUserPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class DeanManagementStepDef {
    AddUserPage addUserPage = new AddUserPage();

    @Given("{string} sayfasina gidilir")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }
    @Given("kullanici Admin olarak giris yapar")
    public void kullanici_admin_olarak_giris_yapar() {
        addUserPage.userName.sendKeys(ConfigReader.getProperty("loginAdmin"));
        addUserPage.password.sendKeys(ConfigReader.getProperty("adminSifre"));
        addUserPage.loginButton.click();
    }
    @Given("kullanici Dean Management sekmesine tiklar")
    public void kullanici_dean_management_sekmesine_tiklar() {
        addUserPage.deanMannagement.click();
    }
    @Given("Name,Gender, Phone Number, SSN, User Name bilgilerinin goruldugunu dogurlanir")
    public void name_gender_phone_number_ssn_user_name_bilgilerinin_goruldugunu_dogurlanir() {
        Assert.assertTrue((addUserPage.nameBaslik.isDisplayed()||addUserPage.phoneBaslik.isDisplayed()||addUserPage.ssnBaslik.isDisplayed()));
    }

    @Given("login butonuna tiklanir")
    public void loginButonunaTiklanir() {
        ReusableMethods.click(addUserPage.login);
        ReusableMethods.bekle(2);
    }

    @And("En son olusturulan dean'e gidip edit tusuna bas")
    public void enSonOlusturulanDeanEGidipEditTusunaBas() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(addUserPage.lastOfList);
        ReusableMethods.bekle(1);
        ReusableMethods.scroll(addUserPage.lastEditButton);
        ReusableMethods.click(addUserPage.lastEditButton);
    }

    @And("Name alanina yeni ismi gir")
    public void nameAlaninaYeniIsmiGir() {
        ReusableMethods.bekle(2);
        addUserPage.nameEdit.clear();
        addUserPage.nameEdit.sendKeys(ConfigReader.getProperty("editName"));
    }

    @And("Male butonuna tikla")
    public void maleButonunaTikla() {
        addUserPage.editMale.click();
    }

    @And("Password alinina parolayi gir ve submit tusuna bas")
    public void passwordAlininaParolayiGir() {
        addUserPage.editPassword.sendKeys(ConfigReader.getProperty("editPassword"));
        addUserPage.editSubmit.click();

    }

    @And("Dean updated Successful yazisinin gorunurlugunu dogrula")
    public void deanUpdatedSuccessfulYazisininGorunurlugunuDogrula() {
        assert addUserPage.editUpdate.isDisplayed();
    }

    @Given("kullanici Dean olarak giris yapar")
    public void kullaniciDeanOlarakGirisYapar() {
        addUserPage.username.sendKeys(ConfigReader.getProperty("loginDean"));
        addUserPage.password.sendKeys(ConfigReader.getProperty("deanSifre"));
        addUserPage.loginButton.click();
    }

    @Given("kullanici Vice Dean Management sekmesine tiklar")
    public void kullaniciViceDeanManagementSekmesineTiklar() {
        addUserPage.menuViceDeanManagement.click();
        ReusableMethods.bekle(2);
    }

    @And("Name alanina name girilir")
    public void nameAlaninaNameGirilir() {
        addUserPage.name.sendKeys(ConfigReader.getProperty("viceName"));
    }
    @And("Surname alanina surname girilir")
    public void surnameAlaninaSurnameGirilir() {
        addUserPage.surname.sendKeys(ConfigReader.getProperty("viceSurname"));
        ReusableMethods.bekle(1);
    }
    @And("Dogum yeri gir")
    public void dogumYeriGir() {
        addUserPage.birthPlace.sendKeys(ConfigReader.getProperty("vicePlace"));
        ReusableMethods.bekle(1);
    }

    @And("dogum tarihi gir")
    public void dogumTarihiGir() {
        addUserPage.birthday.sendKeys(ConfigReader.getProperty("viceBirth"));

    }

    @And("Gender sec")
    public void genderSec() {
        addUserPage.male.click();
    }

    @And("Phone number gir")
    public void phoneNumberGir() {
        addUserPage.phone.sendKeys(ConfigReader.getProperty("vicePhone"));
    }

    @And("Ssn no gir")
    public void ssnNoGir() {
        addUserPage.ssn.sendKeys(ConfigReader.getProperty("viceSsn"));
    }

    @And("UserName gir")
    public void usernameGir() {
        addUserPage.userName.sendKeys(ConfigReader.getProperty("viceUsername"));
    }

    @And("Parola gir")
    public void parolaGir() {
        addUserPage.password.sendKeys(ConfigReader.getProperty("vicePassword"));
    }

    @And("Submit butonuna tik")
    public void submitButonunaTik() {
        addUserPage.submitButton.click();
    }

    @Then("{string} mesaji gor")
    public void mesajiGor(String str) {
        assert addUserPage.userMessageVerify.isDisplayed();
    }



}
