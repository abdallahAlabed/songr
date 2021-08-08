package com.example.songr.controller;

import com.example.songr.models.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @GetMapping("/albums")
    public String getAlbum(Model model){
        Album album1 = new Album("Calvin Harris","Summer",15,180,"https://www.youtube.com/watch?v=ebXbLfLACGM&list=LL&index=187");
        Album album2 = new Album("from Pitch Perfect 2","Jessie J",33,301,"https://www.youtube.com/watch?v=DzwkcbTQ7ZE&list=LL&index=186");
        Album album3 = new Album("Something Just Like This","The Chainsmokers & Coldplay",12,251,"https://www.youtube.com/watch?v=FM7MFYoylVs&list=LL&index=156");

        List<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        model.addAttribute("albums",albums);
        return "albums.html";
    }

}