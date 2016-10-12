package com.elysium;

import java.util.ArrayList;

/**
 * Created by jay on 10/12/16.
 */
public class Playlist {

    private String mPlaylistCategories;
    private ArrayList<Song> mSongs;

    public Playlist(String name) {
        mPlaylistCategories = name;
        mSongs = new ArrayList<>();
    }

    public String getName() {
        return mPlaylistCategories;
    }

    public static void addSong(Song trackName) {
        mSongs.add(trackName);
    }
}
