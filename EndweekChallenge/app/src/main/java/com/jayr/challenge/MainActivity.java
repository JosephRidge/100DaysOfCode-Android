package com.jayr.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Snackbar snackbar;
    private String passEntry ;

    private EditText email;
    private EditText password;
    private EditText passEnrty2;
    private EditText name;
    private String stringEmail;
    private String stringPass;
    private  String stringName;
    private String stringPass2;
    private  RadioButton radioMale,radioFemale,radioOther;
    private RadioGroup radioGroup;
    private Button imageChange,btnRegister;
    private CheckBox checkBox;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> continents = new ArrayList<>();
        spinner = findViewById(R.id.continentSpinner);
        name= findViewById(R.id.userName);
        email = findViewById(R.id.userEmail);
        password = findViewById(R.id.userPassword);
        passEnrty2 = findViewById(R.id.passwordVerification);
        radioFemale = findViewById(R.id.radioBtnFemale);
        radioMale = findViewById(R.id.radioBtnMale);
        radioOther = findViewById(R.id.radioBtnOther);
        radioGroup =findViewById(R.id.radioGroup);
        imageChange = findViewById(R.id.pickImageBtn);
        btnRegister = findViewById(R.id.btnRegister);
        relativeLayout = findViewById(R.id.parent);
        checkBox = findViewById(R.id.userAgree);
        Context context;


        continents.add("Africa");
        continents.add("Antarctica");
        continents.add("Asia");
        continents.add("Australia");
        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(
                this,
                R.layout.continents_list,
                continents);

        spinner.setAdapter(arrayAdapter);

        stringName = name.getText().toString().trim();
        stringEmail = email.getText().toString().trim();
        stringPass = password.getText().toString().trim();
        stringPass2 = passEnrty2.getText().toString().trim();

            /*     SPINNER     */
        spinnerItemSelection(spinner);
          /*  VALIDATION     */
        inputValidation(stringName,stringEmail,stringPass,stringPass2,name,email,password);
         /*   RADIO BUTTON    */
       radioButtonSelected(radioGroup);


// TODO : work on the POJO and Logic of getting user input selecting items in spinner and buttons(normal and radio)
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkEntry() == 4){
                    if (checkBox.isChecked()) {
                        checkBoxSelection(checkBox);
                        snackbar.make(relativeLayout, "Welcome  to the Tribe :\n " + stringName, snackbar.LENGTH_INDEFINITE)
                                .setAction("Tap Me", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Toast.makeText(MainActivity.this, "Thank you !", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setActionTextColor(getResources().getColor(R.color.purple_700))
                                .setBackgroundTint(getResources().getColor(R.color.teal_700))
                                .show();
                    } else {
                        Toast.makeText(MainActivity.this, "Please Check the box first inorder to be registered", Toast.LENGTH_SHORT).show();
                    }
            }else{
                    Toast.makeText(MainActivity.this, "Kindly check your inputs ", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    
    public void inputValidation(String stringName,String stringEmail,String stringPass,String stringPass2, EditText name,EditText email, EditText password){
        if (stringName.isEmpty()) {
            name.setError(" Kindly input your name !!");

            return;
        }
        if (stringEmail.isEmpty()) {
            email.setError("Kindly input your Email !!");
            email.requestFocus();
            return;
        }
        if (stringPass.isEmpty()) {
            password.setError(" Kindly input your password!!");
            password.requestFocus();
            return;
        }


    }
    public int checkEntry(){
        int i  = 0;

        if (!Patterns.EMAIL_ADDRESS.matcher(stringEmail).matches()) {
            email.setError("Kindly input your correct email!!");
        }else{
            i++;
        }
        if (stringPass.isEmpty()) {
            password.setError("You need me for security !!");
            password.requestFocus();

        }else{
            i++;
        }
        if (stringPass.length() < 8) {
            password.setError("Minimun legnth is 8");
            password.requestFocus();
        } else{
            i++;
        }
        if(!stringPass.equals(stringPass2)){
            Toast.makeText(this, "Passwords not matching . . ", Toast.LENGTH_SHORT).show();
        }else{
            i++;
        }
        return i;
    }

    public void radioButtonSelected(RadioGroup radioGroup){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radioBtnMale:
                            Toast.makeText(MainActivity.this, "Male Checked!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBtnFemale:
                            Toast.makeText(MainActivity.this, "Female Checked!", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioBtnOther:
                            Toast.makeText(MainActivity.this, "Other Checked!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void checkBoxSelection(CheckBox checkBox)
    {
        if (checkBox.isChecked()) {
            Toast.makeText(this, "Welcome to the start of a Journey of a lifetime..", Toast.LENGTH_SHORT).show();
        }

    }
    public void spinnerItemSelection(Spinner spinner){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "You are in : "+parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Remembre to Select the Continent you are in.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}