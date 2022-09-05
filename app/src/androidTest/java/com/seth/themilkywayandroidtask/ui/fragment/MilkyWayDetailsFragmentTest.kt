package com.seth.themilkywayandroidtask.ui.fragment

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.seth.themilkywayandroidtask.MainActivity
import com.seth.themilkywayandroidtask.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MilkyWayDetailsFragmentTest {

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_milky_way_center_is_showing() {
        Espresso.onView(withId(R.id.center_labelTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(withId(R.id.centerTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun test_milky_way_title_is_showing() {
        Espresso.onView(withId(R.id.milky_way_image_titleTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }

    @Test
    fun test_milky_way_date_created_is_showing() {
        Espresso.onView(withId(R.id.date_created_labelTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        Espresso.onView(withId(R.id.date_createdTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }

    @Test
    fun test_milky_way_description_is_showing() {
        Espresso.onView(withId(R.id.milky_way_image_descriptionTv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

    }
}