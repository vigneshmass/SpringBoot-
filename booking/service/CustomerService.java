package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Customer;
import com.restaturant.api.booking.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllcustomer() {
        return (List<Customer>) customerRepository.findAll();


    }

    public Customer createCustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    public Customer getAllcustomerById(Long id) {

        return customerRepository.findById(id).get();
    }

    public Customer createcustomer(Customer customer) {

        return customerRepository.save(customer);
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}


