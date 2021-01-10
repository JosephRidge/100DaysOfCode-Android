package com.jayr.day5ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView personalizedGreetings;
    Button btnGreetings;
    EditText nameInput;


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case  R.id.btnSave:
                personalizedGreetings.setText(nameInput.getText().toString());
                Toast.makeText(this, "Hellow  "+nameInput.getText().toString()+" !! .", Toast.LENGTH_SHORT).show();
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
        nameInput = findViewById(R.id.userName);
        btnGreetings.setOnClickListener(this);

//        nameInput = findViewById(R.id.userName);

    }



}