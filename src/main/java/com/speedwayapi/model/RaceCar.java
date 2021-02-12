package com.speedwayapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "racecar")
public class RaceCar {

    @Id
    @GeneratedValue
    private int id;
    private String nickname;
    private String model;
    private String year;
    private int owner;
    private String status;
    private int top_speed;

    public RaceCar() {
    }

    public RaceCar(String nickname, String model, String year, int owner, String status, int top_speed) {
        this.nickname = nickname;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.status = status;
        this.top_speed = top_speed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTop_speed() {
        return top_speed;
    }

    public void setTop_speed(int top_speed) {
        this.top_speed = top_speed;
    }
}
