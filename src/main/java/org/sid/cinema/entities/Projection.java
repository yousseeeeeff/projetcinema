package org.sid.cinema.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Projection implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date dateProjection;
    private double prix;
    @ManyToOne
    private Film film;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Salle salle;
    @OneToMany(mappedBy = "projection")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    Collection<Ticket> tickets ;
    @ManyToOne

    private Seance seance;

}
