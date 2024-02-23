package com.example.changebg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_control);

        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.ConstraintLayout2);

        Switch sw = (Switch) findViewById(R.id.switchBG);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    bg.setBackgroundResource(R.drawable.darkmode);
                    sw.setTextColor(Color.WHITE);
                } else {
                    bg.setBackgroundResource(R.drawable.lightmode);
                    sw.setTextColor(Color.BLACK);
                }
            }
        });
    }
}