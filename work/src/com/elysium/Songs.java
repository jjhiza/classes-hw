package com.elysium;

/**
 * Created by jay on 10/12/16.
 */
public class Songs {

    private String mAlbum;
    private String mArtist;
    private String mTrack;

    public Song(String album, String artist, String track) {

        mAlbum = album;
        mArtist = artist;
        mTrack = track;
    }

    public void play() {
        System.out.println("Playing - " +mArtist+"'s" + mTrack + "Album: " +mAlbum);

    }
}
