package com.example.test.extension

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.not

fun Int.hasText(text: String) : ViewInteraction = Espresso.onView(
    ViewMatchers.withId(this)
).check(
    ViewAssertions.matches(
        withText(text)
    )
)

fun Int.isDisable(): ViewInteraction =
    Espresso.onView(ViewMatchers.withId(this)).check((ViewAssertions.matches(not(ViewMatchers.isEnabled()))))

fun Int.isEnabled(): ViewInteraction =
    Espresso.onView(ViewMatchers.withId(this)).check((ViewAssertions.matches(ViewMatchers.isEnabled())))

fun Int.typeText(text: String): ViewInteraction =
    Espresso.onView(
        ViewMatchers.withId(this)
    ).perform(
        ViewActions.typeText(text)
    )