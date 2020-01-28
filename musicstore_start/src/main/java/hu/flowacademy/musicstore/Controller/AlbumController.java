package hu.flowacademy.musicstore.Controller;

import hu.flowacademy.musicstore.Exception.ValidationException;
import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class AlbumController {



    @Autowired
    private AlbumService albumService;
    private ValidationException exception;

    @GetMapping("/album")
    public List<Album> findall() {
        return albumService.findall();
    }

    @GetMapping("/album/{id}")
    public Album findOne(@PathVariable Long id) {
        return albumService.findOne(id);
    }

    @PostMapping
    public Object addBookPost(@RequestBody Album album) throws ValidationException{
        if(album.getTitle().equals("") || album.getTitle() == null || album.getCount()<0) {
            throw exception;
        }
        try {
            albumService.save(album);
            return new ResponseEntity<String>("Kész", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }



    @DeleteMapping("/api/album/{id}")
    public Object update(@PathVariable Long  id, @RequestBody Map<String, Object> o) {
        albumService.removeOne(id);
        return ResponseEntity.ok();
    }
}

