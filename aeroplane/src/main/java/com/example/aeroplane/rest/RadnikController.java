package com.example.aeroplane.rest;

import com.example.aeroplane.dto.*;
import com.example.aeroplane.validation.*;
import io.swagger.annotations.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/incident")
public class RadnikController {

    @Autowired
    RequestValidation requestValidation;
    @ApiOperation(value = "Login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping("/login")
    String login(@RequestBody KorisnikLoginRequest korisnikLoginRequest) throws Exception {
        requestValidation.validateLogin(korisnikLoginRequest);
        return "Successfully logged in!";
    }
}
