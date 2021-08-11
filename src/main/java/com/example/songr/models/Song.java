package com.example.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    private int songId;
    private String title;
    private int length;
    private Album album;
    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Song() {


    }

    public Song(String title, int length,String imageUrl, Album album) {
        this.title = title;
        this.length = length;
        this.album = album;
        this.imageUrl= imageUrl;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @ManyToOne
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }




}
