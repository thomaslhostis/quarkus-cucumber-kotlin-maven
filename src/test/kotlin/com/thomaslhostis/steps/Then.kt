package com.thomaslhostis.steps

import com.thomaslhostis.Context
import io.cucumber.java.en.Then

class Then(
    private val context: Context
) {
    @Then("I receive hello")
    fun `I receive hello`() {
        assert(context.response.statusCode == 200)
        assert(context.response.body.asString() == "Greetings")
    }
}
