package techproed.stepDefinition.ui_Step_Defination.deanManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import techproed.pages.AddUserPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class ViceDeanManagementStepDef {
    AddUserPage addUserPage = new AddUserPage();

 /*   @Given("Anasayfaya gidildi")
    public void kullaniciSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));
    }

  */
   /*
    @Given("login butonuna tiklandi")

    public void loginButonunaTiklanir() {
        ReusableMethods.click(addUserPage.login);
        ReusableMethods.bekle(2);
    }

    */
  /*  @Given("kullanici Dean olarak giris yapar")
    public void kullaniciDeanOlarakGirisYapar() {
        addUserPage.userName.sendKeys(ConfigReader.getProperty("loginDean"));
        addUserPage.password.sendKeys(ConfigReader.getProperty("deanSifre"));
        addUserPage.loginButton.click();
    }

   */

   // @Given("kullanici Dean Management sekmesine tiklar")
  //  public void kullanici_dean_management_sekmesine_tiklar() {
    //    addUserPage.viceDeanMannagement.click();




    @And("Name ve Surname alani doldurulur")
    public void nameVeSurnameAlaniDoldurulur() {
    }

    @And("dogum tarihi girilir")
    public void dogumTarihiGirilir() {
    }

    @And("Gender secilir")
    public void genderSecilir() {
    }

    @And("Phone number girilir")
    public void phoneNumberGirilir() {
    }

    @And("Ssn no girilir")
    public void ssnNoGirilir() {
    }

    @And("UserName girilir")
    public void usernameGirilir() {
    }

    @And("Parola girilir")
    public void parolaGirilir() {
    }

    @And("Submit butonuna tiklandi")
    public void submitButonunaTiklandi() {
    }

    @Then("{string} mesaji gorundu")
    public void mesajiGorundu(String arg0) {
    }



}


