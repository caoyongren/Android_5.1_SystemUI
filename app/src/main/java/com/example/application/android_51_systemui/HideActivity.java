package com.example.application.android_51_systemui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleClick(View view) {
        view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}
