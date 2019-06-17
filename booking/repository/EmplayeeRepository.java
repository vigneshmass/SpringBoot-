package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Emplayee;
import org.springframework.data.repository.CrudRepository;

public interface EmplayeeRepository extends CrudRepository<Emplayee,String> {
}
