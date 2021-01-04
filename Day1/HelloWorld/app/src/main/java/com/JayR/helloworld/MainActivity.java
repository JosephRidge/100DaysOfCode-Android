package com.JayR.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText enterEmail;
    EditText enterFname;
    EditText enterLname;
    TextView email;
    TextView f_name;
    TextView l_name;
    TextView greeting;
    String userEmail,firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//   TODO : Input Code
    public void RegisterMe(View view){
//        Input -- getText()
        enterEmail = findViewById(R.id.EnterEmail);
        enterFname = findViewById(R.id.EnterFirstName);
        enterLname= findViewById(R.id.EnterLastName);
//        TextView -- setText()
        email = findViewById(R.id.e_Mail);
        f_name = findViewById(R.id.f_Name);
        l_name = findViewById(R.id.l_Name);
        greeting = findViewById(R.id.greetings);
//        getText to String
        userEmail = enterEmail.getText().toString();
        firstName = enterFname.getText().toString();
        lastName = enterLname.getText().toString();

        email.setText("Email :"+userEmail);
        f_name.setText("First Name"+firstName);
        l_name.setText("Second Name"+lastName);
        greeting.setText("You Just Registered !! ");



    }
}