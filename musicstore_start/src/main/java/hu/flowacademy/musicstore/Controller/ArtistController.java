package hu.flowacademy.musicstore.Controller;


import hu.flowacademy.musicstore.Exception.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import hu.flowacademy.musicstore.Service.AlbumService;
import hu.flowacademy.musicstore.Service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ArtistController {

    @Autowired
    private ArtistService artistService;
    private ValidationException exception;

    @GetMapping("/artist")
    public List<Artist> findall() {
        return artistService.findall();
    }

    @GetMapping("/artist/{id}")
    public Artist findOne(@PathVariable Long id) {
        return artistService.findOne(id);
    }

    @PostMapping
    public Object addBookPost(@RequestBody Artist artist) throws ValidationException{
        if(artist.getFirstname().equals("") || artist.getFirstname() == null ||
                artist.getLastname().equals("") || artist.getLastname() == null) {
            throw exception;
        }

        try {
            artistService.save(artist);
            return new ResponseEntity<String>("Kész", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }



    @DeleteMapping("/api/artist/{id}")
    public Object update(@PathVariable Long  id, @RequestBody Map<String, Object> o) {
        artistService.removeOne(id);
        return ResponseEntity.ok();
    }
}

