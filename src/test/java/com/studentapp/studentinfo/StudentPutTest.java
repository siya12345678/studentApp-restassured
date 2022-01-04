package com.studentapp.studentinfo;


import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class StudentPutTest extends TestBase {

    @Test
     public void updateStudentWithPut(){
       /* List<String> courseList = new ArrayList<>();
        courseList.add("Java");
        courseList.add("Selenium");

        */

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Siya");
        studentPojo.setLastName("Patel");
        studentPojo.setEmail("svpatel0804@gmail.com");
        studentPojo.setProgramme("Developer");
       // studentPojo.setCourses(courseList);


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 102)
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }











}
