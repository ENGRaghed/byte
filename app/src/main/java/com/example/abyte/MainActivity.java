package com.example.abyte;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    Switch sw2, sw3, sw4, sw5, sw6, sw7, sw8;
    TextView textView;
    EditText targetNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Switch sw1 = (Switch) findViewById(R.id.switch1);
        sw2 = findViewById(R.id.switch2);
        sw3 = findViewById(R.id.switch3);
        sw4 = findViewById(R.id.switch4);
        sw5 = findViewById(R.id.switch5);
        sw6 = findViewById(R.id.switch6);
        sw7 = findViewById(R.id.switch7);
        sw8 = findViewById(R.id.switch8);

        targetNum = findViewById(R.id.Number);


        textView = findViewById(R.id.text1);





        //int num=targetNum.getInputType();


        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(1, isChecked);

            }
        });

        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(2, isChecked);
            }
        });

        sw3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(4, isChecked);
            }
        });

        sw4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(8, isChecked);
            }
        });

        sw5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(16, isChecked);
            }
        });

        sw6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(32, isChecked);
            }
        });

        sw7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(64, isChecked);
            }
        });

        sw8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                sw(128, isChecked);
            }
        });



    }

    void sw(int y, boolean isChecked) {
            if (isChecked) {
                x = x + y;
                textView.setText(x + "");
            } else {
                x = x - y;
                textView.setText(x + "");
            }

        int value=0;
        String temp=targetNum. getText(). toString();

        if (!"".equals(temp)){
            value=Integer.parseInt(temp);
            if (value==x){
                textView.setText("good "+x+"");
                textView.setBackgroundColor(Color.parseColor("#FF8BC34A"));
            }else {
                textView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }




    }
}
