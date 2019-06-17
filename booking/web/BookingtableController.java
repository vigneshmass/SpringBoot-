package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Bookingtable;
import com.restaturant.api.booking.service.BookingtableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookingtableController {
    @Autowired
    private BookingtableService bookingtableService;

    @RequestMapping(value = "/bookingtable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Bookingtable> getbookingtable() {
        return bookingtableService.getAllbookingtable();

    }

    @RequestMapping(value = "/bookingtable/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Bookingtable getbookingtableById(@PathVariable String tableId) {
        return bookingtableService.getbookingtable(tableId);


    }

    @RequestMapping(value = "/bookingtable", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Bookingtable> createBookingtable(@RequestBody Bookingtable bookingtable) {
        Bookingtable createBookingtable = bookingtableService.createBookingtable(bookingtable);
        return Optional.ofNullable(createBookingtable)
                .map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/bookingtable", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Bookingtable> CreateBookingtable(@RequestBody Bookingtable bookingtable) {
        Bookingtable createdBookingtable = bookingtableService.createBookingtable(bookingtable);
        return Optional.ofNullable(createdBookingtable)
                .map(c -> ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound().build());

    }
    @RequestMapping(value = "/bookingtable/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        bookingtableService.deleteById(id);
    }
}