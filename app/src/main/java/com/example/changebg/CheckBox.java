package com.example.changebg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CheckBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroup1);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);

        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.ConstraintLayoutCheckBox);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton:
                        bg.setBackgroundResource(R.drawable.bg);
                        radioButton.setTextColor(Color.WHITE);
                        radioButton2.setTextColor(Color.WHITE);
                        radioButton3.setTextColor(Color.WHITE);
                        break;
                    case R.id.radioButton2:
                        bg.setBackgroundResource(R.drawable.bg1);
                        radioButton.setTextColor(Color.WHITE);
                        radioButton2.setTextColor(Color.WHITE);
                        radioButton3.setTextColor(Color.WHITE);

                        break;
                    case R.id.radioButton3:
                        bg.setBackgroundResource(R.drawable.bg2);
                        radioButton.setTextColor(Color.WHITE);
                        radioButton2.setTextColor(Color.WHITE);
                        radioButton3.setTextColor(Color.WHITE);

                        break;
                    case R.id.radioButton4:
                        bg.setBackgroundResource(R.drawable.bg3);
                        break;
                }
            }
        });
    }
}