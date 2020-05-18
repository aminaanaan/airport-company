package com.example.aeroplane.core;


import com.example.aeroplane.dao.*;
import com.example.aeroplane.repository.*;
import org.springframework.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class IncidentService {

    @Autowired
    IncidentRepository incidentRepository;

    public String create(final Incident incident) {
        incidentRepository.save(incident);
        return "User successfully created";
    }
    public List<Incident> findAll(){
       return incidentRepository.findAll();


    }
    public Incident findById(Long id) throws Exception {
      if(incidentRepository.existsById(id))
        return incidentRepository.findById(id).get();
      else
          throw new Exception("incident doesnt exist in database" +
                  "");
    }

    }

