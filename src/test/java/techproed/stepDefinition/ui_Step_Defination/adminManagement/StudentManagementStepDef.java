package techproed.stepDefinition.ui_Step_Defination.adminManagement;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.AddUserPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.Random;

public class
StudentManagementStepDef {
    AddUserPage page = new AddUserPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();
    Select lessonIdTeacher;

    @When("Admin hesabiyla login ol")
    public void adminHesabiylaLoginOl() {
        ReusableMethods.bekle(3);
        page.login.click();
        page.username.sendKeys(ConfigReader.getProperty("Team10Admin"));
        page.passsword.sendKeys(ConfigReader.getProperty("adminPassword"));
        page.loginButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Admin hesabi ile giris yapildigini dogrula")
    public void adminHesabiIleGirisYapildiginiDogrula() {
        assert page.managementVerifyTitle.isDisplayed();

    }

    @Then("Admin Management  yazısının gorunurlugunu dogrula")
    public void adminManagementYazısınınGorunurlugunuDogrula() {
        assert page.managementVerifyTitle.isDisplayed();
    }

    @Then("Add Admin yazisinin gorundugunu dogrula")
    public void addAdminYazisininGorundugunuDogrula() {
        assert page.addKullaniciYazisi.isDisplayed();

    }


    //US25
    /*@Given("go to Browserr")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("managementonschoolsUrl"));

    }

    @And("Click the Login button on the home page")
    public void click_the_login_button_on_the_home_page() {
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
    public void click_themenu_button() {
        page.menuBoxx.click();
        ReusableMethods.bekle(2);
    }

   @Then("Verify that the Main Menu is visible")
    public void verify_that_the_main_menu_is_visibles() {
        Assert.assertTrue(page.menuBoxx.isDisplayed());
        ReusableMethods.bekle(2);
    }*/

    /*@Then("Student Management verify that it is visible")
    public void student_management_verify_that_it_is_visible() {
        Assert.assertTrue(page.studentManagementTxt.isDisplayed());

    }

    @Then("Click the Student Management")
    public void click_the_student_management() {
        page.studentManagementTxt.click();
    }

    @And("Click Choose Advisor Teacher box")
    public void clickChooseAdvisorTeacher_Boxs() {
        page.advisorTeacherIdBx.click();
    }

    @Then("Choose Advisor Teacher Confirm selectable")
    public void choose_advisor_teacher_confirm_selectabless() {
        // Assert.assertTrue(studentManagement.advisorTeacherIdBx.isSelected());
        //page.advisorTeacherIdBx.sendKeys(ConfigReader.getProperty("AdvisorTeacher"));
        lessonIdTeacher = new Select(page.advisorTeacherIdBx);
        lessonIdTeacher.selectByVisibleText("Team10Teacher Team10");
        //ReusableMethods.bekle(1);
        //page.advisorTeacherIdBx.sendKeys("team10 Team10");
    }

    @And("Enter name,surname,birth place,email,phone")
    public void enter_Names_SurnameBirthPlaceEmailPhone() {

        page.nameBx.sendKeys("Adil",
                Keys.TAB, "Sert", Keys.TAB, "Manisa",

                Keys.TAB, faker.internet().emailAddress(), Keys.TAB, randomPhone());


    }


    @And("Click Male")
    public void clickMale() {
        page.maleTxt.click();

    }*/


    /*@And("Enter date of birth,ssn,username, father name, mother name,password")
    public void enter_Dates_OfBirthSsnUsernameFatherNameMotherNamePassword() {


        js.executeScript("window.scrollBy(0, 200);");
        page.birthdayBox.sendKeys("03072000");
        ReusableMethods.bekle(3);
        page.ssnBx.sendKeys(faker.number().numberBetween(100, 999) + "-" + faker.number().
                numberBetween(10, 99) + "-" + faker.number().numberBetween(1000, 9999));

        ReusableMethods.bekle(3);
        page.usernameBx.sendKeys(faker.name().lastName(),
                Keys.TAB, "Taha",
                Keys.TAB, "Elif", Keys.TAB, "C257K.GLc3a");
        ReusableMethods.bekle(1);

    }*/


    /*@Then("Click the Submit buttonnn")
    public void click_the_submit_buttons() {
        ReusableMethods.click(page.submitBtn);
        ReusableMethods.bekle(2);

    }*/

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

    @And("Verify that {string} isdisplayed")
    public void verifyThatIsdisplayed(String arg0) {
        assert page.verifyMessaj.isDisplayed();
    }


}
