package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_songs);

        //Declare an ArrayList of allSongs
        ArrayList<SongInfo> allSongs = new ArrayList<SongInfo>();

        //Add song names to the ArrayList allSongs
        allSongs.add(new SongInfo("Bye Bye Bye", "artist: *NSYNC", "album: *NSYNC"));
        allSongs.add(new SongInfo("It's Gonna Be Me", "artist:*NSYNC", "album: *NSYNC"));
        allSongs.add(new SongInfo("This I Promise You", "artist: *NSYNC", "album: No Strings Attached"));
        allSongs.add(new SongInfo("Tearin' Up My Heart", "artist: *NSYNC", "album: *NSYNC"));
        allSongs.add(new SongInfo("Toxic", "artist:Britney Spears", "album: Britney Jean"));
        allSongs.add(new SongInfo("You Drive Me Crazy", "artist:Britney Spears", "album: Greatest Hits, Britney"));
        allSongs.add(new SongInfo("From The Bottom of My Broken Heart", "artist: Britney Spears", "album: Britney Jean"));
        allSongs.add(new SongInfo("Genie In A Bottle", "artist:Christina Aguilera", "album: Greatest Hits, Christina"));
        allSongs.add(new SongInfo("Beautiful", "artist:Christina Aguilera", "album: Greatest Hits, Christina"));

        //Create an ArrayAdapter
        SongAdapter adapter =
                new SongAdapter(this, allSongs);

        //Fine the listView in XML activity
        ListView listView = (ListView) findViewById(R.id.listview_songs);

        //On the above list view, call the setadapter method and use itemsAdapter as arg
        listView.setAdapter(adapter);

    }
}
