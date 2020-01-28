package hu.flowacademy.musicstore.utils;

import hu.flowacademy.musicstore.Repository.AlbumRepository;
import hu.flowacademy.musicstore.Repository.ArtistRepository;
import hu.flowacademy.musicstore.Repository.SongRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
@AllArgsConstructor
class initDataLoader {

    private AlbumRepository albumRepository;
    private ArtistRepository artistRepository;
    private SongRepository songRepository;


}
