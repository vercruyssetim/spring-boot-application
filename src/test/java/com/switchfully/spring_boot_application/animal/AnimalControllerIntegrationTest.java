package com.switchfully.spring_boot_application.animal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AnimalControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Test
    void getAllAnimals() {
        AnimalDTO[] result = given()
                .baseUri("http://localhost")
                .port(port)
                .when()
                .get("/animals")
                .then()
                .assertThat()
                .statusCode(HttpStatus.OK.value())
                .extract()
                .as(AnimalDTO[].class);

        Assertions.assertThat(result).containsExactly(new AnimalDTO("name"));
    }
}
