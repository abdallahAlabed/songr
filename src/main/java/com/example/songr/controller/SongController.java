package com.example.songr;

import com.example.songr.models.Song;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/allSongs")
    public String getAllSongs(Model model){
        model.addAttribute("song", new Song());
        model.addAttribute("songs",songRepository.findAll());
        model.addAttribute("albums",albumRepository.findAll());
        return "songs.html";
    }

    //add songs
    @PostMapping("/addSong")
    public RedirectView addSong(@ModelAttribute Song song){
        songRepository.save(song);
        return new RedirectView("/allSongs");
    }
}