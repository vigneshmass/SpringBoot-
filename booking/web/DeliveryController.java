package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Delivery;
import com.restaturant.api.booking.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @RequestMapping(value = "/delivery", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Delivery> getDelivery() {
        return (List<Delivery>) deliveryService.getAlldelivery();

    }

    @RequestMapping(value = "/delivery/(id)", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Delivery getDeliveryById(@PathVariable String id) {
        return deliveryService.getAlldeliveryById(id);

    }

    @RequestMapping(value = "/delivery", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
        Delivery createDelivery = deliveryService.createDelivery(delivery);
        return Optional.ofNullable(createDelivery)
                .map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/delivery", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Delivery> CreateDelivery(@RequestBody Delivery delivery) {
        Delivery createDelivery = deliveryService.CreateDelivery(delivery);
        return Optional.ofNullable(createDelivery)
                .map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }
    @RequestMapping(value = "/delivery/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        deliveryService.deleteById(id);
    }
}