package com.example.aeroplane.repository;

import com.example.aeroplane.dao.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface VrstaIncidentaRepository extends JpaRepository<VrstaIncidenta, Long> {
}
