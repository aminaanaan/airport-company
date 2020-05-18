package com.example.aeroplane.configuration;

import com.example.aeroplane.dao.*;
import com.example.aeroplane.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.*;
import org.springframework.stereotype.*;


@Component

public class DodavanjeKorisnika {

    @Autowired
    private VrstaIncidentaRepository korisnikRepozitorij;

    @Autowired
    private PrioritetIncidentaRepository prioritetRepozitorij;

    @EventListener

    public void dodaj(ApplicationReadyEvent event) {

        dodajVrsteIncidenta();
        dodajPrioriteteIncidenta();

    }


    private void dodajVrsteIncidenta() {

        VrstaIncidenta gost = new VrstaIncidenta();
       gost.setKategorizacijaVrsteIncidenta("nesreca");

       gost.setOpis("nesreca pri radu sa uredjajima");
        korisnikRepozitorij.save(gost);
        VrstaIncidenta gost1 = new VrstaIncidenta();
        gost1.setKategorizacijaVrsteIncidenta("izgubljeni prtljag");

        gost1.setOpis("nesreca pri prtljagu");
        korisnikRepozitorij.save(gost1);
    }

    private void dodajPrioriteteIncidenta() {

        PrioritetIncidenta zaposlenik = new PrioritetIncidenta();
      zaposlenik.setKategorizacijaPrioriteta("Medium");
        prioritetRepozitorij.save(zaposlenik);
        PrioritetIncidenta zaposlenik1 = new PrioritetIncidenta();
        zaposlenik1.setKategorizacijaPrioriteta("High");
        prioritetRepozitorij.save(zaposlenik1);
        PrioritetIncidenta zaposlenik2 = new PrioritetIncidenta();
        zaposlenik2.setKategorizacijaPrioriteta("Low");
        prioritetRepozitorij.save(zaposlenik2);
    }
}
