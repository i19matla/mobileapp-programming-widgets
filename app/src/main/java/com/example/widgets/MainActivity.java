package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button; // <-- Denna lades till automatiskt då jag tryckte enter vid ett tillfälle då id:t skrevs in.
                                //Utan den kommer inte knappen att senare fungera, importerar ett knappbibliotek.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button variabelKnappen = findViewById(R.id.knappensid);     //Notera nästan ALLT har en egen datatyp.

        variabelKnappen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>","Knappen är klickad! Tjohoooooooo!");
            }
        });
    }
    }

