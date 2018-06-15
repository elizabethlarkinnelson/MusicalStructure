package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Sets an onClick listener sending an intent to AllSongsActivity
         */
        TextView allSongs = (TextView) findViewById(R.id.show_songs);
        allSongs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AllSongsActivity.class);
                startActivity(i);
                }
        });
    }
}
