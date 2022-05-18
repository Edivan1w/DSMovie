package com.devSuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	
}
