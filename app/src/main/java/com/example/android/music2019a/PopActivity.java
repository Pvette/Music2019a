package com.example.android.music2019a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pop);

        //Create an array of pop albums
        ArrayList<Album> albums = new ArrayList<Album>();
        //words.add("one");

        albums.add(new Album("Happiness Begins","Jonas Brothers"));
        albums.add(new Album("Diamonds","Elton John"));
        albums.add(new Album("Coconut Oil", "Lizzo"));
        albums.add(new Album("Madame X", "Madonna"));
        albums.add(new Album("Share My World", "Mary J Blige"));
        // words.add(new Word("white", "kelelli"));
        // words.add(new Word("dusty yellow", "ṭopiisә"));
        // words.add(new Word("mustard yellow", "chiwiiṭә"));


        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        TextView wordView = new TextView(this);



    }

}


