package com.example.songr.controller;

import com.example.songr.models.Album;
import com.example.songr.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
@Autowired
AlbumRepository albumRepository;
    @GetMapping("/albums")
    public String getAlbum(Model model){

        model.addAttribute("albums", albumRepository.findAll());
        return "albums.html";
    }

    @PostMapping("/addAlbum")
    public RedirectView addSubmit(@ModelAttribute Album album, Model model) {
        model.addAttribute("albums",album);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }

}