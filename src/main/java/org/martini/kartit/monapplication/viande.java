package org.martini.kartit.monapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class viande extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viande);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton cordon = (ImageButton) findViewById(R.id.cordon);
        cordon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getCordon()) {
                    MySandwich.setCordon(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedCordon), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setCordon(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedCordon), Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton steak = (ImageButton) findViewById(R.id.steak);
        steak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getSteak()) {
                    MySandwich.setSteak(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedSteak), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setSteak(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedSteak), Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton merguez = (ImageButton) findViewById(R.id.merguez);
        merguez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MySandwich.getMerguez()) {
                    MySandwich.setMerguez(false);
                    view.setBackgroundColor(Color.GRAY);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.notSelectedMerguez), Toast.LENGTH_SHORT).show();
                } else {
                    MySandwich.setMerguez(true);
                    view.setBackgroundColor(Color.BLUE);
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.selectedMerguez), Toast.LENGTH_SHORT).show();
                }
            }
        });



        Button suivant = (Button) findViewById(R.id.button);

        suivant.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Drink.class);
                i.putExtra("cordon", MySandwich.getCordon());
                i.putExtra("steak", MySandwich.getSteak());
                i.putExtra("merguez", MySandwich.getMerguez());
                startActivity(i);
            }
        });
    }
}


