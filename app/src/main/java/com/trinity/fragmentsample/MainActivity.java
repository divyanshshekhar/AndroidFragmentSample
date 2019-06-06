package com.trinity.fragmentsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        Fragment1.OnFragmentInteractionListener,
        Fragment2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handle next button click event in Fragment 1.
     */
    public void onNextButtonClick() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, Fragment2.newInstance());
    }

    /**
     * Handle previous button click event in Fragment 2.
     */
    public void onPrevButtonClick() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, Fragment1.newInstance());
    }
}
