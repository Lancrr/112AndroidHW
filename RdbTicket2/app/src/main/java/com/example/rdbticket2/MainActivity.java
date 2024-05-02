package com.example.rdbticket2;
//A111222019

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtResult;
    EditText txtPiece;
    RadioGroup rgGender, rgType;
    String outputStr = "";
    RadioButton rdbBoy = (RadioButton) findViewById(R.id.rdbBoy);
    RadioButton rdbGirl = (RadioButton) findViewById(R.id.rdbGirl);
    RadioButton rdbAdult = (RadioButton) findViewById(R.id.rdbAdult);
    RadioButton rdbStudent = (RadioButton) findViewById(R.id.rdbStudent);
    RadioButton rdbChild = (RadioButton) findViewById(R.id.rdbChild);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtResult = findViewById(R.id.txtResult);
        txtPiece = findViewById(R.id.editTextNumber);

        // 找到 RadioGroup
        rgGender = findViewById(R.id.rgGender);
        rgType = findViewById(R.id.rgType);

        // 為 RadioGroup 設置監聽器
        rgGender.setOnCheckedChangeListener(radioGroupCheckedChangeListener);
        rgType.setOnCheckedChangeListener(radioGroupCheckedChangeListener);
        Button button = (Button) findViewById(R.id.button);
        Button btnCheck = (Button) findViewById(R.id.btnCheck);

        String outputStr = "";
        int price = 0;
        int outputPiece;

        outputPiece = Integer.parseInt(txtPiece.getText().toString());

        if (rdbBoy.isChecked() & rdbAdult.isChecked()) {

            price += 500;
        } else if (rdbBoy.isChecked() & rdbStudent.isChecked()) {

            price += 400;
        } else if (rdbBoy.isChecked() & rdbChild.isChecked()) {

            price += 250;
        } else if (rdbGirl.isChecked() & rdbAdult.isChecked()) {

            price += 500;
        } else if (rdbGirl.isChecked() & rdbStudent.isChecked()) {

            price += 400;
        } else if (rdbGirl.isChecked() & rdbChild.isChecked()) {

            price += 250;
        }

        outputStr += Integer.toString(outputPiece) + "張\n";
        outputStr += "金額 " + price * outputPiece + "元\n";
        txtResult.setText(outputStr);
//        btnCheck.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    RadioGroup.OnCheckedChangeListener radioGroupCheckedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {



            if (rgGender.getCheckedRadioButtonId() != -1 && rgType.getCheckedRadioButtonId() != -1) {
                RadioButton genderButton = findViewById(rgGender.getCheckedRadioButtonId());
                RadioButton typeButton = findViewById(rgType.getCheckedRadioButtonId());

                if (genderButton.getText().toString().equals(getResources().getString(R.string.male))) {
                    outputStr += getResources().getString(R.string.male) + "\n";
                } else {
                    outputStr += getResources().getString(R.string.female) + "\n";
                }

                outputStr += typeButton.getText().toString() + "\n";


            }
        }




    };
    public void btnCheck_Click(View v){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("result", outputStr);
        startActivity(intent);
    }
}
