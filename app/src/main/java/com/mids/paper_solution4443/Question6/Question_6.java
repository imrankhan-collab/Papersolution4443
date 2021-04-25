package com.mids.paper_solution4443.Question6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import com.mids.paper_solution4443.R;

public class Question_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_6);
    }
    @Override
    public void onBackPressed() {
        showBackButtonDialog();
    }
    private void showBackButtonDialog() {
        MaterialAlertDialogBuilder backButtonDialog = new MaterialAlertDialogBuilder(Question_6.this);
        backButtonDialog.setTitle("Close Application");
        backButtonDialog.setMessage("Do You Really Want To Close This Activity?");
        backButtonDialog.setCancelable(false);
        backButtonDialog.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        backButtonDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        backButtonDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        backButtonDialog.create().show();
    }
}