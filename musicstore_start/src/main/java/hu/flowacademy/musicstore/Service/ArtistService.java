package hu.flowacademy.musicstore.Service;


import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Repository.ArtistRepository;
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
public class ArtistService {

    @Autowired
    private final ArtistRepository artistRepository;

    //post
    public Artist save(Artist food) {
        return artistRepository.save(food);
    }

    //get

    public List<Artist> findall() {
        return artistRepository.findAll();
    }

    //get
    public Artist findOne(Long id) {
        return artistRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }


    //put



    //delete
    public void removeOne(Long id) {
        artistRepository.deleteById(id);
    }
}

