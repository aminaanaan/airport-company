package com.example.aeroplane.rest;

import com.example.aeroplane.core.*;
import com.example.aeroplane.dao.*;
import com.example.aeroplane.dto.*;
import com.example.aeroplane.repository.*;
import io.swagger.annotations.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@AllArgsConstructor
@RestController
@RequestMapping("/incident")
public class IncidentController {

    private IncidentService incidentService;
 private DeviceRepository uredjajRepository;
 private LetEepository letRepository;

 private IncidentDetailRepository incidentDetailRepository;

    @PostMapping()
    public String create(  @RequestBody IncidentRequest incidentRequest) {
        return incidentService.create(incidentRequest);
    }


    @GetMapping("/all")
    List<Incident> all() {
        return incidentService.findAll();
    }

    @GetMapping("/all/devices")
    List<Uredjaj> allDevices() {
        return uredjajRepository.findAll();
    }

    @GetMapping("/all/flights")
    List<Let> allFlights() {
        return letRepository.findAll();
    }
    @ApiOperation("get all incident details for incident id")
    @GetMapping("/all/incident-details/{incidentId}")
    List<IncidentDetail> allDetailsForId(@PathVariable Long incidentId) {
        return incidentDetailRepository.findByIncidentId(incidentId);
    }
}
