package techproed.hooks;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.time.Duration;

import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.managementonschoolsBaseUrl.adminSetup;

public class Hooks {
  /*  @Before("@admin")     // @Before("@TC01_Api") boyle yazarsak sadece bir test case calisir
    public void beforeApiAdmin() {

        System.out.println("Before Method for admin");

        adminSetup();
    }*/

    @Before
    public void setUp() throws Exception {
        setup("Team10Admin", "Team10Admin");
        // Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
        // Driver.getDriver().manage().window().maximize();
        // Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "scenario_" + scenario.getName());
            Driver.closeDriver();
        }

    }
}


