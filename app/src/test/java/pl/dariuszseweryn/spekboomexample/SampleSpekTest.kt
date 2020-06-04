package pl.dariuszseweryn.spekboomexample

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object KaboomTest: Spek({
    Feature("Kaboom") {
        val kaboom by memoized { Kaboom() }

        Scenario("kaboom maybe?") {

            Then("it should not kaboom") {
                kaboom.toKaboomOrNotKaboom()
            }
        }
    }
})