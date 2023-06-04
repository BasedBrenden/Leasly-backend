package com.puur.leaslydemo.repositories;


import com.puur.leaslydemo.models.Apartments;

import java.util.Optional;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@EnableScan
public interface ApartmentsRepository extends CrudRepository<Apartments, List>{
    List<Apartments> findAll();
}