package hu.flowacademy.musicstore.Repository;

import hu.flowacademy.musicstore.Model.Album;
import hu.flowacademy.musicstore.Model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}