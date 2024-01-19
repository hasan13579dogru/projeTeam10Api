package techproed.stepDefinition.ui_Step_Defination.teacherManagement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.AddUserPage;
import techproed.pages.StudentInfoManagement;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static techproed.utilities.ReusableMethods.ddmVisibleText;

public class StudentInfoManagementStepDef {

    StudentInfoManagement teacherPage = new StudentInfoManagement();
    Select lessonIdDdm;
    Select studentIdDm;
    Select educationTermIdDdm;
    AddUserPage addUserPage = new AddUserPage();//*
    Actions actions;

    @Given("Anasayfaya git")
    public void anasayfaya_git() {
        Driver.getDriver().get(ConfigReader.getProperty("managementonSchoollUrl"));
    }



    @Then("{int} saniye bekle")
    public void saniye_bekle(Integer saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("Teacher olarak login ol")
    public void teacher_olarak_login_ol() {
        //teacherPage.login.click();
        //teacherPage.userName.sendKeys(ConfigReader.getProperty("userName"), Keys.TAB);
        //teacherPage.password.sendKeys(ConfigReader.getProperty("password"), Keys.TAB, Keys.ENTER);

        addUserPage.login.click();
        addUserPage.username.sendKeys(ConfigReader.getProperty("userName"), Keys.TAB);
        addUserPage.passsword.sendKeys(ConfigReader.getProperty("password"), Keys.TAB, Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @When("Student Info Management sayfasinda oldugunu dogrula")
    public void student_info_management_sayfasinda_oldugunu_dogrula() {
        Assert.assertEquals("Student Info Management", teacherPage.studentInfoManagement.getText());
    }

    @When("Add Student Info alanindaki {string} bir ders sec, {string} bir ogrenci sec, {string} bir donem sec,{string} devamsizlik gir, {string} notunu gir,{string} notunu gir,{string} basari durumunu gir")
    public void add_student_info_alanindaki_bir_ders_sec_bir_ogrenci_sec_bir_donem_sec_devamsizlik_gir_notunu_gir_notunu_gir_basari_durumunu_gir(String lessonIdx, String studentIdx, String educationTermIdx, String absenteeIdx, String midtermExamIdx, String finalExamIdx, String infoNoteIdx) {
        lessonIdDdm = new Select(teacherPage.lessonId);
        lessonIdDdm.selectByVisibleText(lessonIdx);
        ReusableMethods.bekle(1);

        studentIdDm = new Select(teacherPage.studentId);
        studentIdDm.selectByVisibleText(studentIdx);
        ReusableMethods.bekle(1);

        educationTermIdDdm = new Select(teacherPage.educationTerm);
        educationTermIdDdm.selectByVisibleText(educationTermIdx);
        ReusableMethods.bekle(1);

        teacherPage.absentee.sendKeys(absenteeIdx);
        ReusableMethods.bekle(1);

        teacherPage.midtermExam.sendKeys(midtermExamIdx);
        ReusableMethods.bekle(1);

        teacherPage.finalExam.sendKeys(finalExamIdx);
        ReusableMethods.bekle(1);

        teacherPage.infoNote.sendKeys(infoNoteIdx);
    }

    @When("{string} Choose Lesson girildigini dogrular")
    public void choose_lesson_girildigini_dogrular(String lesson) {
        Assert.assertEquals(lesson, lessonIdDdm.getFirstSelectedOption().getText());
    }

    @When("{string} Choose Student girildigini dogrular")
    public void choose_student_girildigini_dogrular(String student) {
        Assert.assertEquals(student, studentIdDm.getFirstSelectedOption().getText());
    }

    @When("{string} Educatinon Term girildigini dogrular")
    public void educatinon_term_girildigini_dogrular(String educationTerm) {
        Assert.assertEquals(educationTerm, educationTermIdDdm.getFirstSelectedOption().getText());
    }

    @When("{string} Absentee girildigini dogrular")
    public void absentee_girildigini_dogrular(String absentee) {
        Assert.assertEquals(absentee, teacherPage.absentee.getAttribute("value"));
    }

    @When("{string} Midtern Exam girildigini dogrular")
    public void midtern_exam_girildigini_dogrular(String midternExam) {
        Assert.assertEquals(midternExam, teacherPage.midtermExam.getAttribute("value"));
    }

    @When("{string} Final Exam girildigini dogrular")
    public void final_exam_girildigini_dogrular(String finalExam) {
        Assert.assertEquals(finalExam, teacherPage.finalExam.getAttribute("value"));
    }

    @When("{string} Info Note girildigini dogrular")
    public void info_note_girildigini_dogrular(String infoNote) {
        Assert.assertEquals(infoNote, teacherPage.infoNote.getAttribute("value"));
        ReusableMethods.bekle(7);
    }

    @When("Submit butonu tikla")
    public void submit_butonu_tikla() {
        //teacherPage.submit.click();
        addUserPage.submitButton.click();  //*
    }

    @When("Basariyla giris yapildigini dogrula")
    public void basariyla_giris_yapildigini_dogrula() {

        ReusableMethods.visibleWait(teacherPage.successfulLogin, 15);
        Assert.assertEquals("Student Info saved Successfully", teacherPage.successfulLogin.getText());

        ReusableMethods.bekle(3);
    }

    @And("{string} mesaji dogrula")
    public void mesajiDogrula(String arg0) {
        // ReusableMethods.visibleWait(teacherPage.NotAralikHatasiBS, 15);
        //Assert.assertEquals("'100.0' değerinden küçük yada eşit olmalı", teacherPage.NotAralikHatasiBS.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("'100.0' değerinden küçük yada eşit olmalı", addUserPage.verifyMessaj.getText());
        ReusableMethods.bekle(3);
    }

    @And("{string} mesaji dogrulanmali")
    public void mesajiDogrulanmali(String arg0) {
        //ReusableMethods.visibleWait(teacherPage.NotAralikHatasiKS, 15);
        //Assert.assertEquals("'0.0' değerinden büyük yada eşit olmalı", teacherPage.NotAralikHatasiKS.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("'0.0' değerinden büyük yada eşit olmalı", addUserPage.verifyMessaj.getText());

    }

    @And("Rakam disinda bir karakterle girilemez mesajini dogrular")
    public void rakamDisindaBirKarakterleGirilemezMesajiniDogrular() {
        ReusableMethods.visibleWait(teacherPage.NotHarfHatasi, 15);
        Assert.assertTrue(teacherPage.NotHarfHatasi.isDisplayed()); //?/////////////////
    }

    @And("{string} yazisini dogrular")
    public void yazisiniDogrular(String arg0) {
        //ReusableMethods.visibleWait(teacherPage.infoNoteKarakterSayisiHatasi, 15);
        //Assert.assertTrue(teacherPage.infoNoteKarakterSayisiHatasi.isDisplayed());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertTrue(addUserPage.verifyMessaj.isDisplayed());
    }

    @And("Absentee kutusunun altindaki Required yazisini dogrula")
    public void absenteeKutusununAltindakiRequiredYazisiniDogrula() {
        Assert.assertEquals("Required", teacherPage.absenteeRequired.getText());
    }

    @And("Midtern kutusu altindaki Required yazisini dogrula")
    public void midternKutusuAltindakiRequiredYazisiniDogrula() {
        Assert.assertEquals("Required", teacherPage.midtermExamRequired.getText());
    }

    @And("Final Exam kutusu altindaki Required yazisini dogrula")
    public void finalExamKutusuAltindakiRequiredYazisiniDogrula() {
        Assert.assertEquals("Required", teacherPage.finalExamRequired.getText());
    }

    @And("Info Note kutusu altindaki Required yazisini dogrula")
    public void ınfoNoteKutusuAltindakiRequiredYazisiniDogrula() {
        Assert.assertEquals("Required", teacherPage.infoNoteRequired.getText());
    }

    @And("Absentee alanina bir devamsizlik gir")
    public void absenteeAlaninaBirDevamsizlikGir() {
        teacherPage.absentee.sendKeys("3");
    }

    @And("Midtern alanina bir ara sinav notu gir")
    public void midternAlaninaBirAraSinavNotuGir() {
        teacherPage.midtermExam.sendKeys("70");
    }

    @And("Final Exam alanina bir final notu gir")
    public void finalExamAlaninaBirFinalNotuGir() {
        teacherPage.finalExam.sendKeys("90");
    }

    @And("Info Note alanina bir basari durumu gir")
    public void ınfoNoteAlaninaBirBasariDurumuGir() {
        teacherPage.infoNote.sendKeys("Dönem Başarılı*10*");
    }

    @And("Choose Student alanina bir ogrenci gir")
    public void chooseStudentAlaninaBirOgrenciGir() {
        studentIdDm = new Select(teacherPage.studentId);
        studentIdDm.selectByVisibleText("Team10Student Team10");
        ReusableMethods.bekle(1);
    }

    @And("Choose Education Term alanina bir donem sec")
    public void chooseEducationTermAlaninaBirDonemSec() {
        educationTermIdDdm = new Select(teacherPage.educationTerm);
        educationTermIdDdm.selectByVisibleText("FALL_SEMESTER");
        ReusableMethods.bekle(1);
    }

    @And("Ekranda cikan Please select lesson mesajini dogrula")
    public void ekrandaCikanPleaseSelectLessonMesajiniDogrula() {
        //ReusableMethods.visibleWait(teacherPage.lessonBosBirakilamazMesaji, 15);
        //Assert.assertEquals("Please select lesson", teacherPage.lessonBosBirakilamazMesaji.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("Please select lesson", addUserPage.verifyMessaj.getText());
    }


    @And("Choose Lesson alanina bir ders gir")
    public void chooseLessonAlaninaBirDersGir() {
        lessonIdDdm = new Select(teacherPage.lessonId);
        lessonIdDdm.selectByVisibleText("Team10Cucumber");
        ReusableMethods.bekle(1);
    }

    @And("Ekranda cikan Please select student mesajini dogrula")
    public void ekrandaCikanPleaseSelectStudentMesajiniDogrula() {
        //ReusableMethods.visibleWait(teacherPage.studentBosBirakilamazMesaji, 15);
        //Assert.assertEquals("Please select student", teacherPage.studentBosBirakilamazMesaji.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("Please select student", addUserPage.verifyMessaj.getText());
        ReusableMethods.bekle(1);


    }

    @And("Ekranda cikan Please select education term mesajini dogrula")
    public void ekrandaCikanPleaseSelectEducationTermMesajiniDogrula() {
        //ReusableMethods.visibleWait(teacherPage.educationTermBosBirakilamazMesaji, 15);
        //Assert.assertEquals("Please select education term", teacherPage.educationTermBosBirakilamazMesaji.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("Please select education term", addUserPage.verifyMessaj.getText());

    }

    //Buradan itibaren gönderdim

//    @And("Student Info List alanina eklenen name gorundugunu dogrula")  Asa
//    public void studentInfoListAlaninaEklenenNameGorundugunuDogrula() {
////        actions = new Actions(Driver.getDriver());
////        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN);
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);", teacherPage.submit); Asagı kaydırma var ondan silmedim
//        ReusableMethods.bekle(1);
//        Assert.assertTrue(teacherPage.verifyName.isDisplayed());
//    }

    @And("Student Info alanindaki Edit butonunun gorundugunu dogrula")
    public void studentInfoAlanindakiEditButonununGorundugunuDogrula() {
        Assert.assertTrue(teacherPage.editButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @And("Student Info alanindaki Edit butonuna tikla")
    public void studentInfoAlanindakiEditButonunaTikla() {
        teacherPage.editButton.click();
    }

    @And("Acilan ekranda Choose Lesson alanindan {string} sec")
    public void acilanEkrandaChooseLessonAlanindanSec(String ders) {
        ReusableMethods.visibleWait(teacherPage.editLesson, 15);
        lessonIdDdm = new Select(teacherPage.editLesson);
        lessonIdDdm.selectByVisibleText(ders);
        ReusableMethods.bekle(1);
    }

    @And("Choose Education Term alanindan {string} sec")
    public void chooseEducationTermAlanindanSec(String donem) {
        lessonIdDdm = new Select(teacherPage.editEducationTerm);
        lessonIdDdm.selectByVisibleText(donem);
        ReusableMethods.bekle(1);
    }

    @And("Absentee alanina {string} devamsizlik gir")
    public void absenteeAlaninaDevamsizlikGir(String devamsizlik) {
        teacherPage.editAbsentee.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        ReusableMethods.bekle(1);
        teacherPage.editAbsentee.sendKeys(devamsizlik);
    }

    @And("Midterm Exam alanina {string} ara sinav notunu gir")
    public void midtermExamAlaninaAraSinavNotunuGir(String araSinav) {
        teacherPage.editMidtermExam.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        ReusableMethods.bekle(1);
        teacherPage.editMidtermExam.sendKeys(araSinav);
    }

    @And("Final Exam alanina {string} final sinav notunu gir")
    public void finalExamAlaninaFinalSinavNotunuGir(String finalNot) {
        teacherPage.editFinalExam.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        ReusableMethods.bekle(1);
        teacherPage.editFinalExam.sendKeys(finalNot);
    }

    @And("Info Note alanina {string}  notunu gir")
    public void ınfoNoteAlaninaNotunuGir(String durumBilgisi) {
        teacherPage.editInfoNote.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        ReusableMethods.bekle(2);
        teacherPage.editInfoNote.sendKeys(durumBilgisi);
    }


    @And("Edit alanindaki Submit butonuna tikla")
    public void editAlanindakiSubmitButonunaTikla() {
        teacherPage.editSubmit.click();
    }

    @And("Notun editlendigine dair basari mesajini dogrula")
    public void notunEditlendigineDairBasariMesajiniDogrula() {
        //ReusableMethods.visibleWait(teacherPage.editIslemiBasarili, 15);
        //Assert.assertEquals("Student Info updated Successfully", teacherPage.editIslemiBasarili.getText());



        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("Student Info updated Successfully", addUserPage.verifyMessaj.getText());
        ReusableMethods.bekle(1);
    }

    @And("Edit Student Info Alanindaki X butonuna tikla")
    public void editStudentInfoAlanindakiXButonunaTikla() {
        teacherPage.editCikis.click();
        ReusableMethods.bekle(1);
    }

    @And("Student Info List alaninda Choose Lessona girilen {string} dogrula")
    public void studentInfoListAlanindaChooseLessonaGirilenDogrula(String lesson) {
        Assert.assertEquals(lesson, teacherPage.verifyLessonName.getText());
    }


    @And("Absentee alanina girilen {string} dogrula")
    public void absenteeAlaninaGirilenDogrula(String devam) {
        Assert.assertEquals(devam, teacherPage.verifyAbsentee.getText());
    }

    @And("Midterm Exam alanina girilen {string} dogrula")
    public void midtermExamAlaninaGirilenDogrula(String not1) {
        Assert.assertEquals(not1, teacherPage.verifyMidtermExam.getText());
    }

    @And("Final Exam alanina girilen {string} dogrula")
    public void finalExamAlaninaGirilenDogrula(String not2) {
        Assert.assertEquals(not2, teacherPage.verifyFinalExam.getText());
    }

    @And("Info Note alanina girilen {string} dogrula")
    public void ınfoNoteAlaninaGirilenDogrula(String durumDegerlendirme) {
        Assert.assertEquals(durumDegerlendirme, teacherPage.verifyInfoNote.getText());
    }

    @And("Student Info List alaninda ki silme butonunu dogrula")
    public void studentInfoListAlanindaKiSilmeButonunuDogrula() {
        // Assert.assertTrue(teacherPage.deleteButton.isDisplayed());
        ReusableMethods.bekle(1);
    }

    @And("Student Info List alaninda ki silme butonunu tikla")
    public void studentInfoListAlanindaKiSilmeButonunuTikla() {
        ReusableMethods.click(teacherPage.deleteButton);
        // teacherPage.deleteButton.click();
    }

    @And("Ogrencinin silindigini dogrula")
    public void ogrencininSilindiginiDogrula() {
        //ReusableMethods.visibleWait(teacherPage.silmeIslemiBasarili, 15);
        //Assert.assertEquals("Student Info deleted Successfully", teacherPage.silmeIslemiBasarili.getText());

        ReusableMethods.visibleWait(addUserPage.verifyMessaj, 15);
        Assert.assertEquals("Student Info deleted Successfully", addUserPage.verifyMessaj.getText());
        ReusableMethods.bekle(1);

    }



    @Then("Student Info List basligini dogrula")
    public void studentInfoListBasliginiDogrula() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", teacherPage.submit);
        ReusableMethods.bekle(1);
        Assert.assertTrue(teacherPage.studentInfoListBaslik.isDisplayed());
    }


    @And("Add Student Info alanindaki Choose Lesson alanindan {string} sec")
    public void addStudentInfoAlanindakiChooseLessonAlanindanSec(String lesson) {
        ddmVisibleText(teacherPage.lessonId, lesson);
        //lessonIdDdm = new Select(teacherPage.lessonId);
        //lessonIdDdm.selectByVisibleText(lesson);
        ReusableMethods.bekle(1);
    }

    @And("Add Student Info alanindaki Choose Student alanindan {string} sec")
    public void addStudentInfoAlanindakiChooseStudentAlanindanSec(String student) {

        ddmVisibleText(teacherPage.studentId, student);
        //studentIdDm = new Select(teacherPage.studentId);
        //studentIdDm.selectByVisibleText(student);
        ReusableMethods.bekle(1);
    }

    @And("Add Student Info alanindaki Choose Education Term alanindan {string} sec")
    public void addStudentInfoAlanindakiChooseEducationTermAlanindanSec(String term) {
        ddmVisibleText(teacherPage.educationTerm, term);
        //educationTermIdDdm = new Select(teacherPage.educationTerm);
        //educationTermIdDdm.selectByVisibleText(term);
        ReusableMethods.bekle(1);
    }

    @And("Absentee alanina {string} gir")
    public void absenteeAlaninaGir(String absentee) {
        teacherPage.absentee.sendKeys(absentee);
    }

    @And("Midtern Exam alanina {string} gir")
    public void midternExamAlaninaGir(String sinav1) {
        teacherPage.midtermExam.sendKeys(sinav1);
    }

    @And("Final Exam alanina {string} gir")
    public void finalExamAlaninaGir(String sinav2) {
        teacherPage.finalExam.sendKeys(sinav2);
    }

    @And("info Note alanina {string} gir")
    public void infoNoteAlaninaGir(String bilgi) {
        teacherPage.infoNote.sendKeys(bilgi);
    }

    @And("Student Info List alaninda Name {string} oldugunu dogrula")
    public void studentInfoListAlanindaNameOldugunuDogrula(String name) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", teacherPage.submit);
        Assert.assertEquals(name, teacherPage.verifyName.getText());
    }

    @And("Note alanindaki verinin gorunur oldugunu dogrula")
    public void noteAlanindakiVerininGorunurOldugunuDogrula() {
        teacherPage.verifyNote.isDisplayed();
    }

    @And("Average alanindaki verinin gorunur oldugunu dogrula")
    public void averageAlanindakiVerininGorunurOldugunuDogrula() {
        teacherPage.verifyAverage.isDisplayed();
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.closeDriver();
    }



}