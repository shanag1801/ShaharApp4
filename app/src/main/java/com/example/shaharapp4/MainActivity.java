package com.example.shaharapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }
    @SuppressLint("SetTextI18n")
    public void go(View view){
        n++;
        btn.setText("This is a click number: " + n);
        if(n % 7 == 0 || n % 10 == 7)
            btn.setText("BOOM!");
    }
}