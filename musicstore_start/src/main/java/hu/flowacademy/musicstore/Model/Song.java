package hu.flowacademy.musicstore.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Data
@Entity
@Table
@AllArgsConstructor
public class Song {




        @Id
        @GeneratedValue
        private Long id;

        private String title;
        private Long lenght;
        private String lyrics;
        private LocalDate year;
        private String writername;
        private Genre genre;
        private Artist artist;
        private Album album;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public Long getLenght() {
                return lenght;
        }

        public void setLenght(Long lenght) {
                this.lenght = lenght;
        }

        public String getLyrics() {
                return lyrics;
        }

        public void setLyrics(String lyrics) {
                this.lyrics = lyrics;
        }

        public LocalDate getYear() {
                return year;
        }

        public void setYear(LocalDate year) {
                this.year = year;
        }

        public String getWritername() {
                return writername;
        }

        public void setWritername(String writername) {
                this.writername = writername;
        }

        public Genre getGenre() {
                return genre;
        }

        public void setGenre(Genre genre) {
                this.genre = genre;
        }

        public Artist getArtist() {
                return artist;
        }

        public void setArtist(Artist artist) {
                this.artist = artist;
        }

        public Album getAlbum() {
                return album;
        }

        public void setAlbum(Album album) {
                this.album = album;
        }


        @Override
        public String toString() {
                return "Song{" +
                        "id=" + id +
                        ", title='" + title + '\'' +
                        ", lenght=" + lenght +
                        ", lyrics='" + lyrics + '\'' +
                        ", year=" + year +
                        ", writername='" + writername + '\'' +
                        ", genre=" + genre +
                        ", artist=" + artist +
                        ", album=" + album +
                        '}';
        }
}