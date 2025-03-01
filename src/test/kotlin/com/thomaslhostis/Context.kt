package com.thomaslhostis

import io.quarkiverse.cucumber.ScenarioScope
import io.restassured.response.Response

@ScenarioScope
class Context {
    lateinit var response: Response
}
