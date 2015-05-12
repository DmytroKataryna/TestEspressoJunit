package com.example.dmytro.testespresso.custom;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.view.View;
import android.widget.RatingBar;


public class CheckRating implements ViewAssertion {

    @Override
    public void check(View view, NoMatchingViewException e) {
        RatingBar ratingBar = (RatingBar) view;

        ratingBar.getRating();
    }
}
