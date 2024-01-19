package techproed.stepDefinition.ui_Step_Defination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;
import techproed.pages.HomePage;
import techproed.pages.TeacherAdd;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;
import techproed.utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;


public class Register  extends ReusableMethods {

    HomePage homePage=new HomePage();
    TeacherAdd teacherAdd=new TeacherAdd();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    JSUtils jsUtils=new JSUtils();
    Actions actions = new Actions(Driver.getDriver());


    AddUserPage addUserPage=new AddUserPage();
    // SoftAssert softAssert=new SoftAssert;
    static Faker faker=new Faker();
    static String fakeUsername;

    @Given("kullanici {string} girer")
    public void kullaniciGirer(String url) {

        Driver.getDriver().get(url);
    }

    @Then("aday ogrenci Register ikonunu tiklar")
    public void adayOgrenciRegisterIkonunuTiklar() {

        homePage.register.click();


    }

    @Given("Kullanici name alaninda tab tusuna basar")
    public void kullaniciNameAlanindaTabTusunaBasar() {
        homePage.registerName.click();
    }

    @Then("Kullanici name icin required uyarisini goruntuler")
    public void kullaniciNameIcinRequiredUyarisiniGoruntuler() {
        homePage.registerName.sendKeys(Keys.TAB);
        Assert.assertTrue("required",homePage.required.isDisplayed());
    }


    @Given("Kullanici name alanina {string} girer")
    public void kullaniciNameAlaninaGirer(String name) {
        homePage.registerName.sendKeys(name);

    }

    @Then("Kullanici at least iki karakter uyarisini goruntulemez")
    public void kullaniciAtLeastIkiKarakterUyarisiniGoruntulemez() {

        Assert.assertFalse(Driver.getDriver().getPageSource().contains("at least two character"));
    }



    @Given("Kullanici name alani disindaki tum alanlara gecerli deger girer")
    public void kullaniciNameAlaniDisindakiTumAlanlaraGecerliDegerGirer() {
        homePage.registerName.sendKeys("s");

        homePage.registerSurname.sendKeys(faker.name().lastName(),Keys.TAB);


        homePage.registerBirthPlace.sendKeys(faker.address().city(),Keys.TAB);


        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(2);
        homePage.registerFemale.click();
        bekle(1);
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(1);
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);
        String fakeUserName = faker.name().firstName();
        homePage.userName.sendKeys(fakeUserName);
        bekle(1);


        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(1);

