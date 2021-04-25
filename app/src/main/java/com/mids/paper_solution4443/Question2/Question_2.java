package com.mids.paper_solution4443.Question2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mids.paper_solution4443.R;

public class Question_2 extends AppCompatActivity {
    public class MainActivity extends AppCompatActivity {
        private EditText edtNumber;
        private Button btnValidate;
        private TextView txtStatus;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_question_2);
            edtNumber = findViewById(R.id.edtNumber);
            btnValidate = findViewById(R.id.btnValidate);
            txtStatus = findViewById(R.id.txtStatus);
            btnValidate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (validateNumber()) {
                        txtStatus.setText("Status: Valid");
                    } else {
                        txtStatus.setText("Status: Invalid");
                    }
                }
            });
        }
        private boolean validateNumber() {
            String number = edtNumber.getText().toString();
            if (number.isEmpty()) {
                edtNumber.setError("Phone Number Required");
                return false;
            } else {
                if (number.length() < 12) {
                    edtNumber.setError("Full Phone Number Required");
                    return false;
                } else {
                    String areaCode = number.substring(0, 2);
                    if (areaCode.equals("92") || areaCode.equals("93") || areaCode.equals("94") || areaCode.equals("95")) {
                        String networkCode = number.substring(2, 5);
                        if (networkCode.equals("300") || networkCode.equals("301") || networkCode.equals("302") ||
                                networkCode.equals("303") || networkCode.equals("304") || networkCode.equals("305") ||
                                networkCode.equals("306") || networkCode.equals("307") || networkCode.equals("308") ||
                                networkCode.equals("309")) {
                            Toast.makeText(this, "Number : " + number, Toast.LENGTH_SHORT).show();
                            return true;
                        } else {
                            edtNumber.setError("Invalid Network Code");
                            return false;
                        }
                    } else {
                        edtNumber.setError("Invalid Area Code");
                        return false;
                    }
                }
            }
        }

}
}