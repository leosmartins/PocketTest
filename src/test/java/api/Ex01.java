package api;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

public class Ex01 {

    @Test(groups = "api", description = "Realizacao de um GET no Google")
    public void teste01() {

        when().
                get("https://www.google.com/").
        then().
                log().
                    status().
        assertThat().
                statusCode(200);
    }

}
