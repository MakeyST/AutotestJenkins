package tests.APITest;

import API.Registration.Registration;
import API.Registration.SuccessReg;
import API.Specifications;
import org.testng.annotations.Test;

import static API.Costant.BASE_URL;
import static io.restassured.RestAssured.given;

public class APIRegistrationTest {
    @Test
    public void successRegTest(){
        Specifications.installSpecification(Specifications.requestSpec(BASE_URL),Specifications.responceSpec());
        Registration user = new Registration("aldsldds@ggg.ggg","simbol12345");
        SuccessReg successReg = given()
                .body(user)
                .when()
                .post("/auth/register/email")
                .then().log().all()
                .extract().as(SuccessReg.class);
    }
}
