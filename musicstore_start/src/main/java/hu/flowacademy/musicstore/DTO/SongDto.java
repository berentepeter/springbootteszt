package hu.flowacademy.musicstore.DTO;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Model.Genre;

import java.time.LocalDate;

public class SongDto {

    private Long id;

    private String title;

    private Artist artist;
    private Album album;
}
