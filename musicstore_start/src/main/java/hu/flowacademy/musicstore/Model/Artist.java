package hu.flowacademy.musicstore.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table
@AllArgsConstructor

public class Artist {





        @Id
        @GeneratedValue
        private Long id;

        @Column(name = "first_name", nullable = false)
        private String firstname;

        @Column(name = "first_name", nullable = false)
        private String lastname;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstname() {
                return firstname;
        }

        public void setFirstname(String firstname) {
                this.firstname = firstname;
        }

        public String getLastname() {
                return lastname;
        }

        public void setLastname(String lastname) {
                this.lastname = lastname;
        }

        @Override
        public String toString() {
                return "Artist{" +
                        "id=" + id +
                        ", firstname='" + firstname + '\'' +
                        ", lastname='" + lastname + '\'' +
                        '}';
        }
}