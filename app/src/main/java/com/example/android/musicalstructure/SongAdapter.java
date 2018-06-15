package com.example.android.musicalstructure;

import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elizabeth on 6/15/18.
 */

public class SongAdapter extends ArrayAdapter<SongInfo> {


    public SongAdapter(Context context, ArrayList<SongInfo> songs){

        super(context, 0, songs);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        SongInfo currentSong = getItem(position);

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.song_item_artist);
        artistTextView.setText(currentSong.getArtistName());

        TextView albumTextView = (TextView) listItemView.findViewById(R.id.song_item_album);
        albumTextView.setText(currentSong.getAlbumName());

        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_item_song_name);
        songNameTextView.setText(currentSong.getSongName());

        return listItemView;
    }
}
