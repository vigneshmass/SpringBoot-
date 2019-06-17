package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Bookingorder;
import com.restaturant.api.booking.service.BookingorderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookingorderController {

    @Autowired
    private BookingorderService bookingorderService;


    @RequestMapping(value = "bookingorder", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Bookingorder> getbookingorder() {
        return  bookingorderService.getAllbookingorder();


    }

    @RequestMapping(value="/bookingorder",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Bookingorder> createBookingoredr(@RequestBody Bookingorder bookingorder ){
        Bookingorder createBookingorder = bookingorderService.createBookingorder (bookingorder);
        return Optional.ofNullable(createBookingorder)
                .map(b ->ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value="/bookingorder/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Bookingorder  getbookingorderById(@PathVariable String id) {
        return  bookingorderService.getbookingorder(id);

    }
   @RequestMapping(value="/bookingorder",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Bookingorder> Createbookingorder(@RequestBody Bookingorder bookingorder ){
        Bookingorder createBookingorder = bookingorderService.Createbookingorder (bookingorder);
        return Optional.ofNullable(createBookingorder)
                .map(b ->ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/bookingorder/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        bookingorderService.deleteById(id);
    }


}
