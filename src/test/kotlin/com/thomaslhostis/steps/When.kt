package com.thomaslhostis.steps

import com.thomaslhostis.Context
import io.cucumber.java.en.When
import io.restassured.RestAssured

class When(
    private val context: Context
) {
    @When("I try to get hello")
    fun `I try to get hello`() {
        context.response = RestAssured.`when`().get("/hello")
    }
}
