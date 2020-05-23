package com.example.aeroplane.repository;

import com.example.aeroplane.dao.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface IncidentDetailRepository extends JpaRepository<IncidentDetail, Long> {
    List<IncidentDetail> findByIncidentId(Long incidentId);
}
