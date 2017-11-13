package com.example.daniel.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView instruction;
    private EditText inputWords;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.instruction = (TextView) findViewById(R.id.instruction);
        this.inputWords = (EditText) findViewById(R.id.inputWords);

        Log.d(getClass().toString(), "OnCreate called");
    }
}
