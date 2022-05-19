package com.devSuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsmovie.entities.Score;
import com.devSuperior.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
