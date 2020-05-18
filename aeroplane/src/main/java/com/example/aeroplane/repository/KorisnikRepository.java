package com.example.aeroplane.repository;

import com.example.aeroplane.dao.*;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface KorisnikRepository extends JpaRepository<Radnik, Long> {
    Boolean existsByUsername(String username);

    Radnik findByUsername(String username);


}
