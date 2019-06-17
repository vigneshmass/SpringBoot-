package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer ,Long> {
}
