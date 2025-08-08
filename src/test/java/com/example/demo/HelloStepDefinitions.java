package com.example.demo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloStepDefinitions {

    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @When("the client calls {string}")
    public void the_client_calls(String path) {
        response = restTemplate.getForEntity(path, String.class);
    }

    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer statusCode) {
        assertThat(response.getStatusCode().value()).isEqualTo(statusCode);
    }

    @Then("the client receives body {string}")
    public void the_client_receives_body(String body) {
        assertThat(response.getBody()).isEqualTo(body);
    }
}
