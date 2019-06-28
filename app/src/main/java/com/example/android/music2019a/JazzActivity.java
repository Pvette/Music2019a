package com.example.android.music2019a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        //Create an array of albums
        ArrayList<Album> albums = new ArrayList<Album>();

        //albums.add("one");

        albums.add(new Album("Blue Train","John Coltrane"));
        albums.add(new Album("The Sidewinder","Lee Morgan"));
        albums.add(new Album("The Turnaround!", "Hank Mobley"));
        albums.add(new Album("Be Good", "Gregory Porter"));
        albums.add(new Album("Moanin", "Art Blakely"));
        // words.add(new Word("six", "temmokka"));
        //words.add(new Word("seven", "kenekaku"));
        // words.add(new Word("eight", "kawinta"));
        // words.add(new Word("nine", "wo'e"));
        //  words.add(new Word("ten", "na'aacha"));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



        TextView wordView = new TextView(this);


    }

}



