package org.martini.kartit.monapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Sandwich MySandwich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        MySandwich = new Sandwich();
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ImageButton fab = (ImageButton) findViewById(R.id.tomate);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getTomates()) {
                    MySandwich.setTomates(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedTomatoes), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setTomates(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedTomatoes), Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton fab2 = (ImageButton) findViewById(R.id.oignon);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getOignons()) {
                    MySandwich.setOignons(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedOnions), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setOignons(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedOnions), Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton fab3 = (ImageButton) findViewById(R.id.salade);
        fab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getSalade()) {
                    MySandwich.setSalade(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedLettuce), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setSalade(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedLettuce), Toast.LENGTH_SHORT).show();
                }
            }
        });




        ImageButton fab4 = (ImageButton) findViewById(R.id.torti);
        fab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getPain()) {
                    MySandwich.setPain(false);
                    view.setBackgroundColor(Color.GRAY);
                } else {
                    MySandwich.setPain(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedBread), Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton fab5 = (ImageButton) findViewById(R.id.normal);
        fab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getPain()) {
                    MySandwich.setPain(false);
                    view.setBackgroundColor(Color.GRAY);
                } else {
                    MySandwich.setPain(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedBread), Toast.LENGTH_SHORT).show();
                    //view.setBackgroundColor(Color.BLUE);
                }
            }
        });




        Button suivant = (Button) findViewById(R.id.nextButton);

        suivant.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), viande.class); // C'est ça qu'on prends pour faire une nouvelle Activity
                i.putExtra("salade", MySandwich.getSalade());
                i.putExtra("tomate", MySandwich.getTomates());
                i.putExtra("oignon", MySandwich.getOignons());
                startActivity(i);


            }
        });
    }
}
