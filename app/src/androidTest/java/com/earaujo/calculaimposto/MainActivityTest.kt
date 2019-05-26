package com.earaujo.calculaimposto

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var testRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java, false, true)

    @Test
    fun useAppContext() {
        //Action
        onView(withId(R.id.et_compra)).perform(typeText("1000"), closeSoftKeyboard())
        onView(withId(R.id.btn_calcula)).perform(click())

        //Check
        onView(withId(R.id.tv_imposto)).check(matches(withText("1300.0")))
    }
}