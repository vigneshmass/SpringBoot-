package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Orderdetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderdetailsRepository extends CrudRepository<Orderdetails,String> {
}
