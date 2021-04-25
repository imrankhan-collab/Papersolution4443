package com.mids.paper_solution4443.Question3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mids.paper_solution4443.R;

public class Question_3 extends AppCompatActivity {
    private Button btn_Change_Color, btn_Change_TypeFace;
    private TextView txtHelloWorld;
    private int[] colors = {
            R.color.purple_200,
            R.color.purple_500,
            R.color.purple_700,
            R.color.teal_200,
            R.color.teal_700,
            R.color.black
    };
    private int selectedColor = 0;
    private Typeface[] typefaces = {
            Typeface.SANS_SERIF,
            Typeface.MONOSPACE,
            Typeface.DEFAULT
    };
    private int selectedTypeFace = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_3);
        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        btn_Change_Color = findViewById(R.id.btnChangeColor);
        btn_Change_TypeFace = findViewById(R.id.btnChangeTypeFace);
        btn_Change_Color.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                changeColor();
            }
        });
        btn_Change_TypeFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTypeFace();
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void changeColor() {
        if (selectedColor != 6) {
            txtHelloWorld.setTextColor(getColor(colors[selectedColor]));
            selectedColor++;
        } else {
            selectedColor = 0;
        }
    }
    private void changeTypeFace() {
        if (selectedTypeFace != 3) {
            txtHelloWorld.setTypeface(typefaces[selectedTypeFace]);
            selectedTypeFace++;
        } else {
            selectedTypeFace = 0;
        }
    }
}