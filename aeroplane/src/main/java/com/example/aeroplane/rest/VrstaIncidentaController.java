package com.example.aeroplane.rest;

import com.example.aeroplane.dao.*;
import com.example.aeroplane.repository.*;
import io.swagger.annotations.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/vrsta_incidenta")
public class VrstaIncidentaController {
    VrstaIncidentaRepository repository;

    @ApiOperation(value = "Create Vrsta Incidenta", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping()
    public String create( @RequestBody VrstaIncidenta korisnik) {
        repository.save(korisnik);
        return "vrsta incidenta sacuvana";
    }
}
