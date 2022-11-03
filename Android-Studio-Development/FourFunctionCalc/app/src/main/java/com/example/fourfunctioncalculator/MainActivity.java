package com.example.fourfunctioncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //set global variables
    private EditText number1, number2;
    private Button addBTN, minusBTN, multBTN, divBTN;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link java objects to widgets
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        addBTN = findViewById(R.id.addBTN);
        minusBTN = findViewById(R.id.minusBTN);
        multBTN = findViewById(R.id.multBTN);
        divBTN = findViewById(R.id.divBTN);
        output = findViewById(R.id.output);

        //setOnClickListener
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1.getText()));
                //numberValue = convertToINt(ConvertToString(getTextFromEditable));
                int num2 = Integer.parseInt(String.valueOf(number2.getText()));
                int answer  = num1 + num2;
                output.setText(String.valueOf(answer));
            }
        });
        minusBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1.getText()));
                //numberValue = convertToINt(ConvertToString(getTextFromEditable));
                int num2 = Integer.parseInt(String.valueOf(number2.getText()));
                int answer  = num1 + num2;
                output.setText(String.valueOf(answer));
            }
        });
        multBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1.getText()));
                //numberValue = convertToINt(ConvertToString(getTextFromEditable));
                int num2 = Integer.parseInt(String.valueOf(number2.getText()));
                int answer  = num1 + num2;
                output.setText(String.valueOf(answer));
            }
        });
        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(String.valueOf(number1.getText()));
                //numberValue = convertToINt(ConvertToString(getTextFromEditable));
                int num2 = Integer.parseInt(String.valueOf(number2.getText()));
                int answer  = num1 + num2;
                output.setText(String.valueOf(answer));
            }
        });

    }
    //additional functions
    private int calc(String operator, int n1, int n2){
        if(operator.equals("+")){
            return n1+n1;
        }
        return 0;
    }

}