package com.silicon.SiliconTracker.services;

import com.silicon.SiliconTracker.dao.AddressRepo;
import com.silicon.SiliconTracker.dao.CoordinateRepo;
import com.silicon.SiliconTracker.dao.LocationRepo;
import com.silicon.SiliconTracker.dtos.LocationRequest;
import com.silicon.SiliconTracker.entities.Address;
import com.silicon.SiliconTracker.entities.Coordinate;
import com.silicon.SiliconTracker.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class LocationServices {

    @Autowired
    private CoordinateRepo coordinateRepo;

    @Autowired
    private LocationRepo locationRepo;

    @Autowired
    private AddressRepo addressRepo;

    public void updateLocation(LocationRequest locationRequest){
        Location location = new Location();

        Address address = new Address();
        address.setStreet(locationRequest.getStreet());
        address.setCity(locationRequest.getCity());
        address.setPinCode(locationRequest.getPinCode());
        addressRepo.save(address);
        location.setAddress(address);

        Coordinate coordinate = new Coordinate();
        coordinate.setLatitude(locationRequest.getLatitude());
        coordinate.setLongitude(locationRequest.getLongitude());
        coordinateRepo.save(coordinate);
        location.setCoordinate(coordinate);

        location.setLastUpdatedTime(LocalTime.now());

        locationRepo.save(location);
    }
}
