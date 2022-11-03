package com.example.scifiname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //First Thing: Create global variables for widget
    EditText firstNameTXT, lastNameTXT, cityTXT, schoolTXT, broTXT, sisTXT;
    Button generatorBTN;
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Second Thing: Connect global variables to widget
        firstNameTXT = findViewById(R.id.firstTXT);
        lastNameTXT = findViewById(R.id.lastTXT);
        cityTXT = findViewById(R.id.cityTXT);
        schoolTXT = findViewById(R.id.schoolTXT);
        broTXT = findViewById(R.id.broTXT);
        sisTXT = findViewById(R.id.sisTXT);
        output = findViewById(R.id.output);
        generatorBTN = findViewById(R.id.generator);

        generatorBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });
    }

    private void generate(){
        String first = String.valueOf(firstNameTXT.getText());
        String last = String.valueOf(lastNameTXT.getText());
        String city = String.valueOf(cityTXT.getText());
        String school = String.valueOf(schoolTXT.getText());
        String brother = String.valueOf(broTXT.getText());
        String sister = String.valueOf(sisTXT.getText());

        //generate the bounds for each portion of the variable
        Random rand = new Random();
        int rF = rand.nextInt(first.length());
        int rL = rand.nextInt(last.length());
        int rC = rand.nextInt(city.length());
        int rS = rand.nextInt(school.length());
        int rB = rand.nextInt(brother.length());
        int rSi = rand.nextInt(sister.length());


        String newfirst = first.substring(0,rF)+last.substring(rL);
        String newlast = city.substring(0,rC)+school.substring(rS);
        String newhome = brother.substring(0,rB)+sister.substring(rSi);


        output.setText(String.format("Welcome! %s %s from %s",newfirst,newlast,newhome));


    }
}