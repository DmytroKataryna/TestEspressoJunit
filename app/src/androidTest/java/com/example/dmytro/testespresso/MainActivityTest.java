package com.example.dmytro.testespresso;


import android.support.test.runner.AndroidJUnit4;

import com.example.dmytro.testespresso.custom.CheckRating;
import com.example.dmytro.testespresso.custom.SetRating;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

//    @Test
//    public void preConditions(){
//
//    }

    @Test
    public void firstMyEspressoTest() {
        onView(withText("Hello")).check(matches(isDisplayed()));
    }

    @Test
    public void sendTest() {
        onView(withId(R.id.editText)).perform(typeText("CONSTANTA"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("CONSTANTA")));
    }

    @Test
    public void checkRatingBar() {
        onView(withId(R.id.ratingBar)).perform(new SetRating()).check(new CheckRating());
    }
    
}
