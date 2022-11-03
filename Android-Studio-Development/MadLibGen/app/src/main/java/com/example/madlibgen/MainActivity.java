package com.example.madlibgen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

//Some resources used for both xml, java files
//https://stackoverflow.com/questions/11166238/is-there-a-way-to-fill-parent-minus-a-fixed-number-in-android-relativelayout


public class MainActivity extends AppCompatActivity {
    //Variables are named same as buttons. Most likely a bad idea.
    EditText input1,input2,input3,input4,input5,input6,input7,input8;
    Button madlib1,madlib2,madlib3,random,back,enter;
    TextView output,title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById((R.id.input1));
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        input4 = findViewById(R.id.input4);
        input5 = findViewById(R.id.input5);
        input6 = findViewById(R.id.input6);
        input7 = findViewById(R.id.input7);
        input8 = findViewById(R.id.input8);

        madlib1 = findViewById(R.id.madlib1BTN);
        madlib2 = findViewById(R.id.madlib2BTN);
        madlib3 = findViewById(R.id.madlib3BTN);

        enter = findViewById(R.id.enterBTN);
        back = findViewById((R.id.backBTN));
        random = findViewById((R.id.randomBTN));
        output = findViewById(R.id.outputText);
        title = findViewById(R.id.titleLBL);


        input1.setVisibility(View.INVISIBLE);
        input2.setVisibility(View.INVISIBLE);
        input3.setVisibility(View.INVISIBLE);
        input4.setVisibility(View.INVISIBLE);
        input5.setVisibility(View.INVISIBLE);
        input6.setVisibility(View.INVISIBLE);
        input7.setVisibility(View.INVISIBLE);
        input8.setVisibility(View.INVISIBLE);

        enter.setVisibility(View.INVISIBLE);
        back.setVisibility(View.INVISIBLE);
        output.setVisibility(View.INVISIBLE);

        getSupportActionBar().setTitle("Hello Mad libs");


        madlib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i= new Intent(MainActivity.this,activity_madlib1.class);
                startActivity(i);
            }
        });

        madlib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,activity_madlib2.class);
                startActivity(i);
            }
        });

        madlib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportActionBar().setTitle("MadLib 3");
                madlib1.setVisibility(View.INVISIBLE);
                madlib2.setVisibility(View.INVISIBLE);
                madlib3.setVisibility(View.INVISIBLE);
                random.setVisibility(View.INVISIBLE);

                input1.setVisibility(View.VISIBLE);
                input2.setVisibility(View.VISIBLE);
                input3.setVisibility(View.VISIBLE);
                input4.setVisibility(View.VISIBLE);
                input5.setVisibility(View.VISIBLE);
                input6.setVisibility(View.VISIBLE);
                input7.setVisibility(View.VISIBLE);
                input8.setVisibility(View.VISIBLE);

                enter.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                output.setVisibility(View.VISIBLE);

                title.setVisibility(View.INVISIBLE);

                enter.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {generate();}
                });

            }
        });

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int ranNum = rand.nextInt(3);
                if (ranNum == 1){
                    Intent i= new Intent(MainActivity.this,activity_madlib1.class);
                    startActivity(i);
                }
                else if(ranNum == 2){
                    Intent i= new Intent(MainActivity.this,activity_madlib2.class);
                    startActivity(i);
                }
                else if(ranNum ==3){
                    getSupportActionBar().setTitle("Hello Mad libs");
                    madlib1.setVisibility(View.INVISIBLE);
                    madlib2.setVisibility(View.INVISIBLE);
                    madlib3.setVisibility(View.INVISIBLE);
                    random.setVisibility(View.INVISIBLE);

                    input1.setVisibility(View.VISIBLE);
                    input2.setVisibility(View.VISIBLE);
                    input3.setVisibility(View.VISIBLE);
                    input4.setVisibility(View.VISIBLE);
                    input5.setVisibility(View.VISIBLE);
                    input6.setVisibility(View.VISIBLE);
                    input7.setVisibility(View.VISIBLE);
                    input8.setVisibility(View.VISIBLE);

                    enter.setVisibility(View.VISIBLE);
                    back.setVisibility(View.VISIBLE);
                    output.setVisibility(View.VISIBLE);

                    title.setVisibility(View.INVISIBLE);
                }

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportActionBar().setTitle("Hello Mad libs");
                madlib1.setVisibility(View.VISIBLE);
                madlib2.setVisibility(View.VISIBLE);
                madlib3.setVisibility(View.VISIBLE);
                random.setVisibility(View.VISIBLE);

                input1.setVisibility(View.INVISIBLE);
                input2.setVisibility(View.INVISIBLE);
                input3.setVisibility(View.INVISIBLE);
                input4.setVisibility(View.INVISIBLE);
                input5.setVisibility(View.INVISIBLE);
                input6.setVisibility(View.INVISIBLE);
                input7.setVisibility(View.INVISIBLE);
                input8.setVisibility(View.INVISIBLE);

                enter.setVisibility(View.INVISIBLE);
                back.setVisibility(View.INVISIBLE);
                output.setVisibility(View.INVISIBLE);

                title.setVisibility(View.VISIBLE);

            }
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

        output.setText(String.format("A long time ago there lived a wicked "+word1+"\n"+
                "Who ate "+word2+"for dinner\n"+
                "Slept for "+word3+" Hours"+"\n"+
                "Hobby was "+word4+"\n"+
                "Enjoyed to "+word5+"\n"+
                "One day "+word1+" decided to "+word6+"\n"+
                "Eventually lead to a  "+word7+"\n"+
                "Lived a happy life "+word8));
    }

}