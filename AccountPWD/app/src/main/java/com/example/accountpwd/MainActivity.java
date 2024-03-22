package com.example.accountpwd;

import android.os.Bundle;
import android.view.View;
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void button_Click(View view){
        String correctuser = "A111222019";
        String username;
        String correctPWD = "1234qwer";
        String password;
        TextView account = (TextView) findViewById(R.id.lblAccount);
        username = account.getText().toString();
        TextView PWD = (TextView) findViewById(R.id.lblPassword);
        password = PWD.getText().toString();
        TextView output = (TextView) findViewById(R.id.lblOutput);
        if (username.equals(correctuser) &&password.equals(correctPWD)){
            output.setText("成功登入");
        } else if ((!username.equals(correctuser)) && password.equals(correctPWD)) {
            output.setText("帳號錯誤");
        } else if (username.equals(correctuser) &&(!password.equals(correctPWD))) {
            output.setText("密碼錯誤");
        } else{
            output.setText("帳號和密碼錯誤");
        }

    }
}