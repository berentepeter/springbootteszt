package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Exception.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Song;
import hu.flowacademy.musicstore.Service.AlbumService;
import hu.flowacademy.musicstore.Service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class SongController {



    @Autowired
    private SongService songService;
    private ValidationException exception;

    @GetMapping("/song")
    public List<Song> findall() {
        return songService.findall();
    }

    @GetMapping("/song/{id}")
    public Song findOne(@PathVariable Long id) {
        return songService.findOne(id);
    }

    @PostMapping
    public Object addBookPost(@RequestBody Song song) throws  ValidationException {
        if(song.getLyrics().equals("")){
            song.setLyrics(null);
        }
        if(song.getTitle().equals("") || song.getArtist()==null || song.getGenre()==null ||
            song.getYear()==null || song.getLenght() == 0){
            throw exception;
        }

        try {
            songService.save(song);
            return new ResponseEntity<String>("Kész", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }



    @DeleteMapping("/api/song/{id}")
    public Object update(@PathVariable Long  id, @RequestBody Map<String, Object> o) {
        songService.removeOne(id);
        return ResponseEntity.ok();
    }
}

