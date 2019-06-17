package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Rest;
import com.restaturant.api.booking.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestService {
    @Autowired
    private RestRepository restRepository;

    public List<Rest> getAllrest() {
        return (List<Rest>) restRepository.findAll();

    }

    public Rest getAllrestById(String id) {
        return restRepository.findById(id).get();
    }

    public Rest createRest(Rest rest) {
        return restRepository.save(rest);
    }

    public void deleteById(String id) {
        restRepository.deleteById(id);
    }

}
