package com.jayr.day5ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView personalizedGreetings;
    Button btnGreetings;

    EditText nameInput;
    EditText favFood;
    EditText favMovie;

    String name;
    String favoriteMeal;
    String favoriteMovie;
    String radioChoice;
    ArrayList <String>survivaltools;

    CheckBox repellantChoice;
    CheckBox umbrellaChoice;
    CheckBox machstickChoice;
    CheckBox machettechoice;

    RadioGroup radioGroup;
    RadioButton bookRadBtn;
    RadioButton musicRadBtn;
    RadioButton sportRadBtn;


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.btnSave:
                personalizedGreetings.setText(nameInput.getText().toString());
                Toast.makeText(this, "Hello  "+nameInput.getText().toString()+" !! ."+"\n"+"Favorite Meal : "+
                        favFood.getText().toString()+"\n Favorite Movie: "+
                        favMovie.getText().toString(), Toast.LENGTH_SHORT).show();
                SystemClock.sleep(100);
                Toast.makeText(this, "Survival Gear : /n"+survivaltools, Toast.LENGTH_SHORT).show();
                SystemClock.sleep(100);

                break;
            default:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personalizedGreetings =findViewById(R.id.UserDetails);
        btnGreetings = findViewById(R.id.btnSave);
//        INPUTS
        nameInput = findViewById(R.id.userName);
        favFood = findViewById(R.id.favFood);
        favMovie = findViewById(R.id.favMovie);
//       CHOICES
        radioGroup = findViewById(R.id.choiceHobbyRadiobtn);
        btnGreetings.setOnClickListener(this);

        name = nameInput.getText().toString();
        favoriteMeal = favFood.getText().toString();
        favoriteMovie = favMovie.getText().toString();

//        radioChoiceID = radioGroup.getCheckedRadioButtonId();

   /*     switch (radioChoiceID){
            case R.id.choiceBook:
                radioChoice = "Book";
                break;
            case R.id.choiceSports:
                radioChoice = "Sports";
                break;
            case R.id.choiceMusic:
                radioChoice = "Music";
                break;
            default:
                break;
        }*/

        umbrellaChoice = findViewById(R.id.optionUmbrella);
        machstickChoice = findViewById(R.id.optionMachSticks);
        machettechoice = findViewById(R.id.optionMachette);
        repellantChoice = findViewById(R.id.optionRepellant);
        survivaltools = new ArrayList<>();


        if (umbrellaChoice.isChecked()) {
            survivaltools.add("Umbrella");

        }
        else if(machstickChoice.isChecked()){
            survivaltools.add("MatchBox");

        }
        else if (machettechoice.isChecked()) {
            survivaltools.add("Machette and FirstAid Kit");

        }
        else if(repellantChoice.isChecked()){
            survivaltools.add(" Mosquito Repellant");
        }



    }
    public void getSurvivalPackage(ArrayList<String> survivalList){
        for (String n :survivalList) {
            System.out.println(n);
        }

    }



}