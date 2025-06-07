package imp;
import helper.ApiHelper;
import  io.restassured.response.Response;
import com.thoughtworks.gauge.Step;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiRequestImp {

    private static Response response;
    private String endpoint;

    @Step("API- e GET request gonder <url>")
    public void sendGetRequest(String url) {
        response = given()
                .when()
                .get(url)
                .then()
                .log().all()
                .extract().response();
    }

    @Step("Status kodu <statusCode> olmalidir")
    public void validateStatusCode(int statusCode) {
        response.then().statusCode(statusCode);

    }

    @Step("Json cavabinda <key> deyeri <value> olmalidir")
    public void validJsonKeyValue(String key, String value) {

        try {
            // Eger value ededdirse, int kimi yoxla
            int intValue = Integer.parseInt(value);
            response.then().body(key, equalTo(intValue));
        } catch (NumberFormatException e) {
            // eger eded deyilse, string kimi yoxla
            response.then().body(key, equalTo(value));
        }


    }

    @Step("Json cavabinda <key> deyeri bos olmamalidir")
    public void jsonKeyShouldNotBeEmpty(String key) {
        response.then().body(key, not(isEmptyOrNullString()));

    }

    @Step("Header <headerKey> deyeri <expectedValue> olmalidir")
    public void headerValueShouldBe(String headerKey, String expectedValue) {
        response.then().header(headerKey, equalTo(expectedValue));

    }

    @Step("Header <headerKey> movcud olmalidir")
    public void headerShouldExist(String headerKey) {
        response.then().header(headerKey, notNullValue());


    }

    @Step("Body icinde <text> metnini ehtiva etmelidir")
    public void bodyShouldContainText(String text) {
        response.then().body(containsString(text));

    }

    @Step("Json cavabinda <key> deyeri <value> ile baslayir")
    public void jsonKeyShouldStartWith(String key, String value) {
        response.then().body(key, startsWith(value));

    }

    @Step("Respons cavab muddeti <maxMillis> saniyeden az olmalidir")
    public void responseTimeShouldBeLessThanSeconds(double maxMillis) {

        long responseTime = response.time(); //millisaniye
        double seconds = responseTime / 1000.0;
        System.out.println("Cavab muddeti: " + seconds);
        if (responseTime > maxMillis) {
            throw new AssertionError("Cavab cox gec geldi:" + responseTime + " ms");
        }
    }

    @Step("Json cavabinda <key> deyeri ededdir")
    public void jsonKeyShopuldBeNumber(String key) {
        response.then().body(key, instanceOf(Number.class));
    }

    @Step("Json cavabinda verilen keyler movcuddur: <keys>")
    public void multipleKeysShouldExist(String keys) {

        String[] keyArray = keys.split(","); //"userId,titile,body,id" bu sekilden ["userId","titile","body","id"]
        for (String key : keyArray) {
            response.then().body("$", hasKey(key.trim())); //" body" olur "body"
        }

    }


    @Step("Add base url <baseUrl>")
    public void setBaseUrl(String baseUrl) {
        ApiHelper.getInstance().getRequestSpecification().baseUri(baseUrl);
    }

    @Step("Add endpoint <endpoint>")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;

    }

    @Step("Add body as file from resource <filePath>")
    public void addBodyFromFile(String filePath) throws Exception {
        String jsonBody = new String(Files.readAllBytes(Paths.get("src/test/resources/body/post/" + filePath)));
        ApiHelper.getInstance().getRequestSpecification().body(jsonBody);

        // src/test/resources/             body/post/valid-post-user1.json = filePath

    }

    @Step("Post request and display response")
    public void sendPostRequest() {
        response = ApiHelper.getInstance().getRequestSpecification()
                .when().post(endpoint)
                .then().log().all()
                .extract().response();

    }

    @Step("Send DELETE request")
    public void sendDeleteRequest() {
        response = ApiHelper.getInstance().getRequestSpecification()
                .when().delete(endpoint)
                .then().log().all()
                .extract().response();
    }

    @Step("Send PATCH request")
    public void sendPatchRequest() {
        response = ApiHelper.getInstance().getRequestSpecification()
                .when().patch(endpoint)
                .then().log().all()
                .extract().response();

    }

    @Step("Send PUT request")
    public void sendPutRequest() {
        response = ApiHelper.getInstance().getRequestSpecification()
                .when().put(endpoint)
                .then().log().all()
                .extract().response();

    }
}
