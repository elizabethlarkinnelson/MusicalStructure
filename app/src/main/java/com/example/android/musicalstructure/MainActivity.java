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

        TextView allSongs = (TextView) findViewById(R.id.show_songs);
        allSongs.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), AllSongs.class);
                startActivity(i);
            }
        });

    }

//    public void OpenAllSongs(View view){
//        Intent i = new Intent(this, AllSongs.class);
//        startActivity(i);
//    }
}
