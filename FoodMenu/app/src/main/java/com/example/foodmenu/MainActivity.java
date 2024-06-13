package com.example.foodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkBurger, chkFrenchFry, chkCola, chkSoup, chkCoffee;
    private ImageView imgBurger, imgFrenchFry, imgCola, imgSoup, imgCoffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkBurger = findViewById(R.id.chkburger);
        chkFrenchFry = findViewById(R.id.chkfrenchfry);
        chkCola = findViewById(R.id.chkcola);
        chkSoup = findViewById(R.id.chksoup);
        chkCoffee = findViewById(R.id.chkcoffee);

        imgBurger = findViewById(R.id.imgburger);
        imgFrenchFry = findViewById(R.id.imgfrenchfry);
        imgCola = findViewById(R.id.imgcola);
        imgSoup = findViewById(R.id.imgsoup);
        imgCoffee = findViewById(R.id.imgcoffee);

        chkBurger.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imgBurger.setVisibility(View.VISIBLE);
            } else {
                imgBurger.setVisibility(View.GONE);
            }
        });

        chkFrenchFry.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imgFrenchFry.setVisibility(View.VISIBLE);
            } else {
                imgFrenchFry.setVisibility(View.GONE);
            }
        });

        chkCola.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imgCola.setVisibility(View.VISIBLE);
            } else {
                imgCola.setVisibility(View.GONE);
            }
        });

        chkSoup.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imgSoup.setVisibility(View.VISIBLE);
            } else {
                imgSoup.setVisibility(View.GONE);
            }
        });

        chkCoffee.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                imgCoffee.setVisibility(View.VISIBLE);
            } else {
                imgCoffee.setVisibility(View.GONE);
            }
        });
    }
}