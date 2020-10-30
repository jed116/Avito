package tech.itpark.manager;

import tech.itpark.model.Flat;

import java.util.ArrayList;

public class FlatManager {
    private ArrayList<Flat> items = new ArrayList<>();
    private int nextId = 1;
    private double deltaPrice;
    private int deltaFloor;

    public FlatManager(double deltaPrice, int deltaFloor) {
        this.deltaPrice = deltaPrice;
        this.deltaFloor = deltaFloor;
    }

    public void save(Flat item) {
        if (item.getId() == 0) {
            item.setId(nextId);
            nextId++;
            items.add(item);
        }
        // TODO: handle update
    }

    public ArrayList<Flat> search(int rooms, double minPrice, double maxPrice, int minFloor, int maxFloor, ArrayList<String> districts, ArrayList<String> stations) {
        ArrayList<Flat> result = new ArrayList<>();

        for (Flat item : items) {
            if ((item.getRooms() != rooms) && (rooms > 0)){
                continue;
            }

            if ((item.getPrice() < minPrice - deltaPrice) && (minPrice > 0.0)){
                continue;
            }
            if ((item.getPrice() > maxPrice + deltaPrice) && (maxPrice > 0.0)){
                continue;
            }

            if ((item.getFloor() < minFloor - deltaFloor) && (minFloor > 0)){
                continue;
            }
            if ((item.getFloor() > maxFloor + deltaFloor) && (maxFloor > 0)){
                continue;
            }

            if ((!containsAnyDistrict(item, districts)) && (!districts.isEmpty())) {
                continue;
            }

            if ((!containsAnyStation(item, stations)) && (!stations.isEmpty())){
                continue;
            }
            result.add(item);
        }
        return result;
    }

    private boolean containsAnyStation(Flat item, ArrayList<String> stations) {
        for (String stationSearch : stations) {
            for (String stationFlat : item.getStations()) {
                if (stationFlat.toLowerCase().contains(stationSearch.toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean containsAnyDistrict(Flat item, ArrayList<String> districts) {
        for (String district : districts) {
            if (item.getDistrict().toLowerCase().contains(district.toLowerCase())){
                return true;
            }
        }
        return false;
    }

}
