package hu.flowacademy.musicstore.Service;


import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Repository.AlbumRepository;
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
public class AlbumService {

    @Autowired
    private final AlbumRepository albumRepository;

    //post
    public Album save(Album food) {
        return albumRepository.save(food);
    }

    //get

    public List<Album> findall() {
        return albumRepository.findAll();
    }

    //get
    public Album findOne(Long id) {
        return albumRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }


    //put



    //delete
    public void removeOne(Long id) {
        albumRepository.deleteById(id);
    }
}

