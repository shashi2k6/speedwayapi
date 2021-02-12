package com.speedwayapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "racecar")
public class RaceCar {

    @Id
    private int id;

    public RaceCar() {
    }

    public RaceCar(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
