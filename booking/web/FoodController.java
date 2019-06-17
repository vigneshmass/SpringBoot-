package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Food;
import com.restaturant.api.booking.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @RequestMapping(value="/food",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Food> getFood() {
        return (List<Food>) foodService.getAllfood();

    }
    @RequestMapping(value="/food/(id)",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Food getFoodById(@PathVariable String id) {
        return  foodService.getAllfoodById(id);

    }
    @RequestMapping(value="/food",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Food> createFood(@RequestBody Food food ){
        Food createFood = foodService.createFood (food);
        return Optional.ofNullable(createFood)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value="/food",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Food> CreateFood(@RequestBody Food food ){
        Food createFood = foodService.CreateFood (food);
        return Optional.ofNullable(createFood)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/food/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        foodService.deleteById(id);
    }
}
