package com.example.aeroplane.core;


import com.example.aeroplane.dao.*;
import com.example.aeroplane.dto.*;
import com.example.aeroplane.repository.*;
import org.springframework.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class IncidentService {

    @Autowired
    IncidentRepository incidentRepository;

    @Autowired
    LetEepository letRepository;
    @Autowired
DeviceRepository uredjajRepository;

    public String create(final IncidentRequest incidentRequest) {
        Incident incident=new Incident();
        BeanUtils.copyProperties(incidentRequest,incident);
        Incident newIncident=incidentRepository.save(incident);

        Long unitId=incidentRequest.getUnitId();
        if(unitId!=null){
            if(letRepository.existsById(unitId)){
                Let let=letRepository.findById(unitId).get();
                let.setIncidentId(newIncident.getIncidentId());
            }
            else if(letRepository.existsById(unitId)){
                Uredjaj let=uredjajRepository.findById(unitId).get();
                let.setIncidentId(newIncident.getIncidentId());
            }
        }

        return "Incident successfully created";
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

