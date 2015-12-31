package org.martini.kartit.monapplication;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resume extends MainActivity {


    // Faire le résumé de la commande totale  (ce qu'il y a dans MySandwitch)
    // PAS REUSSI >< :/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*if (MySandwich.getCordon() == true) {
            TextView viewCordon = (TextView)findViewById(R.id.cordon);
            viewCordon.setText("Cordon bleu Selectionné");
        }
        */

        Button fab = (Button) findViewById(R.id.sendButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Votre commande sera prête dans 10 min", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

       /* String sandwichResume = "";
        if(this.getIntent().getBooleanExtra("tomate",false)){
            sandwichResume = sandwichResume.concat("Il y'a de la tomate");
        } else {
            sandwichResume = sandwichResume.concat("Il n'y a pas de tomate");
        }
        commande.setText(sandwichResume);
    }*/


    }
}
