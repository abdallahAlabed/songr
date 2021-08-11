package com.example.songr.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.songr.models.Album;

public interface AlbumRepository extends CrudRepository<Album,Integer> {

}
