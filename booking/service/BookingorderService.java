package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Bookingorder;
import com.restaturant.api.booking.repository.BookingorderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingorderService {

    @Autowired
    private BookingorderRepository bookingorderRepository;

    public List<Bookingorder> getAllbookingorder() {
        return (List<Bookingorder>) bookingorderRepository.findAll();
    }

    public Bookingorder createBookingorder(Bookingorder bookingorder) {
        return bookingorderRepository.save(bookingorder);

    }

    public Bookingorder getbookingorder(String id) {
        return bookingorderRepository.findById(id).get();
    }

    public Bookingorder Createbookingorder(Bookingorder bookingorder) {
        return bookingorderRepository.save(bookingorder);
    }

    public void deleteById(String id) {
         bookingorderRepository.deleteById(id);
    }
}
