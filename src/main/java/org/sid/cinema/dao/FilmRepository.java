package org.sid.cinema.dao;

import org.sid.cinema.entities.Film;
import org.sid.cinema.entities.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film,Long> {
}
