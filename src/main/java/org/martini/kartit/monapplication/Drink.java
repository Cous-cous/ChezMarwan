package org.martini.kartit.monapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class Drink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauces);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void drinkDL (View view){

        DrinkDownload.startActionGetJson(this);
    }

    public void next (View v) {

        Intent i = new Intent(getApplicationContext(), Resume.class);
        startActivity(i);
    }

}
