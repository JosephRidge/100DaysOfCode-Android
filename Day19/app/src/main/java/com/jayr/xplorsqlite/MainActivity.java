package com.jayr.xplorsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText customerName;
private EditText customerAge;
private  Button viewCustomers, addCustomer;
private CustomerModel customerModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    customerName = findViewById(R.id.customerName);
    customerAge = findViewById(R.id.customerAge);
    viewCustomers = findViewById(R.id.viewAllCustomers);
    addCustomer = findViewById(R.id.AddNewCustomer);
    customerModel = new CustomerModel();

    viewCustomers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "View All Customers", Toast.LENGTH_SHORT).show();
        }
    });
    addCustomer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Add Customer", Toast.LENGTH_SHORT).show();
        }
    });
    }
}