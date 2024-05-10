package com.example.foodimgmenu;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends AppCompatActivity implements OnCheckedChangeListener{


    private CheckBox chkburger=(CheckBox) findViewById(R.id.chkburger);
    private CheckBox chkfrenchfry=(CheckBox) findViewById(R.id.chkfrenchfry);
    private CheckBox chkcola=(CheckBox) findViewById(R.id.chkcola);
    private CheckBox chksoup=(CheckBox) findViewById(R.id.chksoup);
    private ImageView imgburger, imgfrenchfry, imgcola, imgsoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgburger=(ImageView) findViewById(R.id.imgburger);
        imgfrenchfry=(ImageView) findViewById(R.id.imgfrenchfry);
        imgcola=(ImageView) findViewById(R.id.imgcola);
        imgsoup=(ImageView) findViewById(R.id.imgsoup);
        chkburger.setOnCheckedChangeListener(this);
        chkfrenchfry.setOnCheckedChangeListener(this);
        chkcola.setOnCheckedChangeListener(this);
        chksoup.setOnCheckedChangeListener(this);




    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        // TODO Auto-generated method stub
        if(chkburger.isChecked()) {
            imgburger.setVisibility(ImageView.VISIBLE);
        }else if(chkfrenchfry.isChecked()) {
            imgfrenchfry.setVisibility(ImageView.VISIBLE);
        }else if(chkcola.isChecked()) {
            imgcola.setVisibility(ImageView.VISIBLE);
        }else if(chksoup.isChecked()) {

            imgsoup.setVisibility(ImageView.VISIBLE);
        }


    }
}