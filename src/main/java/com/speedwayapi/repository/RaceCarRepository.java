package com.speedwayapi.repository;

import com.speedwayapi.model.RaceCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceCarRepository  extends JpaRepository<RaceCar,Integer> {
}
