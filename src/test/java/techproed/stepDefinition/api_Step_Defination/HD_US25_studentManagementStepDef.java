package techproed.stepDefinition.api_Step_Defination;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import techproed.pojos.studentManagement.ResponsePojo;
import techproed.pojos.studentManagement.StudentManagementPojo;

import java.sql.*;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static techproed.base_url.BaseUrl.setup;
import static techproed.base_url.BaseUrl.spec;


public class HD_US25_studentManagementStepDef {
    public static ResponsePojo expectedData;
    public static StudentManagementPojo actualData;
    Faker faker=new Faker();
    Response response;
    Object İd;
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    int idStudent;
    public Object id;

    @Given("Admin sends a request to find the student")
    public void admin_sends_a_request_to_find_the_student() {

        //set the url

    setup("Team10Admin","Team10Admin");
    spec.pathParams("first","students","second","save");

    }

    @Given("Student information to be sent is prepared")
    public void student_information_to_be_sent_is_prepared() {
        //set the expectedData
        expectedData=new ResponsePojo("225","1976-06-06","Demirci","hdkslldfvb@gmail.com","h.ibrahim","MALE","nalan","Ahmed","vndhHD73+!","468-497-2837","294-98-3487","guzelyayla","nakddıdTK78");
      /*  {
  "advisorTeacherId": "225",
  "birthDay": "1976-06-06",
  "birthPlace": "Demirci",
  "email": "hdkslldfvb@gmail.com",
  "fatherName": "h.ibrahim",
  "gender": "MALE",
  "motherName": "nalan",
  "name": "Ahmed",
  "password": "vndhHD73+!",
  "phoneNumber": "468-497-2837",
  "ssn": "294-98-3487",
  "surname": "guzelyayla",
  "username": "nakddıdTK78"
}
        */
    }

    @When("Send a post request to add a student")
    public void send_a_post_request_to_add_a_student() {
        //send the request and get the response
        response=given(spec).body(expectedData).when().post("{first}/{second}");
       idStudent =response.jsonPath().getInt("object.id");
        System.out.println(idStudent);
        actualData=response.as(StudentManagementPojo.class);
        response.prettyPrint();

    }

    @Then("Admin verifies that the student credentials contains birthPlace, gender, fatherName, birthDay,advisorTeacherId, phoneNumber, surname, name, motherName, email, username, ssn, password")
    public void admin_verifies_that_the_student_credentials_contains_birth_place_gender_father_name_birth_day_advisor_teacher_ıd_phone_number_surname_name_mother_name_email_username_ssn_password() {
       //Do assertion

        JsonPath jsn=response.jsonPath();
        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getAdvisorTeacherId(),jsn.getInt("advisorTeacherId"));
        assertEquals(expectedData.getBirthDay(),jsn.getString("birthDay"));
        assertEquals(expectedData.getBirthPlace(),jsn.getString("birthPlace"));
        assertEquals(expectedData.getEmail(),jsn.getString("email"));
        assertEquals(expectedData.getFatherName(),jsn.getString("fatherName"));
        assertEquals(expectedData.getGender(),jsn.getString("gender"));
        assertEquals(expectedData.getMotherName(),jsn.getString("motherName"));
        assertEquals(expectedData.getName(),jsn.getString("name"));
        assertEquals(expectedData.getPhoneNumber(),jsn.getString("phoneNumber"));
        assertEquals(expectedData.getSsn(),jsn.getString("ssn"));
        assertEquals(expectedData.getSurname(),jsn.getString("surname"));
        assertEquals(expectedData.getUsername(),jsn.getString("username"));





    }



    @Given("Get the id number of the student data")
    public void get_the_id_number_of_the_student_data() {
        setup("Team10Admin","Team10Admin");
        //https://managementonschools.com/app/students/getAll
        spec.pathParams("first","students","second","getAll");
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        JsonPath jsonPath=response.jsonPath();
        List<Object> userIdList=jsonPath.getList("findAll{it.ssn=='"+"fakeSsn"+"'}.id");
       id= (String) userIdList.get(0);
        System.out.println("id");


    }

    @When("Called with student id")
    public void called_with_student_id() {
        spec.pathParams("first","students","second","getStudentById").queryParam("id");
        response=given(spec).when().get("{first}/{second}");
        response.prettyPrint();
        actualData=response.as(StudentManagementPojo.class);

    }

    @When("Queried by student id")
    public void queried_by_student_id() throws SQLException {
        connection=DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
        statement=connection.createStatement();
        String query = "Select * from student where id = "+"id"+"";
        resultSet = statement.executeQuery(query);
        resultSet.next();


    }

    @Then("validate body contains birthPlace {string}, gender\"MALE\", fatherName\"h.ibrahim\", birthDay\"{int}-{int}-{int}\",advisorTeacherId\"{int}\",phoneNumber\"{int}-{int}-{int}\",surname\"guzelyayla\",name\"Ahmed\",motherName\"nalan\",email\"sndddfvb@gmail.com\",username\"fhkdlllAK78\",ssn\"{int}-{int}-{int}\",password\"vndhHD73+!\",")
    public void validate_body_contains_birth_place_gender_male_father_name_h_ibrahim_birth_day_advisor_teacher_ıd_phone_number_surname_guzelyayla_name_ahmed_mother_name_nalan_email_sndddfvb_gmail_com_username_fhkdlll_ak78_ssn_password_vndh_hd73(String string, Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7, Integer int8, Integer int9, Integer int10) throws SQLException {

        assertEquals(expectedData.getAdvisorTeacherId(),resultSet.getInt("advisor_teacher_id"));
        assertEquals(expectedData.getBirthDay(),resultSet.getString("birth_day"));
        assertEquals(expectedData.getBirthPlace(),resultSet.getString("birth_place"));
        assertEquals(expectedData.getEmail(),resultSet.getString("email"));
        assertEquals(expectedData.getFatherName(),resultSet.getString("father_name"));
        assertEquals(0, resultSet.getInt("gender"));
        assertEquals(expectedData.getMotherName(),resultSet.getString("mother_name"));
        assertEquals(expectedData.getName(),resultSet.getString("name"));
        assertEquals(expectedData.getPhoneNumber(),resultSet.getString("phone_number"));
        assertEquals(expectedData.getSsn(),resultSet.getString("ssn"));
        assertEquals(expectedData.getSurname(),resultSet.getString("surname"));
        assertEquals(expectedData.getUsername(),resultSet.getString("username"));
    }



}