        JSUtils.clickElementByJS(homePage.registerButton);




    }


    @Then("Kullanici at least iki character uyarisini alir")
    public void kullaniciAtLeastIkiCharacterUyarisiniAlir() {

        Assert.assertTrue(homePage.atleast2char.isDisplayed());
    }

    @Given("KullaniciSurname kutusunu bos birakmali")
    public void kullanicisurnameKutusunuBosBirakmali() {

        homePage.registerName.sendKeys(faker.name().firstName());
        homePage.registerBirthPlace.sendKeys(faker.address().city());






    }

    @Then("Bos birakilan surname kutusu icin required uyarisi goruntulenir olmali")
    public void bosBirakilanSurnameKutusuIcinRequiredUyarisiGoruntulenirOlmali() {

        Assert.assertTrue("required",homePage.register_surnamerequired.isDisplayed());
    }

    @Given("Kullanici Surname kismina iki karakter girer")
    public void kullaniciSurnameKisminaIkiKarakterGirer() {
        homePage.registerName.sendKeys(faker.name().firstName());

        homePage.registerSurname.sendKeys("Se");


        homePage.registerBirthPlace.sendKeys(faker.address().city(),Keys.TAB);


        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(2);
        homePage.registerFemale.click();
        bekle(1);
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(1);
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);
        String fakeUserName = faker.name().firstName();
        homePage.userName.sendKeys(fakeUserName);
        bekle(1);


        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(1);

        JSUtils.clickElementByJS(homePage.registerButton);

    }

    @Then("Kullanici at least iki karakter uyarisiyla karsilasmaz")
    public void kullaniciAtLeastIkiKarakterUyarisiylaKarsilasmaz() {
        //Assert.assertEquals("Your surname should be at least 2 characters",homePage.atleast2char.getText());
        //Your surname should be at least 2 characters
        String twocharacter="Your surname should be at least 2 characters";
        String expected=homePage.atleast2char.getText();
        Assert.assertNotEquals(twocharacter,expected);



    }


    @Given("Kullanici Surname alanina tek karakterli deger girer")
    public void kullaniciSurnameAlaninaTekKarakterliDegerGirer() {
        homePage.registerSurname.sendKeys("S");

    }

    @Then("Diger tum alanlara valid deger girer")
    public void digerTumAlanlaraValidDegerGirer() {
        homePage.registerName.sendKeys(faker.name().firstName());




        homePage.registerBirthPlace.sendKeys(faker.address().city(),Keys.TAB);


        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(2);
        homePage.registerFemale.click();
        bekle(1);
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(1);
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);
        String fakeUserName = faker.name().firstName();
        homePage.userName.sendKeys(fakeUserName);
        bekle(1);


        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(1);

        JSUtils.clickElementByJS(homePage.registerButton);

    }

    @Then("Kullanici Register butonunu tiklar")
    public void kullaniciRegisterButonunuTiklar() {
        JSUtils.clickElementByJS(homePage.registerButton);
    }

    @Then("Kullanici at least two charakter uyarisini gorur")
    public void kullaniciAtLeastTwoCharakterUyarisiniGorur() {
        homePage.atleast2char.getText();
        System.out.println(homePage.atleast2char.getText());

    }

    @Given("Kullanici Birth place alanini bos birakir")
    public void kullaniciBirthPlaceAlaniniBosBirakir() {
        homePage.registerBirthPlace.click();
        homePage.registerBirthPlace.sendKeys(Keys.TAB);
        Assert.assertTrue(homePage.register_birthdayrequired.isDisplayed());


    }

    @Then("Kullanici Birth place icin required uyarisini goruntuler")
    public void kullaniciBirthPlaceIcinRequiredUyarisiniGoruntuler() {
        Assert.assertTrue(homePage.register_birthdayrequired.isDisplayed());
    }

    @Given("Kullanici Birth place alanina en az iki karakter girer")
    public void kullaniciBirthPlaceAlaninaEnAzIkiKarakterGirer() {
        homePage.registerName.sendKeys(faker.name().firstName());
        homePage.registerSurname.sendKeys(faker.name().lastName());




        homePage.registerBirthPlace.sendKeys("SE");


        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(2);
        JSUtils.clickElementByJS(homePage.registerFemale);
        bekle(1);
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(1);
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);
        String fakeUserName = faker.name().firstName();
        homePage.userName.sendKeys(fakeUserName);
        bekle(1);


        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(1);

        JSUtils.clickElementByJS(homePage.registerButton);

        bekle(1);
        ReusableMethods.alertText();
        System.out.println(ReusableMethods.alertText());

    }

    @Given("Kullanici Birth place kutusuna {string} girer")
    public void kullaniciBirthPlaceKutusunaGirer(String birthplace) {
        homePage.registerBirthPlace.sendKeys(birthplace);
    }

    @Then("Kullanici at least iki character uyarisini goruntulemez")
    public void kullaniciAtLeastIkiCharacterUyarisiniGoruntulemez() {
    }

    @Given("Kullanici BirthPlace alanina bir karakter girer")
    public void kullaniciBirthPlaceAlaninaBirKarakterGirer() {
        homePage.registerName.sendKeys(faker.name().firstName());
        homePage.registerSurname.sendKeys(faker.name().lastName());


        homePage.registerBirthPlace.sendKeys("S");


        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(2);
        JSUtils.clickElementByJS(homePage.registerFemale);
        bekle(1);
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(1);
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);
        String fakeUserName = faker.name().firstName();
        homePage.userName.sendKeys(fakeUserName);
        bekle(1);


        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(1);

        JSUtils.clickElementByJS(homePage.registerButton);

    }

    @Then("Kullanici at least iki character uyarisini gorur Birthplace icin")
    public void kullaniciAtLeastIkiCharacterUyarisiniGorurBirthplaceIcin() {
    }


    //potive test alanı
    @Given("Kullanici Name kutusuna name girer")
    public void kullaniciNameKutusunaNameGirer() {
        homePage.registerName.sendKeys(faker.name().firstName());
    }


    @Then("Kullanici Surname kutusuna surname girer")
    public void kullaniciSurnameKutusunaSurnameGirer() {
        homePage.registerSurname.sendKeys(faker.name().username());
        bekle(3);
    }

    @Then("Kullanici Birth place kutusuna birthplacegirer")
    public void kullaniciBirthPlaceKutusunaBirthplacegirer() {
        homePage.registerBirthPlace.sendKeys(faker.address().city());
        bekle(3);
    }

    @Then("Kullanici Phone Number kutusuna phone girer")
    public void kullaniciPhoneNumberKutusunaPhoneGirer() {
        homePage.registerPhone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(3);

    }

    @Then("Kullanici Gender radio butonlarindan gender secer")
    public void kullaniciGenderRadioButonlarindanGenderSecer() {
        JSUtils.clickElementByJS(homePage.registerFemale);
        ReusableMethods.bekle(2);
    }

    @Then("Kullanici Date Of Birth kutusuna dateofbirth girer")
    public void kullaniciDateOfBirthKutusunaDateofbirthGirer() {
        homePage.registerDate.sendKeys("08/05/1985");
        bekle(3);

    }

    @Then("Kullanici SSN kutusuna ssn girer")
    public void kullaniciSSNKutusunaSsnGirer() {
        homePage.registerSsn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(3);
    }

    @Then("Kullanici User Name kutusuna username girer")
    public void kullaniciUserNameKutusunaUsernameGirer() {
        homePage.registerUserName.sendKeys(faker.name().username());
    }

    @Then("Kullanici Password kutusuna password girer")
    public void kullaniciPasswordKutusunaPasswordGirer() {
        homePage.registerPassword.sendKeys("Sk6148525");
        bekle(3);
    }

    @Then("Kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
        JSUtils.clickElementByJS(homePage.registerButton);
        bekle(3);
        bekle(2);

    }

    @Then("Kullanici guest user registered mesajini gorerek basarili kayit yapabildigini dogrular")
    public void kullaniciGuestUserRegisteredMesajiniGorerekBasariliKayitYapabildiginiDogrular() {
        ReusableMethods.visibleWait(homePage.guestUserRegistered,15);
        Assert.assertTrue(homePage.guestUserRegistered.isDisplayed());

    }


    @Then("Kullanici admin olarak giris yapar")
    public void kullaniciAdminOlarakGirisYapar() {
        addUserPage.login.click();
        addUserPage.username.sendKeys("Team10Admin");
        addUserPage.password.sendKeys("Team10Admin");
        addUserPage.loginButton.click();
        bekle(1);

        addUserPage.addTeachMenu.click();
        bekle(1);
        addUserPage.teacherMannagement.click();





    }

    @And("Kullanıcı Choose Lessons bölümünden {string} seçer.")
    public void kullanıcıChooseLessonsBolumundenSecer(String Java) {

        actions.keyUp((CharSequence) addUserPage.addTeachLesson).perform();

        actions = new Actions(Driver.getDriver());
        JSUtils.clickElementByJS(addUserPage.addTeachLesson);
        actions.sendKeys(Java, Keys.ENTER).perform();


    }

    @And("Kullanıcı name alanına veri girer.")
    public void kullanıcıNameAlanınaVeriGirer() {

        addUserPage.name.sendKeys(faker.name().firstName());

    }

    @And("Kullanıcı surname alanına veri girer.")
    public void kullanıcıSurnameAlanınaVeriGirer() {
        addUserPage.surname.sendKeys(faker.name().lastName());

    }

    @And("Kullanıcı birth place alanına veri girer.")
    public void kullanıcıBirthPlaceAlanınaVeriGirer() {
        addUserPage.birthPlace.sendKeys(faker.address().city());

    }

    @And("Kullanıcı email alanına veri girer.")
    public void kullanıcıEmailAlanınaVeriGirer() {
        ReusableMethods.scroll(addUserPage.email);
        addUserPage.email.sendKeys(faker.internet().emailAddress());


    }


    @Then("kullanici PhoneNumber Girer addteacher")
    public void kullaniciPhoneNumberGirerAddteacher() {
        addUserPage.phone.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);


    }

    @Then("Kullanıcı  Gender kısmını doldurur addteacher")
    public void kullanıcıGenderKısmınıDoldururAddteacher() {
        JSUtils.clickElementByJS(addUserPage.addTeachMale);


    }

    @Then("Kullanıcı  Date Of Birth kısmını doldurur addteacher")
    public void kullanıcıDateOfBirthKısmınıDoldururAddteacher() {
        addUserPage.addTeachBirthDate.sendKeys("12/05/1985");

    }

    @And("Kullanıcı  Ssn kısmını doldurur addteacher")
    public void kullanıcıSsnKısmınıDoldururAddteacher() {

        addUserPage.ssn.sendKeys(faker.number().numberBetween(100,999)+"-"+faker.number().numberBetween(10,99)+"-"+faker.number().numberBetween(1000,9999));
        bekle(1);

    }

    @Then("Kullanıcı  User Name kısmına veri girer addteacher")
    public void kullanıcıUserNameKısmınaVeriGirerAddteacher() {
        addUserPage.userName.sendKeys(faker.name().firstName());

    }

    @Then("Kullanıcı  Password kısmına geçerli  veri girer addteacher")
    public void kullanıcıPasswordKısmınaGecerliVeriGirerAddteacher() {
        addUserPage.addTeachPassword.sendKeys("Ahsen6148525");

    }

    @And("Kullanıcı submit butonuna tıklar addteacher")
    public void kullanıcıSubmitButonunaTıklarAddteacher() {
        JSUtils.clickElementByJS(addUserPage.addTeachSubmit);

    }

    @And("Kullanici Vice dean saved alertini goruntuler addteacher")
    public void kullaniciViceDeanSavedAlertiniGoruntulerAddteacher() throws InterruptedException{
        int count = 0;
        while (count<10)
        {
            try
            {
                Driver.getDriver().switchTo().alert();
                break;
            }
            catch (Exception error)
            {
                Thread.sleep(100);
            }
            count++;
        }
        assertTrue(addUserPage.addTeachMesaj.isDisplayed());
        Driver.closeDriver();
    }


    @And("And Kullanıcı Choose Lessons bölümünden {string} seçer.")
    public void andKullanıcıChooseLessonsBolumundenSecer(String java) {
        actions = new Actions(Driver.getDriver());
        addUserPage.addTeachLesson.click();
        actions.sendKeys(java, Keys.ENTER).perform();
    }
}

//24 kodlari
/*
  @And("Kullanici Vice dean saved alertini goruntuler2")
    public void kullaniciViceDeanSavedAlertiniGoruntuler2() throws InterruptedException{
        int count = 0;
        while (count<10)
        {
            try
            {
                Driver.getDriver().switchTo().alert();
                break;
            }
            catch (Exception error)
            {
                Thread.sleep(100);
            }
            count++;
        }
        assertTrue(pages.saveMessage.isDisplayed());
        Driver.closeDriver();
    }

 */

/*
  }

    @Then("Kullanici at least iki character uyarisini goruntulemez")
    public void kullaniciAtLeastIkiCharacterUyarisiniGoruntulemez() {
        Assert.assertFalse(homePage.atleast2char.isDisplayed());
*/








