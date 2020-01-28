package hu.flowacademy.musicstore.Service;


import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Repository.ArtistRepository;
import hu.flowacademy.musicstore.Repository.SongRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class SongService {


    @Autowired
    private final SongRepository songRepository;

    //post
    public Song save(Song food) {
        return songRepository.save(food);
    }

    //get

    public List<Song> findall() {
        return songRepository.findAll();
    }

    //get
    public Song findOne(Long id) {
        return songRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    //delete
    public void removeOne(Long id) {
        songRepository.deleteById(id);
    }
}

