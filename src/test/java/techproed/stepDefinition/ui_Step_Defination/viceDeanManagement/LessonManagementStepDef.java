package techproed.stepDefinition.ui_Step_Defination.viceDeanManagement;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.LessonManagement;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

    public class LessonManagementStepDef {

        LessonManagement lessnMngmnt=new LessonManagement();
        Select lessnAdd;
        Actions actions;
        @Then("Education Term Management yazısının gorunurlugunu dogrular")
        public void educationTermManagementYazısınınGorunurlugunuDogrular() {
            Assert.assertTrue(lessnMngmnt.eduTermManageYazisi.isDisplayed());
            ReusableMethods.bekle(3);
        }

        @When("Lesson Program yazisi tikla")
        public void lessonProgramYazisiTikla() {
            ReusableMethods.click(lessnMngmnt.clickLessonProgram);
        }

        @And("Lesson Program Management yazili alanin acildigi goruntulenmelidir")
        public void lessonProgramManagementYaziliAlaninAcildigiGoruntulenmelidir() {
            Assert.assertTrue(lessnMngmnt.lessonProgramManageYazisi.isDisplayed());
            ReusableMethods.bekle(3);
        }

        @And("Select lesson yazisi tikla")
        public void selectLessonYazisiTikla() {
        //ReusableMethods.click(lessnMngmnt.selectLesson);

    }

    @And("Cikan derslerden biri secilebilmeli")
    public void cikanDerslerdenBiriSecilebilmeli() {
       // ReusableMethods.ddmVisibleText(lessnMngmnt.selectLesson,"Team10Cucumber");
       // lessnAdd= new Select(lessnMngmnt.selectLesson);
       // lessnAdd.selectByVisibleText("Team10Cucumber");


        actions = new Actions(Driver.getDriver());
        actions.moveByOffset(300, 450).click().build().perform();
        ReusableMethods.visibleWait(lessnMngmnt.selectLesson , 2);
        actions.sendKeys("Team10Cucumber", Keys.ENTER).perform();
    }

    @When("Vice Dean egitim donemi secebilmeli")
    public void viceDeanEgitimDonemiSecebilmeli() {

    }

    @When("Choose Education Term alanindan egitim donemi secilir.")
    public void chooseEducationTermAlanindanEgitimDonemiSecilir() {
    }

    @And("Choose Education Term kutucugu tiklanip secim yapilabilmelidir")
    public void chooseEducationTermKutucuguTiklanipSecimYapilabilmelidir() {
    }

    @When("Ders icin gun secebilmelidir.")
    public void dersIcinGunSecebilmelidir() {
    }

    @And("Choose Day kutucugundan gun secilir.")
    public void chooseDayKutucugundanGunSecilir() {
    }

    @And("Choose Day kutucugu tiklanip gunlerden biri secilebilir olmalidir")
    public void chooseDayKutucuguTiklanipGunlerdenBiriSecilebilirOlmalidir() {
    }

    @When("Ders için başlama ve bitiş saati seçebilmelidir.")
    public void dersIçinBaşlamaVeBitişSaatiSeçebilmelidir() {
    }

    @And("Start Time kutucuguna baslama saati yazilir")
    public void startTimeKutucugunaBaslamaSaatiYazilir() {
    }

    @And("Start Time kutucugu edit edilebilir olmalidir")
    public void startTimeKutucuguEditEdilebilirOlmalidir() {
    }

    @And("Stop Time kutucuguna bitis saati yazilir.")
    public void stopTimeKutucugunaBitisSaatiYazilir() {
    }

    @And("Stop Time kutucugu edit edilebilir olmalidir")
    public void stopTimeKutucuguEditEdilebilirOlmalidir() {
    }

    @And("Submit butonuna tikla")
    public void submitButonunaTikla() {
    }
}


