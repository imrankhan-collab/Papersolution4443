package com.mids.paper_solution4443.Question1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import com.mids.paper_solution4443.R;
import com.mids.paper_solution4443.Second_Activity;

public class Question_1 extends AppCompatActivity {
    private Button menu_btn;
    private String[] courses = {
            "Java",
            "Python",
            "Android",
            "Angular JS"
    };
    private int selectedCourse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_1);
        menu_btn = findViewById(R.id.show_menu);
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu();
            }
        });
    }


    private void showMenu() {
        MaterialAlertDialogBuilder dialogMenu = new MaterialAlertDialogBuilder(Question_1.this);
        dialogMenu.setTitle("Select Your Course");
        dialogMenu.setCancelable(false);
        dialogMenu.setSingleChoiceItems(courses, selectedCourse, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selectedCourse = which;
            }
        });
        dialogMenu.setNeutralButton("Get Course", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selected_course = courses[selectedCourse];
                Intent intent=new Intent(Question_1.this,Second_Activity.class);
                intent.putExtra("SELECTED_COURSE",selected_course);
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialogMenu.create().show();
    }
}