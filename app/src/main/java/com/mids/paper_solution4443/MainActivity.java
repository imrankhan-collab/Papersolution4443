package com.mids.paper_solution4443;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

import com.mids.paper_solution4443.Question1.Question_1;
import com.mids.paper_solution4443.Question10.Question_10;
import com.mids.paper_solution4443.Question2.Question_2;
import com.mids.paper_solution4443.Question3.Question_3;
import com.mids.paper_solution4443.Question4.Question_4;
import com.mids.paper_solution4443.Question5.Question_5;
import com.mids.paper_solution4443.Question6.Question_6;
import com.mids.paper_solution4443.Question7.Question_7;
import com.mids.paper_solution4443.Question8.Question_8;
import com.mids.paper_solution4443.Question9.Question_9;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




        private Button q_1, q_2, q_3, q_4, q_5, q_6, q_7, q_8, q_9, q_10;
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q_1 = findViewById(R.id.q_1);
        q_2 = findViewById(R.id.q_2);
        q_3 = findViewById(R.id.q_3);
        q_4 = findViewById(R.id.q_4);
        q_5 = findViewById(R.id.q_5);
        q_6 = findViewById(R.id.q_6);
        q_7 = findViewById(R.id.q_7);
        q_8 = findViewById(R.id.q_8);
        q_9 = findViewById(R.id.q_9);
        q_10 = findViewById(R.id.q_10);

        q_1.setOnClickListener(this);
        q_2.setOnClickListener(this);
        q_3.setOnClickListener(this);
        q_4.setOnClickListener(this);
        q_5.setOnClickListener(this);
        q_7.setOnClickListener(this);
        q_8.setOnClickListener(this);
        q_9.setOnClickListener(this);
        q_10.setOnClickListener(this);


    }

        @Override
        public void onClick (View v){
        switch (v.getId()) {
            case R.id.q_1:
                startActivity(new Intent(MainActivity.this, Question_1.class));
                break;
            case R.id.q_2:
                startActivity(new Intent(MainActivity.this, Question_2.class));
                break;
            case R.id.q_3:
                startActivity(new Intent(MainActivity.this, Question_3.class));
                break;
            case R.id.q_4:
                startActivity(new Intent(MainActivity.this, Question_4.class));
                break;
            case R.id.q_5:
                startActivity(new Intent(MainActivity.this, Question_5.class));
                break;
            case R.id.q_6:
                startActivity(new Intent(MainActivity.this, Question_6.class));
                break;
            case R.id.q_7:
                startActivity(new Intent(MainActivity.this, Question_7.class));
                break;
            case R.id.q_8:
                startActivity(new Intent(MainActivity.this, Question_8.class));
                break;
            case R.id.q_9:
                startActivity(new Intent(MainActivity.this, Question_9.class));
                break;
            case R.id.q_10:
                startActivity(new Intent(MainActivity.this, Question_10.class));
                break;

        }
    }
    }


