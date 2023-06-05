package com.puur.leaslydemo.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puur.leaslydemo.models.Apartments;
import com.puur.leaslydemo.repositories.ApartmentsRepository;



@RestController
@RequestMapping("/api")
public class LeaslyController {
    @GetMapping(path = "/hello")
    public String hello(){  
        String chickin = "chickin";
        return chickin;  
    }  

     @Autowired
    private ApartmentsRepository apartmentsRepository;

    @GetMapping(path = "/apartments/")
    public List<Apartments> list() {
        return apartmentsRepository.findAll();
    }

    @GetMapping(path = "/apartments/{id}")
    public Apartments getApartmentsByName(@PathVariable String id) {
       System.out.println("id: " + id);
        for (Apartments apartment : apartmentsRepository.findAll()) {
            System.out.println("id: " + apartment);
            if (apartment.getName().equals(id)) {
                return apartment;
            }
        }
        
        return apartmentsRepository.findAll().get(1);
    }
    
    /*
    @RequestMapping(value = "/reviews/{id}", method = RequestMethod.PUT)
    public void updateReviews(@PathVariable String id, @RequestBody Apartments apartments) {
        Apartments existingRepo = apartmentsRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(apartments, existingRepo, "apartment_id");
        
    }

    @RequestMapping(value = "/subleases/{id}", method = RequestMethod.PUT)
    public void updateSubleases(@PathVariable String id, @RequestBody Apartments apartments) {
        Apartments existingRepo = apartmentsRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(apartments, existingRepo, "apartment_id");
        
    }
    */

}

