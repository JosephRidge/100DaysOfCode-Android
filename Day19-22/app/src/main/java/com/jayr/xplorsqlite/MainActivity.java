package com.jayr.xplorsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

    public class MainActivity extends AppCompatActivity {
    private EditText customerName;
    private EditText customerAge;
    private  Button viewCustomers, addCustomer;
    private ListView customerList;
    private DataBaseHelper dataBaseHelper;
    private ArrayAdapter customerArrayAdapter;
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
        customerList = findViewById(R.id.Customers);


        dataBaseHelper = new DataBaseHelper(MainActivity.this);
//        showDataOnList(dataBaseHelper);
      showDataOnList(dataBaseHelper);

        viewCustomers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "View All Customers", Toast.LENGTH_SHORT).show();
            showDataOnList(dataBaseHelper);
        }
    });

    addCustomer.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            Integer ID, String name, Integer age, Boolean isActive
             CustomerModel customerModel;
            try {
                customerModel = new CustomerModel(-1,customerName.getText().toString(),Integer.parseInt(customerAge.getText().toString()),isActive.isChecked());
                Toast.makeText(MainActivity.this, customerModel.toString(), Toast.LENGTH_SHORT).show();
            }
        catch (Exception e){
            Toast.makeText(MainActivity.this, "Errrorr Creating Customer", Toast.LENGTH_SHORT).show();
            customerModel = new CustomerModel(-1,"null",0,false);
        }
            DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);
            boolean select =  dataBaseHelper.addOne(customerModel);
            showDataOnList(dataBaseHelper);
            Toast.makeText(MainActivity.this, "Success == "+select, Toast.LENGTH_SHORT).show();
        }
    });
    customerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            CustomerModel clickedItem = (CustomerModel) parent.getItemAtPosition(position);
            dataBaseHelper.deleteOneOnClick(clickedItem);
            Toast.makeText(MainActivity.this, "Deleted : "
                    +clickedItem.toString(), Toast.LENGTH_SHORT).show();

        }
    });

    }
        private void showDataOnList(DataBaseHelper dataBaseHelper2) {
            customerArrayAdapter = new ArrayAdapter<CustomerModel>(MainActivity.this, android.R.layout.simple_expandable_list_item_1, dataBaseHelper2.getEveryOne());
            customerList.setAdapter(customerArrayAdapter);
        }
    }