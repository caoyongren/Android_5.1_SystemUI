package com.example.application.android_51_systemui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/*
 * Open Dark mode;
 * */

public class DarkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dark);
    }

    public void onToggleClick(View view) {
        int currentVisible = view.getSystemUiVisibility();
        int newVisible;
        if ((currentVisible & View.SYSTEM_UI_FLAG_LOW_PROFILE)
                == View.SYSTEM_UI_FLAG_LOW_PROFILE) {
            newVisible = View.SYSTEM_UI_FLAG_VISIBLE;
        } else {
            newVisible = View.SYSTEM_UI_FLAG_LOW_PROFILE;
        }
        view.setSystemUiVisibility(newVisible);
    }
}
