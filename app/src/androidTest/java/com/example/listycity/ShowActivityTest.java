package com.example.listycity;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;

@RunWith(AndroidJUnit4.class)
public class ShowActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> rule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testActivitySwitch() {
        onData(org.hamcrest.Matchers.anything())
                .inAdapterView(withId(R.id.city_list))
                .atPosition(0)
                .perform(click());

        onView(withId(R.id.cityNameText))
                .check(matches(isDisplayed()));
    }

    @Test
    public void testCityNameConsistency() {
        onData(org.hamcrest.Matchers.anything())
                .inAdapterView(withId(R.id.city_list))
                .atPosition(0)
                .perform(click());

        onView(withId(R.id.cityNameText))
                .check(matches(withText("Edmonton")));
    }

    @Test
    public void testBackButton() {
        onData(org.hamcrest.Matchers.anything())
                .inAdapterView(withId(R.id.city_list))
                .atPosition(0)
                .perform(click());

        onView(withId(R.id.backButton))
                .perform(click());

        onView(withId(R.id.city_list))
                .check(matches(isDisplayed()));
    }
}