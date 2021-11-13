package com.example.trucktracker;

public class Data {
    String truckName;
    String truckLocation;
    Data(){

    }

    public Data(String truckName, String truckLocation) {
        this.truckName = truckName;
        this.truckLocation = truckLocation;
    }

    public String getTruckName() {
        return truckName;
    }

    public String getTruckLocation() {
        return truckLocation;
    }
}
