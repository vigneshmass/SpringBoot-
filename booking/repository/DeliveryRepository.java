package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Delivery;
import org.springframework.data.repository.CrudRepository;

public interface DeliveryRepository extends CrudRepository<Delivery,String> {
}
