package com.example.aeroplane.rest;

import com.example.aeroplane.dao.*;
import com.example.aeroplane.repository.*;
import io.swagger.annotations.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
@RequestMapping("/odjel")
public class GrupacijaRadnikaController {

    GrupacijaRadnikaRepository repository;

    @ApiOperation(value = "Create Grupacija Radnika", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping()
    public String create( @RequestBody GrupacijaRadnika korisnik) {
        repository.save(korisnik);
        return "grupacija radnika sacuvana";
    }
}
