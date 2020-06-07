package pl.zimny.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="locations", schema = "maps")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "dogId")
    Integer dogid;

    @Column
    String lat;

    @Column
    String lng;

    public Location(Integer dogid, String lat, String lng) {
        this.dogid = dogid;
        this.lat = lat;
        this.lng = lng;
    }
}
