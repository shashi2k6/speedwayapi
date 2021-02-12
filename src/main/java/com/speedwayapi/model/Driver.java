package com.speedwayapi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "driver",schema = "public")
public class Driver implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String last_name;
    private int age;
    private String nickname;
    private int wins;
    private int losses;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RaceCar> cars;

    public Driver() {
    }

    public Driver(String first_name, String last_name, int age, String nickname, List<RaceCar> cars, int wins, int losses) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.nickname = nickname;
        this.cars = cars;
        this.wins = wins;
        this.losses = losses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<RaceCar> getCars() {
        return cars;
    }

    public void setCars(List<RaceCar> cars) {
        this.cars = cars;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", cars=" + cars +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return id == driver.id && age == driver.age && wins == driver.wins && losses == driver.losses && Objects.equals(first_name, driver.first_name) && Objects.equals(last_name, driver.last_name) && Objects.equals(nickname, driver.nickname) && Objects.equals(cars, driver.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, age, nickname, wins, losses, cars);
    }
}
