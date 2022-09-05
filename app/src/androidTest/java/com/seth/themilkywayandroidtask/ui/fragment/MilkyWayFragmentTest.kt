package com.seth.themilkywayandroidtask.ui.fragment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressBack
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.seth.themilkywayandroidtask.MainActivity
import com.seth.themilkywayandroidtask.R
import com.seth.themilkywayandroidtask.ui.adapter.MilkyWayAdapter
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MilkyWayFragmentTest {

    private val MILKY_WAY_LIST_ITEM_IN_TEST = 1


    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun recyclerview_is_showing() {
        onView(withId(R.id.milky_way_imageList))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_selectMilkyWayItem_isDetailFragmentVisible() {
        // Click milky way item #MILKY_WAY_LIST_ITEM_IN_TEST
        onView(withId(R.id.milky_way_imageList))
            .perform(
                actionOnItemAtPosition<MilkyWayAdapter.MilkyWayViewHolder>(
                    MILKY_WAY_LIST_ITEM_IN_TEST,
                    click()
                )
            )

        // Confirm navigation to MilkyWayDetailsFragment and display title
        onView(withId(R.id.milky_way_image_titleTv)).check(matches(withText("A monster in the Milky Way")))
    }

    @Test
    fun test_backNavigation_toMilkyWayFragment() {
        // Click milky way item #MILKY_WAY_LIST_ITEM_IN_TEST
        onView(withId(R.id.milky_way_imageList))
            .perform(
                actionOnItemAtPosition<MilkyWayAdapter.MilkyWayViewHolder>(
                    MILKY_WAY_LIST_ITEM_IN_TEST,
                    click()
                )
            )

        // Confirm nav to MilkyWayDetailsFragment and display title
        onView(withId(R.id.milky_way_image_titleTv)).check(matches(withText("A monster in the Milky Way")))

        pressBack()

        // Confirm MilkyWayFragment in view
        onView(withId(R.id.milky_way_imageList)).check(matches(isDisplayed()))
    }

}

