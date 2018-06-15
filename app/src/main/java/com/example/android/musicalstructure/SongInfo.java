package com.example.android.musicalstructure;

/**
 * Created by elizabeth on 6/15/18.
 * This is a custom class built to create a custom data type.
 * The data type SongInfo holds four pieces of information about a song.
 * SongInfo stores the name of the song, artist, and album as well as the imageID.
 */

public class SongInfo {

    /** Name of song */
    private String mSongName;

    /** Name of artist */
    private String mArtistName;

    /** Name of album */
    private String mAlbumName;


    /** Constructor for SongInfo class */
    public SongInfo(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return  mSongName;
    }

    /**
     * Get the artist name
     */
    public String getArtistName(){
        return mArtistName;
    }

    /**
     * Get the album name
     */
    public String getAlbumName() {
        return mAlbumName;
    }

}
