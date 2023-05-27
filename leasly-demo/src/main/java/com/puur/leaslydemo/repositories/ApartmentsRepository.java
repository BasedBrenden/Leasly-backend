package com.puur.leaslydemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.puur.leaslydemo.models.Apartments;

public interface ApartmentsRepository extends JpaRepository<Apartments, String>{
    
}
