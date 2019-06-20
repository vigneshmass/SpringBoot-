package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Location;
import com.restaturant.api.booking.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAlllocation() {
        return (List<Location>) getAlllocation();
    }

    public Location getAlllocationById(String id) {
        return locationRepository.findById(id).get();
    }

    public Location createlocation(Location location) {
        return locationRepository.save(location);
    }

    public void deleteById(String id) {
        locationRepository.deleteById(id);
    }
}
