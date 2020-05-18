package com.example.aeroplane.rest;

import com.example.aeroplane.core.*;
import com.example.aeroplane.dao.*;
import com.example.aeroplane.dto.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@AllArgsConstructor
@RestController
@RequestMapping("/incident")
public class IncidentController {

    private IncidentService korisnikService;


    @PostMapping()
    public String create(  @RequestBody Incident korisnik) {
        return korisnikService.create(korisnik);
    }


    @GetMapping("/all")
    List<Incident> all() {
        return korisnikService.findAll();
    }



}
