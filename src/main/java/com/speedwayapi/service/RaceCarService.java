package com.speedwayapi.service;

import com.speedwayapi.model.Driver;
import com.speedwayapi.model.RaceCar;
import com.speedwayapi.repository.DriverRepository;
import com.speedwayapi.repository.RaceCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCarService {

    @Autowired
    private RaceCarRepository raceCarRepository;

    @Autowired
    private DriverRepository driverRepository;

    public RaceCar addRaceCar(RaceCar raceCar) {
        return raceCarRepository.save(raceCar);
    }

    public List<RaceCar> getAllCars() {
        return raceCarRepository.findAll();
    }

    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }
}
