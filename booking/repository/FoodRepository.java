package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food,String> {
}
