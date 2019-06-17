package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Bookingtable;
import com.restaturant.api.booking.repository.BookingtableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingtableService {
    @Autowired
    private BookingtableRepository bookingtableRepository;

    public List<Bookingtable> getAllbookingtable() {
        return (List<Bookingtable>) bookingtableRepository.findAll();
    }

    public Bookingtable getbookingtable(String id) {
        return bookingtableRepository.findById(id).get();
    }

    public Bookingtable createBookingtable(Bookingtable bookingtable) {
        return  bookingtableRepository.save(bookingtable);
    }

    public Bookingtable CreateBookingtable(Bookingtable bookingtable) {
        return  bookingtableRepository.save(bookingtable);

    }

    public void deleteById(String id) {
         bookingtableRepository.deleteById(id);
    }
}
