package com.example.aeroplane.validation;

import com.example.aeroplane.dao.*;
import com.example.aeroplane.dto.*;
import com.example.aeroplane.repository.*;

import lombok.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;

@AllArgsConstructor
@Component
public class RequestValidation {

    KorisnikRepository korisnikRepository;



    public String validateLogin(KorisnikLoginRequest korisnik) throws Exception {
       if((korisnikRepository.existsByUsername(korisnik.getUsername()))){
            Radnik korisnikEntity=korisnikRepository.findByUsername(korisnik.getUsername());
            if(korisnik.getPassword().equals(korisnikEntity.getPassword())){
                return null;
            }
            else{
                throw new Exception("Incorrect password!");
            }
        }
else
           throw new Exception("User with this username doesn't exists in database.Please choose another one.");

    }

}
