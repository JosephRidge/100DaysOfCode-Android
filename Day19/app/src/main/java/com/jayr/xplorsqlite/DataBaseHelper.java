package com.jayr.xplorsqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String CUSTOMER_TABLE = "PEOPLE_TABLE";
    public static final String COLUMN_CUSTOMER_ID = "ID";
    public static final String COLUMN_CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String COLUMN_CUSTOMER_AGE = "CUSTOMER_AGE";
    public static final String COLUMN_ACTIVE_CUSTOMER = "ACTIVE_CUSTOMER";

    /**
     * Create a helper object to create, open, and/or manage a database.
     * This method always returns very quickly.  The database is not actually
     * created or opened until one of {@link #getWritableDatabase} or
     * {@link #getReadableDatabase} is called.
     *
     * @param context to use for locating paths to the the database
//     * @param name    of the database file, or null for an in-memory database
//     * @param factory to use for creating cursor objects, or null for the default
//     * @param version number of the database (starting at 1); if the database is older,
     *                {@link #onUpgrade} will be used to upgrade the database; if the database is
     *                newer, {@link #onDowngrade} will be used to downgrade the database
     */
    public DataBaseHelper(@Nullable Context context) {
        super(context, "customer.db", null, 1);

        /*
        * for this cocnstructore what i have done is.
        * I have removed the parametere: name,factory and version.
        * And fed in the values directly in the super() method*/

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CustomerTable = "CREATE TABLE " + CUSTOMER_TABLE + " (" + COLUMN_CUSTOMER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_CUSTOMER_NAME + " TEXT, " + COLUMN_CUSTOMER_AGE + " INT, " + COLUMN_ACTIVE_CUSTOMER + " BOOL)";
        db.execSQL(CustomerTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addOne(CustomerModel customerModel) {
        SQLiteDatabase db = this.getWritableDatabase(); // insert data method
        ContentValues cv = new ContentValues();
            cv.put(COLUMN_CUSTOMER_AGE,customerModel.getAge());
            cv.put(COLUMN_CUSTOMER_NAME,customerModel.getName());
            cv.put(COLUMN_ACTIVE_CUSTOMER,customerModel.getActive());
        long insert = db.insert(CUSTOMER_TABLE, null, cv);

        if (insert == -1) {
            return false;
        } else { return true; }
    }

    public List<CustomerModel>getEveryOne(){
        List<CustomerModel>returnList = new ArrayList<>();
        String queryCustomers = "SELECT * FROM "+CUSTOMER_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();


        Cursor cursor = db.rawQuery(queryCustomers,null);
        if(cursor.moveToFirst()){
            do{
                int customerID = cursor.getInt(0);
                String customerName = cursor.getString(1);
                int customerAge = cursor.getInt(2);
                Boolean isActive = cursor.getInt(3) == 1 ? true: false;
                CustomerModel customerModel = new CustomerModel(customerID,customerName,customerAge,isActive);
                returnList.add(customerModel);
            }
            while(cursor.moveToNext());

        }else{
//
        }
        db.close();
        cursor.close();
        return returnList;
    }



}
