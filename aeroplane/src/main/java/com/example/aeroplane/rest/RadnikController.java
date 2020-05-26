package com.example.aeroplane.rest;

import com.example.aeroplane.dao.*;
import com.example.aeroplane.dto.*;
import com.example.aeroplane.repository.*;
import com.example.aeroplane.validation.*;
import io.swagger.annotations.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.*;

@CrossOrigin
@AllArgsConstructor
@RestController
    @RequestMapping("/radnik")
public class RadnikController {

    @Autowired
    RequestValidation requestValidation;
    @Autowired
    KorisnikRepository radnikRepository;
    @ApiOperation(value = "Login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

    @CrossOrigin
    @PostMapping("/login")
    String login(@RequestBody KorisnikLoginRequest korisnikLoginRequest) throws Exception {
        requestValidation.validateLogin(korisnikLoginRequest);
        return "Successfully logged in!";
    }

    @ApiOperation(value = "Create User", consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping()
    public String create(@Valid @RequestBody Radnik korisnik) {
         radnikRepository.save(korisnik);
         return "Radnik sacuvan";
    }

    @CrossOrigin
    @GetMapping("/username/{username}")
    public Radnik findByUsername(@PathVariable String username){
        return radnikRepository.findByUsername(username);
    }
}
