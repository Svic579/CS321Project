package com.example.epa;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {
    @Rule
    MainActivity theMain = new MainActivity();

    // testing if all buttons are functioning when clicked
    @Test
    public void checkingClicks() {
        onView(withId(R.id.personal)).perform(click());
        onView(withId(R.id.locator)).perform(click());
        onView(withId(R.id.specific)).perform(click());
        onView(withId(R.id.Tutorial)).perform(click());
        onView(withId(R.id.Notification)).perform(click());


    }

}
