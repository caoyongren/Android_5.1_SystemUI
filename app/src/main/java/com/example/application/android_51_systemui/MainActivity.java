package com.example.application.android_51_systemui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    private String[] mActivitys = new String[] {
            "Dark Mode", "Hide Navigation", "Fullscreen Mode",
            "Immersive Mode"
    };

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ListView listView = new ListView(this);
        mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, mActivitys);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(this);
        setContentView(listView);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(this, DarkActivity.class);
                break;
            case 1:
                intent = new Intent(this, HideActivity.class);
                break;
            case 2:
                intent = new Intent(this, FullActivity.class);
                break;
            case 3:
                intent = new Intent(this, ImmersiveActivity.class);
                break;
            default:
                return;
        }
        startActivity(intent);
    }
}
