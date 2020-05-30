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

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/incident")
public class IncidentController {

    private IncidentService incidentService;
    private DeviceRepository uredjajRepository;
    private LetEepository letRepository;
    private IncidentRepository incidentRepository;
    private IncidentDetailRepository incidentDetailRepository;

    @CrossOrigin
    @PostMapping()
    public String create(@RequestBody IncidentRequest incidentRequest) {
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

    @GetMapping("/devices/{deviceId]")
    Uredjaj getDeviceById(@PathVariable Long deviceId) {
        return uredjajRepository.getOne(deviceId);
    }

    @GetMapping("/all/flights")
    List<Let> allFlights() {
        return letRepository.findAll();
    }

    @GetMapping("/flights/{letId]")
    Let getFlightById(@PathVariable Long letId) {
        return letRepository.getOne(letId);
    }

    @ApiOperation("get all incident details for incident id")
    @GetMapping("/all/incident-details/{incidentId}")
    List<IncidentDetail> allDetailsForId(@PathVariable Long incidentId) {
        return incidentDetailRepository.findByIncidentId(incidentId);
    }

    @CrossOrigin
    @PostMapping("/create/incident-detail")
    IncidentDetail createIncidentDetail(IncidentDetail incidentDetail) {
        IncidentDetail incidentDetail1 = incidentDetailRepository.save(incidentDetail);
        return incidentDetail1;
    }

    @CrossOrigin
    @PutMapping("/resolve/{incidentId}")
    Incident resolve(@PathVariable Long incidentId) {
        Incident incident = incidentRepository.findById(incidentId).get();
        incident.setStatus(IncidentStatus.RESOLVED);
        incidentRepository.save(incident);
        System.out.println(incident.toString());
        return incident;
    }

    @CrossOrigin
    @PutMapping("/escalate/{incidentId}")
    Incident escalate(@PathVariable Long incidentId) {
        Incident incident = incidentRepository.findById(incidentId).get();
        incident.setStatus(IncidentStatus.ESCALATED);
        incidentRepository.save(incident);
        System.out.println(incident.toString());
        return incident;
    }

}
