package com.jayr.xplorsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText customerName;
private EditText customerAge;
private  Button viewCustomers, addCustomer;
private CustomerModel customerModel;
private Switch isActive ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    customerName = findViewById(R.id.customerName);
    customerAge = findViewById(R.id.customerAge);
    viewCustomers = findViewById(R.id.viewAllCustomers);
    addCustomer = findViewById(R.id.AddNewCustomer);
    isActive  = findViewById(R.id.activeCustomerSwitch);

    viewCustomers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "View All Customers", Toast.LENGTH_SHORT).show();
        }
    });
    addCustomer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Integer ID, String name, Integer age, Boolean isActive
            try {
            customerModel = new CustomerModel(-1,customerName.getText().toString(),Integer.parseInt(customerAge.getText().toString()),isActive.isChecked());
            Toast.makeText(MainActivity.this, customerModel.toString(), Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "Errro Creating Customer", Toast.LENGTH_SHORT).show();
            }
        }
    });
    }
}