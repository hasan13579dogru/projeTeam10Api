package techproed.stepDefinition.api_Step_Defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.base_url.managementonschoolsBaseUrl;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;


public class ContactGetAllStepDef07 extends managementonschoolsBaseUrl {

    Response response;
    @Given("Get request ile tum mesajlari al")
    public void getRequestIleTumMesajlariAl() {
        setup("Team10Admin","Team10Admin");
        spec.pathParams("first","contactMessages","second","getAll").
                queryParams("size","10000");

        response = given(spec).get("{first}/{second}");
        response.prettyPrint();


    }
    @Then("Verify body: name={string}, email={string}, subject={string}, message={string}, date={string}")
    public void verify_body_name_email_subject_message_date(String name, String email, String subject, String message, String date) {

        JsonPath jsonPath = response.jsonPath();
        String actName = jsonPath.getList("content.findAll{it.email=='"+email+"'}.name").get(0).toString();
        String actEmail = jsonPath.getList("content.findAll{it.email=='"+email+"'}.email").get(0).toString();
        String actSubject = jsonPath.getList("content.findAll{it.email=='"+email+"'}.subject").get(0).toString();
        String actMessage = jsonPath.getList("content.findAll{it.email=='"+email+"'}.message").get(0).toString();
        String actDate = jsonPath.getList("content.findAll{it.email=='"+email+"'}.date").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(actName,name);
        assertEquals(actEmail,email);
        assertEquals(actSubject,subject);
        assertEquals(actMessage,message);
        assertEquals(actDate,date);

    }



    }









