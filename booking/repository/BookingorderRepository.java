package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Bookingorder;
import org.springframework.data.repository.CrudRepository;

public interface BookingorderRepository extends CrudRepository<Bookingorder,String> {
}
