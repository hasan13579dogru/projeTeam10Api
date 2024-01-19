package techproed.stepDefinition.ui_Step_Defination.teacherManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;
import techproed.pages.MeetManagement;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class MeetManagementStepDef {

    AddUserPage addUserPage = new AddUserPage();
    MeetManagement meetManagement = new MeetManagement();
    Actions actions;
    int beforeMeetList;
    int afterMeetList;
    String descriptionRandomValue = "random";

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Given("kullanici ManagementOnSchools sayfasina gider")
    public void kullaniciManagementOnSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("managementOnSchoolsUrl"));

    }

    @Then("anasayfaya gidildigi dogrulanir")
    public void anasayfayaGidildigiDogrulanir() {
        Assert.assertTrue(meetManagement.registerButton.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {
        ReusableMethods.click(meetManagement.login);
        ReusableMethods.bekle(2);
    }

    @Then("kullanici Teacher olarak giris yapar")
    public void kullaniciTeacherOlarakGirisYapar() {
        meetManagement.username.sendKeys(ConfigReader.getProperty("teacher"), Keys.TAB, ConfigReader.getProperty("teacherSifre"));
        ReusableMethods.bekle(2);
        meetManagement.loginButton.click();
        ReusableMethods.bekle(2);

    }

    @And("Teacher olarak giris yapildigi dogrulanir")
    public void teacherOlarakGirisYapildigiDogrulanir() {
        Assert.assertTrue(meetManagement.hi.isDisplayed());
    }

    @And("kullanici Menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        meetManagement.menuButton.click();
        ReusableMethods.bekle(2);
    }

    @And("sol bölümde Main Menu'nun acildigi dogrulanir")
    public void solBölümdeMainMenuNunAcildigiDogrulanir() {
        Assert.assertTrue(meetManagement.mainMenu.isDisplayed());
    }

    @And("kullanici Meet Management sekmesine tiklar")
    public void kullaniciMeetManagementSekmesineTiklar() {
        meetManagement.meetManagement.click();
        ReusableMethods.bekle(2);
    }

    @And("Meet Management sekmesinin acildigi dogrulanir")
    public void meetManagementSekmesininAcildigiDogrulanir() {
        Assert.assertTrue(meetManagement.addMeet.isDisplayed());
    }

    @And("kullanici ögrenci secimi yapar")
    public void kullaniciÖgrenciSecimiYapar() {

        actions = new Actions(Driver.getDriver());
        actions.moveByOffset(300, 450).click().build().perform();
        ReusableMethods.visibleWait(meetManagement.chooseStudents , 2);
        actions.sendKeys("Team10Student Team10",Keys.ENTER).perform();
        //ReusableMethods.sendKeysJS(meetManagement.chooseStudents,"Team10Student Student" );

    }

    /*@And("Zorunlu alanlarin doldurulmasi gerektigi dogrulanir")
    public void zorunluAlanlarinDoldurulmasiGerektigiDogrulanir() {
        Assert.assertTrue(meetManagement.required.isDisplayed());
        Assert.assertTrue(meetManagement.required2.isDisplayed());
        Assert.assertTrue(meetManagement.required3.isDisplayed());
        Assert.assertTrue(meetManagement.required4.isDisplayed());

    }
     */

    @And("kullanici toplanti tarihi secer")
    public void kullaniciToplantiTarihiSecer() {
        meetManagement.dateOfMeet.sendKeys(ConfigReader.getProperty("dateOfMeet"));
        //ReusableMethods.bekle(2);
    }

    @And("kullanici toplanti baslangic saati secer")
    public void kullaniciToplantiBaslangicSaatiSecer() {
        meetManagement.startTime.sendKeys(ConfigReader.getProperty("startTime"));
        //ReusableMethods.bekle(2);
    }

    @And("kullanici toplanti bitis saati secer")
    public void kullaniciToplantiBitisSaatiSecer() {
        meetManagement.stopTime.sendKeys(ConfigReader.getProperty("stopTime"));
        //ReusableMethods.bekle(2);
    }

    @And("kullanici Description bölümünde toplanti hakkinda bilgi yazar")
    public void kullaniciDescriptionBölümündeToplantiHakkindaBilgiYazar() {
        meetManagement.description.sendKeys(ConfigReader.getProperty("description"));
        //ReusableMethods.bekle(2);
    }

    @And("kullanici Submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        meetManagement.submitButton.click();
        //ReusableMethods.bekle(2);
    }

    @And("Meet List bölümünün görünürlügü dogrulanir")
    public void meetListBölümününGörünürlügüDogrulanir() {
        Assert.assertTrue(meetManagement.meetList.isDisplayed());
    }

    @Then("Meet List altinda toplantinin olustugu dogrulanir")
    public void meetListAltindaToplantininOlustuguDogrulanir() {
        Assert.assertTrue(meetManagement.succesfullyTextVerify.isDisplayed());
    }


    @And("kullanici Logout sekmesine tiklar")
    public void kullaniciLogoutSekmesineTiklar() {
        ReusableMethods.click(meetManagement.logoutButton);
        //ReusableMethods.bekle(2);
    }

    @And("Logout olmak icin cikan mesajin görünürlügü dogrulanir")
    public void logoutOlmakIcinCikanMesajinGörünürlügüDogrulanir() {
        Assert.assertTrue(meetManagement.logoutText.isDisplayed());
    }

    @And("kullanici Yes butonuna tiklar")
    public void kullaniciYesButonunaTiklar() {
        meetManagement.yesButton.click();
        //ReusableMethods.bekle(2);
    }

    @Then("Logout yapildigi dogrulanir")
    public void logoutYapildigiDogrulanir() {
        ReusableMethods.visibleWait(meetManagement.registerButton,15);
        Assert.assertTrue(meetManagement.registerButton.isDisplayed());
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("kullanici Hata mesaji alindigini dogrular")
    public void kullaniciHataMesajiAlindiginiDogrular() {
        Assert.assertTrue(meetManagement.eskiTarihHatasi.isDisplayed());

    }

    @And("kullanici Edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        ReusableMethods.click(meetManagement.editButton);
    }

    @Then("kullanici toplanti tarihini günceller")
    public void kullaniciToplantiTarihiniGünceller() {
        ReusableMethods.sendKeysJS(meetManagement.dateMeet,ConfigReader.getProperty("editDateOfMeet"));
    }

    @And("kullanici toplanti baslangic saatini günceller")
    public void kullaniciToplantiBaslangicSaatiniGünceller() {
        ReusableMethods.sendKeysJS(meetManagement.start,ConfigReader.getProperty("editStartTime"));
    }

    @And("kullanici toplanti bitis saati günceller")
    public void kullaniciToplantiBitisSaatiGünceller() {
        ReusableMethods.sendKeysJS(meetManagement.stop,ConfigReader.getProperty("editStopTime"));
    }

    @And("kullanici toplantinin description alanini günceller")
    public void kullaniciToplantininDescriptionAlaniniGünceller() {
        ReusableMethods.sendKeysJS(meetManagement.description2,ConfigReader.getProperty("editDescription"));
    }

    @Then("kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar2() {
        meetManagement.editSubmitButton.click();
    }

    @And("kullanici hata mesajinin görüldügünü dogrular")
    public void kullaniciHataMesajininGörüldügünüDogrular() {
        Assert.assertTrue(meetManagement.editErrorMessage.isDisplayed());
    }

    @And("kullanici Edit basarili mesajinin görüldügünü dogrular")
    public void kullaniciEditBasariliMesajininGörüldügünüDogrular() {
        ReusableMethods.alertWait(10);
        Assert.assertTrue(meetManagement.editSuccessfulyTextVerify.isDisplayed());
    }

    @And("kullanici ögrenci secimini kaldirir")
    public void kullaniciÖgrenciSeciminiKaldirir() {
        meetManagement.studentDelete.click();
    }

    @Then("kullanici {string} yazisinin gorunurlugunu dogrular")
    public void kullaniciYazisininGorunurlugunuDogrular(String str) {
        Assert.assertTrue(beforeMeetList==afterMeetList);
        ReusableMethods.waitForVisibility(meetManagement.editSuccessfulyTextVerify, 5);
        Assert.assertEquals(meetManagement.editSuccessfulyTextVerify.getText(),str);
    }


    @When("kullanici olusturulan toplantiyi siler")
    public void kullaniciOlusturulanToplantiyiSiler() {
        ReusableMethods.click(meetManagement.meetDelete);
        ReusableMethods.bekle(3);
    }

    @And("kullanici toplantinin silindigini dogrular")
    public void kullaniciToplantininSilindiginiDogrular() {
        ReusableMethods.visibleWait(meetManagement.meetDeleteSuccessfullyText,15);
        Assert.assertTrue(meetManagement.meetDeleteSuccessfullyText.isDisplayed());
    }

    @Then("kullanici hata mesaji gorur ve toplanti olusturamaz")
    public void kullaniciHataMesajiGorurVeToplantiOlusturamaz() {
        //afterMeetList = meetManagement.meetList.size();
        Assert.assertTrue(beforeMeetList==afterMeetList);
        ReusableMethods.waitForVisibility(meetManagement.warningMessage, 5);
        Assert.assertTrue(meetManagement.warningMessage.isDisplayed());
    }


    @And("kullanici Start Time alanini bos birakir")
    public void kullaniciStartTimeAlaniniBosBirakir() {

    }

    @And("kullanici Stop Time alanini bos birakir")
    public void kullaniciStopTimeAlaniniBosBirakir() {
    }

    @Then("kullanici toplantinin olusturulamadigini dogrular")
    public void kullaniciToplantininOlusturulamadiginiDogrular() {
        Assert.assertTrue(beforeMeetList==afterMeetList);
    }
}
