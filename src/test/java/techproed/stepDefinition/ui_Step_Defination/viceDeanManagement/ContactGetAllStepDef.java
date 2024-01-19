package techproed.stepDefinition.ui_Step_Defination.viceDeanManagement;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import techproed.pages.AddUserPage;
import techproed.pages.ContactGetAll;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class ContactGetAllStepDef {
    AddUserPage page=new AddUserPage();
    ContactGetAll contact=new ContactGetAll();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @And("ViceDean Contact Message bolumunde Date bilgisinin gorundugunu dogrular")
    public void vicedeanContactMessageBolumundeDateBilgisininGorundugunuDogrular() {

    }
    
    @And("Vice Dean Name basligini dogrular")
    public void viceDeanNameBasliginiDogrular() {
        assert contact.nameTitle.isDisplayed();
    }

    @And("Vice Dean Email basligini dogrular")
    public void viceDeanEmailBasliginiDogrular() {
        assert contact.emailTitle.isDisplayed();
    }

    @And("Vice Dean Date basligini dogrular")
    public void viceDeanDateBasliginiDogrular() {
        assert contact.dateEmail.isDisplayed();
    }

    @And("Vice Dean Subject basligini dogrular")
    public void viceDeanSubjectBasliginiDogrular() {
        assert contact.subjectTitle.isDisplayed();
    }

    @And("Vice Dean Message basligini dogrular")
    public void viceDeanMessageBasliginiDogrular() {
        assert contact.messageTitle.isDisplayed();
    }

    @And("ViceDean Contact Message bolumunde Name bilgisinin gorundugunu dogrular")
    public void vicedeanContactMessageBolumundeNameBilgisininGorundugunuDogrular() {
        contact.messageVerify.forEach(t-> assertTrue(t.isDisplayed()));
    }



    @And("Vice Dean messajin silindigini dogrular")
    public void viceDeanMessajinSilindiginiDogrular() {
        Assert.assertTrue(false);
    }


    @Then("Contact Message bolumunde delet ikonuna tiklar")
    public void contactMessageBolumundeDeletIkonunaTiklar() {
    }

    @And("{string} gorundugunu dogrular")
    public void gorundugunuDogrular(String arg0) {
    }
}
