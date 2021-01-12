package com.jayr.day7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    CardView cardView;

    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.fab);
        cardView = findViewById(R.id.card);
        relativeLayout = findViewById(R.id.parent);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FAB Clicked", Toast.LENGTH_SHORT).show();
                SystemClock.sleep(1000);
                Toast.makeText(MainActivity.this, "It worked " +
                        "!!! \n", Toast.LENGTH_SHORT).show();
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(relativeLayout,"You r your biggest fan !!",Snackbar.LENGTH_INDEFINITE)
                        .setAction("Show", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "I'll Travaille ! ! " , Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setBackgroundTint(getResources().getColor(R.color.orange))
                        .setActionTextColor(getResources().getColor(R.color.purple_700))
                        .show();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Settings Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(this, "Your profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.language:
                Toast.makeText(this, "Select Language", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}