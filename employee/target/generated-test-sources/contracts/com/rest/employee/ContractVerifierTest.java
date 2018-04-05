package com.rest.employee;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.rest.employee.BaseEmpControllerTestClass;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Test;

import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.springframework.cloud.contract.verifier.assertion.SpringCloudContractAssertions.assertThat;

public class ContractVerifierTest extends BaseEmpControllerTestClass {

	@Test
	public void validate_getAllEmployersContract() throws Exception {
		// given:
			MockMvcRequestSpecification request = given();

		// when:
			ResponseOptions response = given().spec(request)
					.get("/all");

		// then:
			assertThat(response.statusCode()).isEqualTo(200);
			assertThat(response.header("Content-Type")).matches("application/json.*");
		// and:
			DocumentContext parsedJson = JsonPath.parse(response.getBody().asString());
			assertThatJson(parsedJson).array("['employers']").contains("['name']").isEqualTo("KING");
			assertThatJson(parsedJson).array("['employers']").contains("['id']").isEqualTo(7698);
			assertThatJson(parsedJson).array("['employers']").contains("['id']").isEqualTo(7782);
			assertThatJson(parsedJson).array("['employers']").contains("['name']").isEqualTo("BLAKE");
			assertThatJson(parsedJson).array("['employers']").contains("['deptId']").isEqualTo(10);
			assertThatJson(parsedJson).array("['employers']").contains("['id']").isEqualTo(7839);
			assertThatJson(parsedJson).array("['employers']").contains("['deptId']").isEqualTo(30);
			assertThatJson(parsedJson).array("['employers']").contains("['name']").isEqualTo("CLARK");
	}

}
