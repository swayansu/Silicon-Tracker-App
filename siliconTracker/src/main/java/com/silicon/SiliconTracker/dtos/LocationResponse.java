package com.silicon.SiliconTracker.dtos;

import com.silicon.SiliconTracker.entities.Location;

public class LocationResponse {
    private String street;
    private String city;
    private int pinCode;
    private String latitude;
    private String longitude;
    private String lastUpdatedTime;

    public LocationResponse(Location location){
        this.street = location.getAddress().getStreet();
        this.city = location.getAddress().getCity();
        this.pinCode = location.getAddress().getPinCode();
        this.latitude = location.getCoordinate().getLatitude();
        this.longitude = location.getCoordinate().getLongitude();
        this.lastUpdatedTime = location.getLastUpdatedTime().toString();
    }
}