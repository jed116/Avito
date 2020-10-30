package tech.itpark.model;

import java.util.ArrayList;

public class Flat {
    private int id;
    private ArrayList<String> stations = new ArrayList<>();

    private String district;
    private double price;
    private int floor;
    private int rooms;

    public Flat(ArrayList<String> stations) {
        this.stations = stations;
    }

    public Flat(int id, ArrayList<String> stations) {
        this.id = id;
        this.stations = stations;
    }

    public Flat(int id, int floor, int rooms, double price, String district, ArrayList<String> stations) {
        this.id = id;
        this.floor = floor;
        this.rooms = rooms;
        this.price = price;
        this.district = district;
        this.stations = stations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public ArrayList<String> getStations() {
        return stations;
    }

    public void setStations(ArrayList<String> stations) {
        this.stations = stations;
    }
}
