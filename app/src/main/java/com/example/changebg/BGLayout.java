package com.example.changebg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class BGLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bglayout);

        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.ConstraintLayoutMain);

        Random background;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.bg);
        list.add(R.drawable.bg1);
        list.add(R.drawable.bg2);
        list.add(R.drawable.bg3);

        Random randomBG = new Random();
        int position = randomBG.nextInt(list.size());

        bg.setBackgroundResource(list.get(position));
    }
}