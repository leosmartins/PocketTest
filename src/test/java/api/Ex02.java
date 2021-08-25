package api;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertEquals;

public class Ex02 {

    public String getCity() {
        List<String> cities = Arrays.asList("Teste01", "Teste02", "Teste03", "Teste04", "Teste05", "Teste06");
        Random r = new Random();
        String city = cities.get(r.nextInt(cities.size()));
        return city;
    }

    @Test(groups = "api", description = "Buscar clima de uma cidade, Padrao 01")
    public void teste01() {

        baseURI = "https://demoqa.com/utilities/weather/city/";

        given().
        when().
                log().
                    uri().
                get(baseURI + getCity()).
        then().
                log().
                    status().
                log().
                    body().
        assertThat().
                statusCode(200).and().body("City", equalTo("Teste01"));
    }

    @Test(groups = "api", description = "Buscar clima de uma cidade, Padrao 02")
    public void teste02() {

        baseURI = "https://demoqa.com/utilities/weather/city/";

        Response response = given().when().log().uri().get(baseURI + getCity());

        System.out.println("Response -> \n" + response.getStatusCode() + "\n" + response.getBody().asPrettyString());

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.getBody().jsonPath().getString("City"), "Teste01");
    }


}
