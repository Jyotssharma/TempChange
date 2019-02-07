package com.example.mani.tempchange;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText et;
    Button button;
    TextView tv;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("TextView " + et.getText());
                float temp=0,k=0;
                k=Integer.parseInt(String.valueOf(et.getText()));
                temp=(k*9/5)+32;
                tv.setText(temp+"fahrenheit");
            }
        });
    }




}


