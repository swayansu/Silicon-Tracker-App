package com.silicon.SiliconTracker.dtos;

import lombok.Getter;

@Getter
public class LocationRequest {
    private String street;
    private String city;
    private int pinCode;
    private String latitude;
    private String longitude;
}