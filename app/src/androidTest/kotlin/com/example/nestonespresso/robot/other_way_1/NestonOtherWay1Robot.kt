package com.example.nestonespresso.robot.other_way_1

import androidx.test.core.app.ActivityScenario
import com.example.nestonespresso.MainActivity
import com.example.nestonespresso.R
import com.example.test.extension.hasText
import com.example.test.extension.isDisable
import com.example.test.extension.isEnabled
import com.example.test.extension.typeText

fun NestonOtherWay1Test.withMainActivity(func: NestonOtherWayRobot.() -> Unit) = NestonOtherWayRobot().apply(func)

class NestonOtherWayRobot {

    fun launchActivity() = ActivityScenario.launch(MainActivity::class.java)

    infix fun verify(func: NestonOtherWayResult.() -> Unit ) = NestonOtherWayResult()

    fun mockQualquerCoisa() {
        //do nothing
    }

    fun typeInvalidText() = R.id.edit_name.typeText("ABC")

    fun typeValidText() = R.id.edit_name.typeText("ABCD")

}

class NestonOtherWayResult() {
    fun checkEmptyEditText() = R.id.edit_name.hasText("")

    fun checkImportantText() = R.id.text_sample.hasText("Texto super importante para a feature")

    fun checkButtonIsDisabled() = R.id.button_click_me.isDisable()

    fun checkButtonIsEnable() = R.id.button_click_me.isEnabled()
}