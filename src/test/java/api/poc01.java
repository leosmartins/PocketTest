package api;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class poc01 {

    @Test(groups = "api", testName = "GET Google")
    public void teste01() {

        when().
                get("https://www.google.com/").
                then().
                log().status().
                statusCode(200);
    }


    @Test(groups = "api", testName = "Weather 01")
    public void teste02() {

        baseURI = "https://demoqa.com/utilities/weather/city";

        when().
                get(baseURI + "/Assis").
                then().
                log().body().
                statusCode(200).
                extract().
                path("City");
    }

    @Test(groups = "api", testName = "Weather 02")
    public void teste03() {

        baseURI = "https://demoqa.com/utilities/weather/city";

        Response response = get(baseURI + "/Assis");

        System.out.println("Response Body -> \n" + response.getBody().asPrettyString());

        assertEquals(response.getBody().jsonPath().getString("City"), "Teste");


        /*
        String responseBody = response.getBody().asPrettyString(); //Cria uma string com o objeto JSON
        JsonPath json = new JsonPath(responseBody); //Variável para navegacao no JSON
        Map<String, String> weather = json.getMap("");//Passando vazio representa a raiz do JSON
        Set<String> weatherKeys = weather.keySet();//Conjunto de chaves do objeto JSON
        for(String key:weatherKeys){//Loop de Impressao, para cada chave, imprimir a chave e valor
            System.out.println("Key value: " + key + ", Element value: " + weather.get(key));
        }
        */

    }

}
