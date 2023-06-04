package com.puur.leaslydemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.puur.leaslydemo.models.Apartments;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ApartmentsRepository extends JpaRepository<Apartments, String>{
    Optional<Apartments> findById(String id);
}