package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Emplayee;
import com.restaturant.api.booking.repository.EmplayeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplayeeService {
    @Autowired
    private EmplayeeRepository emplayeeRepository;




    public List<Emplayee> getAllemplayee() {
        return (List<Emplayee>) emplayeeRepository.findAll();
    }

    public Emplayee getAllemplayeeById(String id) {
        return emplayeeRepository.findById(id).get();
    }

    public Emplayee createEmplayee(Emplayee emplayee) {
        return emplayeeRepository.save(emplayee);
    }

    public Emplayee CreateEmplayee(Emplayee emplayee) {
        return emplayeeRepository.save(emplayee);
    }

    public void deleteById(String id) {
        emplayeeRepository.deleteById(id);
    }
}
