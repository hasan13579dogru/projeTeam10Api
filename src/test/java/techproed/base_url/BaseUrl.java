package techproed.base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static techproed.utilities.Authentication.generateToken;

public class BaseUrl {

    public static RequestSpecification spec;
    public static void setup(String password,String username){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization",generateToken(password,username))
                .setContentType(ContentType.JSON)
                .build();

    }
}
