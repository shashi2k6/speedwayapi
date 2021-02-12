package com.speedwayapi.service;

import com.speedwayapi.model.RaceCar;
import com.speedwayapi.repository.RaceCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCarService {

    @Autowired
    private RaceCarRepository raceCarRepository;

    public RaceCar addRaceCar(RaceCar raceCar) {
        return raceCarRepository.save(raceCar);
    }

    public List<RaceCar> getAllCars() {
        return raceCarRepository.findAll();
    }
}
