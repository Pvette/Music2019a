package com.example.android.music2019a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;


import static com.example.android.music2019a.R.id.jazz;



public class MainActivity extends AppCompatActivity {

    private Button jazz;
    private Button pop;
    private Button rock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        jazz = (Button) findViewById(R.id.jazz);
        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link JazzActivity)
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);

                //Start the new activity
                startActivity(jazzIntent);
            }
        });


        pop = (Button) findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link PopActivity)
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                //Start the new activity
                startActivity(popIntent);
            }
        });


        rock = (Button) findViewById(R.id.rock);
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new intent to open the {@link PopActivity)
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                //Start the new activity
                startActivity(rockIntent);
            }
        });


    }
}