package com.example.changebg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;

public class BT02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt02);

        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.ConstraintLayoutBT02);

        SwitchCompat sw = (SwitchCompat) findViewById(R.id.switchBGBT02);

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