package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_songs);

        /**
         * Sets an onClick listener sending an intent to MainActivity
         */
        ImageView homePage = (ImageView) findViewById(R.id.home_button);
        homePage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MainActivity.class);
                startActivity(i);
            }
        });

        /**
         * Instantiates new ArrayList of custom type SongInfo
         */
        ArrayList<SongInfo> allSongs = new ArrayList<SongInfo>();

        /**
         * allSongs ArrayList has objects of type SongInfo instantiated and added to list
         */
        allSongs.add(new SongInfo("Bye, Bye, Bye", "NSYNC", "NSYNC"));
        allSongs.add(new SongInfo("It's Gonna Be Me", "NSYNC", "NSYNC"));
        allSongs.add(new SongInfo("This I Promise You", "NSYNC", "No Strings Attached"));
        allSongs.add(new SongInfo("Tearin' Up My Heart", "NSYNC", "NSYNC"));
        allSongs.add(new SongInfo("Toxic", "Britney Spears", "Britney Jean"));
        allSongs.add(new SongInfo("You Drive Me Crazy", "Britney Spears", "Greatest Hits, Britney"));
        allSongs.add(new SongInfo("From The Bottom of My Broken Heart", "Britney Spears", "Britney Jean"));
        allSongs.add(new SongInfo("Genie In A Bottle", "Christina Aguilera", "Greatest Hits, Christina"));
        allSongs.add(new SongInfo("Beautiful", "Christina Aguilera", "Greatest Hits, Christina"));


        /**
         * Utilizing custom class SongAdapter, which builds out on ArrayAdapter
         */
        SongAdapter adapter =
                new SongAdapter(this, allSongs);

        /**
         * listview XML has setAdapter method called with adapter as arg
         */
        ListView listView = (ListView) findViewById(R.id.listview_songs);
        listView.setAdapter(adapter);

    }
}
