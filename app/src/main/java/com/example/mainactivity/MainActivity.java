package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView textView;
    private Button plusz;
    private Button minusz;
    private Color color;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        plusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textView.setText(String.valueOf(counter));
            }
        });
        minusz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                textView.setText(String.valueOf(counter));
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.valueOf(counter=0));
            }
        });
        if(counter>0){
            textView.setTextColor(Color.GREEN);
        }
        if(counter<0){
            textView.setTextColor(Color.RED);
        }
    }

    private void init(){
        layout=findViewById(R.id.layout);
        textView=findViewById(R.id.textView);
        plusz=findViewById(R.id.plusz);
        minusz=findViewById(R.id.minusz);
    }
}