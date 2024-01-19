package techproed.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken(String password, String username) {
        String body = "{\n" +
                "  \"password\": \"Team10Admin\",\n" +
                "  \"username\": \"Team10Admin\"\n" +
                "}";
        Response response = given().body(body).contentType(ContentType.JSON).when().post("https://managementonschools.com/app/auth/login");
        // Body Listeler
        response.prettyPrint();
        return response.jsonPath().getString("token");
      /*  String url= ConfigReader.getProperty("manage_Url") + "/auth/login";
        Map<String, Object> token=new HashMap<>();
        token.put( "password", password);
        token.put("username", username);
        Response response=given().contentType(ContentType.JSON).body(token).post(url);
        response.prettyPrint();
        return response.jsonPath().getString("token");
*/
    }
}
