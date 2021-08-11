package com.example.songr.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    private int id ;
    private String title;
    private String artist;
    private Integer songId;
    private int length;
    private String imageUrl;
    private List<Song> songs;

    public Album( ) {

    }

    public Album( String title, String artist, Integer songId, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songId = songId;
        this.length = length;
        this.imageUrl = imageUrl;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    @OneToMany(mappedBy = "album")
    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }


}