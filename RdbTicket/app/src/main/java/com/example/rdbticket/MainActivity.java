package com.example.rdbticket;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String outputStr = "";
                int price = 0;
                int outputPiece;
                RadioButton rdbBoy = (RadioButton) findViewById(R.id.rdbBoy);
                RadioButton rdbGirl = (RadioButton) findViewById(R.id.rdbGirl);
                RadioButton rdbAdult = (RadioButton) findViewById(R.id.rdbAdult);
                RadioButton rdbStudent = (RadioButton) findViewById(R.id.rdbStudent);
                RadioButton rdbChild = (RadioButton) findViewById(R.id.rdbChild);
                TextView txtResult = (TextView) findViewById(R.id.txtResult);
                EditText txtPiece = (EditText) findViewById(R.id.editTextNumber);
                outputPiece = Integer.parseInt(txtPiece.getText().toString());

                if (rdbBoy.isChecked() & rdbAdult.isChecked()){
                    outputStr += getResources().getString(R.string.male)+"\n";
                    outputStr += getResources().getString(R.string.regularticket);
                    price += 500;
                }
                else if (rdbBoy.isChecked() & rdbStudent.isChecked()){
                    outputStr += getResources().getString(R.string.male)+"\n";
                    outputStr += getResources().getString(R.string.studentticket);
                    price += 400;
                }
                else if (rdbBoy.isChecked() & rdbChild.isChecked()){
                    outputStr += getResources().getString(R.string.male)+"\n";
                    outputStr += getResources().getString(R.string.childticket);
                    price += 250;
                }
                else if (rdbGirl.isChecked() & rdbAdult.isChecked()){
                    outputStr += getResources().getString(R.string.female)+"\n";
                    outputStr += getResources().getString(R.string.regularticket);
                    price += 500;
                }
                else if (rdbGirl.isChecked() & rdbStudent.isChecked()){
                    outputStr += getResources().getString(R.string.female)+"\n";
                    outputStr += getResources().getString(R.string.studentticket);
                    price += 400;
                }
                else if (rdbGirl.isChecked() & rdbChild.isChecked()){
                    outputStr += getResources().getString(R.string.female)+"\n";
                    outputStr += getResources().getString(R.string.childticket);
                    price += 250;
                }

                outputStr += Integer.toString(outputPiece) + "張\n";
                outputStr += "金額 " + price * outputPiece + "元";
                txtResult.setText(outputStr);
                /*Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity3.class);
                Bundle bundle = new Bundle();
                bundle.putString("textview",txtResult.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);*/
            }
        });

    }
}