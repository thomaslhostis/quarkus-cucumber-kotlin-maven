package com.thomaslhostis

import io.quarkiverse.cucumber.CucumberOptions
import io.quarkiverse.cucumber.CucumberQuarkusTest

@CucumberOptions(
    tags = "@wip"
)
class CucumberTest: CucumberQuarkusTest() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runMain(CucumberTest::class.java, args)
        }
    }
}
