package com.example.android.musicalstructure;

/**
 * Created by elizabeth on 6/15/18.
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

    /** Get the song name */
    public String getSongName() {
        return  mSongName;
    }

    /** Get the artist name */
    public String getArtistName(){
        return mArtistName;
    }

    /** Get the album name */
    public String getmAlbumName() {
        return mAlbumName;
    }
}
