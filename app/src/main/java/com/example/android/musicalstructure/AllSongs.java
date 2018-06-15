package com.example.android.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        //Declare an ArrayList of allSongs
        ArrayList<String> allSongs = new ArrayList<String>();

        //Add song names to the ArrayList allSongs
        allSongs.add("Bye Bye Bye");
        allSongs.add("It's Gonna Be Me");
        allSongs.add("This I Promise You");
        allSongs.add("Tearin' Up My Heart");
        allSongs.add("Toxic");
        allSongs.add("You Drive Me Crazy");
        allSongs.add("From The Bottom of My Broken Heart");
        allSongs.add("Genie In A Bottle");
        allSongs.add("Beautiful");

        //Create an ArrayAdapter
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, allSongs);

        //Fine the listView in XML activity
        ListView listView = (ListView) findViewById(R.id.show_songs);

        //On the above list view, call the setadapter method and use itemsAdapter as arg
        listView.setAdapter(itemsAdapter);

    }
}
