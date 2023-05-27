package com.puur.leaslydemo.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.puur.leaslydemo.models.Apartments;
import com.puur.leaslydemo.repositories.ApartmentsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/v1/leasly")
public class LeaslyController {
    @Autowired
    private ApartmentsRepository apartmentsRepository;

    @GetMapping
    public List<Apartments> list() {
        return apartmentsRepository.findAll();
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void update(@PathVariable String id, @RequestBody Apartments apartments) {
        Apartments existingRepo = apartmentsRepository.findById(id).orElse(null);
        BeanUtils.copyProperties(apartments, existingRepo, "apartment_id");
        apartmentsRepository.saveAndFlush(apartments);
    }
}
