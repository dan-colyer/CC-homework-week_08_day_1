package com.example.daniel.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView instruction;
    private EditText inputWords;
    private Button submit_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.instruction = (TextView) findViewById(R.id.instruction);
        this.inputWords = (EditText) findViewById(R.id.inputWords);
        this.submit_button = (Button) findViewById(R.id.submit_button);

        Log.d(getClass().toString(), "OnCreate called");
    }

    public void onButtonClicked(View button) {
        String inputWords = this.inputWords.getText().toString();

        Wordcount wordcount = new Wordcount();

        Integer output = wordcount.wordcount(inputWords);

        this.instruction.setText(output.toString());
    }
