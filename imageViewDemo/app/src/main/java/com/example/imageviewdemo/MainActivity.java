package com.example.imageviewdemo;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
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



        chkburger.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgburger.setVisibility(ImageView.VISIBLE);
                    imgfrenchfry.setVisibility(ImageView.GONE);
                    imgcola.setVisibility(ImageView.GONE);
                    imgsoup.setVisibility(ImageView.GONE);
                }else{
                    imgburger.setVisibility(ImageView.GONE);

                }
            }
        });
        chkfrenchfry.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgburger.setVisibility(ImageView.GONE);
                    imgfrenchfry.setVisibility(ImageView.VISIBLE);
                    imgcola.setVisibility(ImageView.GONE);
                    imgsoup.setVisibility(ImageView.GONE);
                }
                else {
                    imgfrenchfry.setVisibility(ImageView.GONE);

                }
            }
        });
        chkcola.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgburger.setVisibility(ImageView.GONE);
                    imgfrenchfry.setVisibility(ImageView.GONE);
                    imgcola.setVisibility(ImageView.VISIBLE);
                    imgsoup.setVisibility(ImageView.GONE);
                }else{
                    imgcola.setVisibility(ImageView.GONE);

                }
            }
        });
        chksoup.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgburger.setVisibility(ImageView.GONE);
                    imgfrenchfry.setVisibility(ImageView.GONE);
                    imgcola.setVisibility(ImageView.GONE);
                    imgsoup.setVisibility(ImageView.VISIBLE);
                }else{
                    imgsoup.setVisibility(ImageView.GONE);

                }
            }
        });


    }


}