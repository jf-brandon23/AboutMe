package com.example.madlibgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_madlib2 extends AppCompatActivity {

    EditText input1,input2,input3,input4,input5,input6,input7,input8;
    Button back,enter;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib2);

        input1 = findViewById((R.id.input1));
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);

        enter = findViewById(R.id.enterBTN);
        back = findViewById((R.id.backBTN));
        output = findViewById(R.id.outputText);

        getSupportActionBar().setTitle("Hello Mad libs");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(activity_madlib2.this,MainActivity.class);
                startActivity(i);
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {generate();}
        });
    }

    private void generate(){
        String word1 = String.valueOf(input1.getText());
        String word2 = String.valueOf(input2.getText());
        String word3 = String.valueOf(input3.getText());
        String word4 = String.valueOf(input4.getText());
        String word5 = String.valueOf(input5.getText());
        String word6 = String.valueOf(input6.getText());
        String word7 = String.valueOf(input7.getText());
        String word8 = String.valueOf(input8.getText());

        output.setText(String.format("On the spaceship S.S "+word1+
                "sailed into the galaxy "+word2+"."+
                "To find "+word3+" to boost the family business of "+word4+"."+
                "Along on the mission were the heros "+word5+","+word6+" and "+word7+"."+
                "Soon they laned on the planet "+word8+"stepping off into an adventure."));
    }
}