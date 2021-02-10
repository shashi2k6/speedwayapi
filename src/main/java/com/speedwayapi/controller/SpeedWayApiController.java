package com.speedwayapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeedWayApiController {

    @RequestMapping("/home")
    public String home(){
        return "Success message";
    }
}
