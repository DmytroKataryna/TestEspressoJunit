package com.example.dmytro.testespresso.custom;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import android.widget.RatingBar;

import org.hamcrest.Matcher;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;


public class SetRating implements ViewAction {

    @Override
    public Matcher<View> getConstraints() {
        Matcher<View> isRatingBarConstraint = isAssignableFrom(RatingBar.class);
        return isRatingBarConstraint;
    }

    @Override
    public String getDescription() {
        return "Custom view action to set rating.";
    }

    @Override
    public void perform(UiController uiController, View view) {
        RatingBar ratingBar = (RatingBar) view;
        ratingBar.setRating(3);
    }
}
