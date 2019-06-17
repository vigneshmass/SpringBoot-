package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Emplayee;
import com.restaturant.api.booking.service.EmplayeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmplayeeController {
    @Autowired
    private EmplayeeService emplayeeService;


    @RequestMapping(value="/emplayee",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Emplayee> getEmplayee() {
        return (List<Emplayee>) emplayeeService.getAllemplayee();

    }
    @RequestMapping(value="/empayee/(id)",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Emplayee getEmplayeeById(@PathVariable String id) {
        return  emplayeeService.getAllemplayeeById(id);

    }
    @RequestMapping(value="/emplayee",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Emplayee> createEmplayee(@RequestBody Emplayee emplayee ){
        Emplayee createEmplayee = emplayeeService.createEmplayee (emplayee);
        return Optional.ofNullable(createEmplayee)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value="/emplayee",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Emplayee> CreateEmplayee(@RequestBody Emplayee emplayee ){
        Emplayee createEmplayee = emplayeeService.CreateEmplayee (emplayee);
        return Optional.ofNullable(createEmplayee)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/emplayee/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        emplayeeService.deleteById(id);
    }
}
