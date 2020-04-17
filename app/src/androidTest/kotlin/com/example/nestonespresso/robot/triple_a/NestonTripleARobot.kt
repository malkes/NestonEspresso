package com.example.nestonespresso.robot.triple_a

import androidx.test.core.app.ActivityScenario
import com.example.nestonespresso.MainActivity
import com.example.nestonespresso.R
import com.example.test.extension.hasText

fun withMainActivity(func: NestonTripleARobot.() -> Unit) = NestonTripleARobot().apply(func)

class NestonTripleARobot {

    infix fun arrange(func: NestonArrangeRobot.() -> Unit) {
        NestonArrangeRobot().apply(func)
    }

    infix fun act(func: NestonActRobot.() -> Unit) {
        NestonActRobot().apply(func)
    }

    infix fun assert(func: NestonAssertRobot.() -> Unit) {
        NestonAssertRobot().apply(func)
    }

}

class NestonArrangeRobot() {
    fun mockQualquerCoisa() {
        //do nothing
    }
}

class NestonActRobot() {
    fun launch() = ActivityScenario.launch(MainActivity::class.java)
}

class NestonAssertRobot() {
    fun checkEmptyEditText() = R.id.edit_name.hasText("")

    fun checkImportantText() = R.id.text_sample.hasText("Texto super importante para a feature")
}