package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Delivery;
import com.restaturant.api.booking.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<Delivery> getAlldelivery() {
        return (List<Delivery>) deliveryRepository.findAll();
    }

    public Delivery getAlldeliveryById(String id) {
        return deliveryRepository.findById(id).get();
    }

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);

    }

    public Delivery CreateDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public void deleteById(String id) {
        deliveryRepository.deleteById(id);
    }
}
