package techproed.stepDefinition.api_Step_Defination;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import techproed.pojos.viceDeanManagement.LessonPojo08pojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;


public class ViceDeanManagementStepDef08 {

    Response response;

     @Given("get request with lessonName")
    public void getRequestWithLessonName() {

        //{{baseUrl}}/lessons/getLessonByName?lessonName=John Doe Lesson
        setup("Team10Admin","Team10Admin");
        spec.pathParams("first", "lessons", "second", "getLessonByName")
                .queryParams("lessonName", "English4");
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();



    }

    @Then("verify body with lesson: lessonId={string}, lessonName={string}, creditScore={string},  compulsory={string}, message={string}")
    public void gelen_lesson_body_yi_dogrula_lesson_id_lesson_name_credit_score_compulsory_message(String lessonId, String lessonName, String creditScore, String compulsory,
                                                                                                   String message) throws JsonProcessingException, com.fasterxml.jackson.core.JsonProcessingException {

       // Response'ı LessonPostPojo class'a çevirerek scenario outline'dan gelen data ile doğruluyorum
         LessonPojo08pojo actualData =new ObjectMapper().readValue(response.asString(), LessonPojo08pojo.class);//De-Serialization
          System.out.println("actualData = " + actualData);

        assertEquals(200,response.statusCode());
        assertEquals(lessonId,actualData.getObject().getLessonId()+"");
        assertEquals(lessonName,actualData.getObject().getLessonName());
        assertEquals(creditScore,actualData.getObject().getCreditScore()+"");
        assertEquals(compulsory,actualData.getObject().getCompulsory());
        assertEquals(message,actualData.getMessage());
    }



    }













