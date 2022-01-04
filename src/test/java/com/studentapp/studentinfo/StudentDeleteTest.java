package com.studentapp.studentinfo;


import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    @Test
    public void deleteStudentData(){

        Response response = given()
                .pathParam("id",104)
                .when()
                .delete("/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }


}
