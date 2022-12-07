package com.silicon.SiliconTracker.controllers;

import com.silicon.SiliconTracker.dtos.LocationRequest;
import com.silicon.SiliconTracker.services.LocationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/location")
@RestController
public class LocationController {

    @Autowired
    LocationServices locationServices;

    @PostMapping("updatelocation")
    public void updateLocation(@RequestBody LocationRequest locationRequest){
        locationServices.updateLocation(locationRequest);
    }
}