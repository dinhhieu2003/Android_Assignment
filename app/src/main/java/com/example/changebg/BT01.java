package com.example.changebg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class BT01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt01);

        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.ConstraintLayoutBT01);

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