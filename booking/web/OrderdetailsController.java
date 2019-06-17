package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Orderdetails;
import com.restaturant.api.booking.service.OrderdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OrderdetailsController {

    @Autowired
    private OrderdetailsService orderdetailsService;

    @RequestMapping(value="/orderdetails",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Orderdetails> getOrderdetails() {
        return (List<Orderdetails>) orderdetailsService.getAlloredrdetails();

    }
    @RequestMapping(value="/orderdetails/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Orderdetails getOrderdetailsById(@PathVariable String id) {
        return  orderdetailsService.getAlloredrdetailsById(id);

    }
    @RequestMapping(value="/orderdetails",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Orderdetails> createOrderdetails(@RequestBody Orderdetails orderdetails ){
        Orderdetails createdOrderdetails = orderdetailsService.createOrderdetails (orderdetails);
        return Optional.ofNullable(createdOrderdetails)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value="/orderdetails",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Orderdetails> CreateOrderdetails(@RequestBody Orderdetails orderdetails ){
        Orderdetails createdOrderdetails = orderdetailsService.CreateOrderdetails (orderdetails);
        return Optional.ofNullable(createdOrderdetails)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/orderdetails/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        orderdetailsService.deleteById(id);
    }

}
