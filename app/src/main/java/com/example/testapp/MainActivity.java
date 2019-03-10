package com.example.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonMore;
    private Button buttonLess;
    private TextView textView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMore = findViewById(R.id.btnMore);
        buttonLess = findViewById(R.id.btnLess);
        textView = findViewById(R.id.text);

//        buttonMore.setOnClickListener(this);
//        buttonLess.setOnClickListener(this);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textView.setText(String.valueOf(++counter));
//            }
//        });
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btnMore:
//                textView.setText(String.valueOf(++counter));
//                break;
//            case R.id.btnLess:
//                textView.setText(String.valueOf(--counter));
//                break;
//        }
//    }

    public void more(View v){
        textView.setText(String.valueOf(++counter));
    }

    public void less(View v){
        textView.setText(String.valueOf(--counter));
    }
}
