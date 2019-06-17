package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Orderdetails;
import com.restaturant.api.booking.repository.OrderdetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderdetailsService {

    @Autowired
    private OrderdetailsRepository orderdetailsRepository;

    public List<Orderdetails> getAlloredrdetails() {
        return (List<Orderdetails>)orderdetailsRepository.findAll();
    }

    public Orderdetails getAlloredrdetailsById(String id) {
        return orderdetailsRepository.findById(id).get();

    }

    public Orderdetails createOrderdetails(Orderdetails orderdetails) {
        return orderdetailsRepository.save(orderdetails);
    }

    public Orderdetails CreateOrderdetails(Orderdetails orderdetails) {
        return orderdetailsRepository.save(orderdetails);
    }

    public void deleteById(String id) {
        orderdetailsRepository.deleteById(id);
    }
}
