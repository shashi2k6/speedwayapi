package com.speedwayapi.controller;

import com.speedwayapi.model.RaceCar;
import com.speedwayapi.service.RaceCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SpeedWayApiController {

    @Autowired
    private RaceCarService raceCarService;

    @PostMapping("/racecars")
    @ResponseStatus(HttpStatus.CREATED)
    public RaceCar addCar(@RequestBody RaceCar raceCar) {
        return raceCarService.addRaceCar(raceCar);
    }
}
