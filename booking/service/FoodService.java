package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Food;
import com.restaturant.api.booking.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllfood() {
        return (List<Food>)foodRepository.findAll();

    }

    public Food getAllfoodById(String id) {
        return foodRepository.findById(id).get();

    }

    public Food createFood(Food food) {
        return foodRepository.save(food);
    }

    public Food CreateFood(Food food) {
        return foodRepository.save(food);
    }

    public void deleteById(String id) {
         foodRepository.deleteById(id);
    }
}
