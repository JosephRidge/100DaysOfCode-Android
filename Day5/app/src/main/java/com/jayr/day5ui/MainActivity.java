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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView personalizedGreetings;
    Button btnGreetings;

    EditText nameInput;
    EditText favFood;
    EditText favMovie;

    String name;
    String favoriteMeal;
    String favoriteMovie;
    String personalDetails,hobby;
    Integer id ;

    CheckBox repellantChoice;
    CheckBox umbrellaChoice;
    CheckBox machstickChoice;
    CheckBox machettechoice;
    CheckBox checkBox;

    RadioGroup radioGroup;
    RadioButton bookRadBtn;
    RadioButton musicRadBtn;
    RadioButton sportRadBtn;

    RelativeLayout relativeLayout;


//    @Override
//    public void onClick(View v) {
//        switch(v.getId()){
//            case  R.id.btnSave:
//                personalizedGreetings.setText(nameInput.getText().toString());
//                Toast.makeText(this, "My Details : "+personalDetails, Toast.LENGTH_SHORT).show();
//              /*  Toast.makeText(this, "Hello  "+nameInput.getText().toString()+" !! ."+"\n"+"Favorite Meal : "+
//                        favFood.getText().toString()+"\n Favorite Movie: "+
//                        favMovie.getText().toString(), Toast.LENGTH_SHORT).show();*/
//                SystemClock.sleep(100);
//                //Toast.makeText(this, "Survival Gear : /n"+survivaltools, Toast.LENGTH_SHORT).show();
//                SystemClock.sleep(100);
//
//                break;
//            default:
//                break;
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personalDetails="";
        hobby="";
        id = 0;

        personalizedGreetings = findViewById(R.id.UserDetails);
        btnGreetings = findViewById(R.id.btnSave);
//        INPUTS
        nameInput = findViewById(R.id.userName);
        favFood = findViewById(R.id.favFood);
        favMovie = findViewById(R.id.favMovie);
//       CHOICES
        radioGroup = findViewById(R.id.choiceHobbyRadiobtn);

        name = nameInput.getText().toString();
        favoriteMeal = favFood.getText().toString();
        favoriteMovie = favMovie.getText().toString();

        umbrellaChoice = findViewById(R.id.optionUmbrella);
        machstickChoice = findViewById(R.id.optionMachSticks);
        machettechoice = findViewById(R.id.optionMachette);
        repellantChoice = findViewById(R.id.optionRepellant);

        relativeLayout =findViewById(R.id.checkList);

        btnGreetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                personalDetails +=("\n\nName: " + nameInput.getText().toString());
                personalDetails +=("\nHobby: " + userHobby());
                personalDetails+=("\nFavorite Meal : " + favFood.getText().toString());
                personalDetails+=("\nFavorite Movie :" + favMovie.getText().toString());
                personalDetails+=("\nMy Survival Kit : "
                        + checkBox(umbrellaChoice)+","
                        + checkBox(umbrellaChoice)+","
                        +checkBox(umbrellaChoice));
                System.out.println("\nPersonal Details : " + personalDetails);
                Toast.makeText(MainActivity.this, "My Details : " + personalDetails, Toast.LENGTH_LONG).show();
            }
        });


/*
        survivaltools = new ArrayList<>();

        if (umbrellaChoice.isChecked()) {
            umbrellaChoice.getId();

        }
        else if(machstickChoice.isChecked()){
            survivaltools.add("MatchBox");
        }
        else if (machettechoice.isChecked()) {
            survivaltools.add("Machette and FirstAid Kit");
        }
        else if(repellantChoice.isChecked()){
            survivaltools.add(" Mosquito Repellent");
        }
*/

    }

    private String userHobby() {
        int radioChoice =  radioGroup.getCheckedRadioButtonId();
        switch(radioChoice) {
            case R.id.choiceBook:
                hobby ="Book";
            case R.id.choiceMusic:
                hobby ="Music";
                break;
            case R.id.choiceSports:
                hobby ="Sports";
            default:
                hobby = "None";
                break;
        }
        return hobby;
    }

    public String checkBox(CheckBox checkBoxElement){
        String checked;
        checked = "";
        // Check which checkbox was clicked
        switch(checkBoxElement.getId()) {
            case R.id.optionMachette:
                if (checkBoxElement.isChecked()){
                    checked+="Machette n FirstAidkit :";
                }
            else
              ;
            case R.id.optionUmbrella:
                if (checkBoxElement.isChecked()){
                    checked+="Umbrella ;";
                }

            case R.id.optionRepellant:
                if (checkBoxElement.isChecked()){
                    checked+="Mosquito Repellant ;";
                }

            case R.id.optionMachSticks:
                if (checkBoxElement.isChecked()){
                    checked+="MatchSticks";
                }
            else
                break;
        }

        return checked;
    }



}