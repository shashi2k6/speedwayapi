package com.speedwayapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "racecar")
public class RaceCar implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nickname;
    private String model;
    private String year;
    private int owner;
    private String status;
    private int top_speed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

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

    @Override
    public String toString() {
        return "RaceCar{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", owner=" + owner +
                ", status='" + status + '\'' +
                ", top_speed=" + top_speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceCar raceCar = (RaceCar) o;
        return id == raceCar.id && owner == raceCar.owner && top_speed == raceCar.top_speed && Objects.equals(nickname, raceCar.nickname) && Objects.equals(model, raceCar.model) && Objects.equals(year, raceCar.year) && Objects.equals(status, raceCar.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, model, year, owner, status, top_speed);
    }
}
