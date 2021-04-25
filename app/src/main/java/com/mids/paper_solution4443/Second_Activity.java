package com.mids.paper_solution4443;
import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Second_Activity extends AppCompatActivity {
    private String selected_course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        selected_course = getIntent().getExtras().getString("SELECTED_COURSE");
        getSupportActionBar().setTitle(selected_course);
    }




}
