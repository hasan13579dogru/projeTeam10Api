package techproed.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import techproed.utilities.ConfigReader;

import static techproed.utilities.Authentication.generateToken;

public class managementonschoolsBaseUrl {

    public static void adminSetup(){

        RequestSpecification spec = new RequestSpecBuilder().setContentType(ContentType.JSON).addHeader("Authorization",
                        generateToken(ConfigReader.getProperty("Password"), ConfigReader.getProperty("UsernameAdmin"))).
                setBaseUri("https://managementonschools.com/app").build();
    } 
    

   /* public static RequestSpecification spec;

    public static void setup(String password, String username) {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateToken(password, username))
                .setContentType(ContentType.JSON)
                .build();
*/
    }
