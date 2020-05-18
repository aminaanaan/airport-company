package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "avioKompanija")
public class AvioKompanija {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long avioKompanijaId;
    private String naziv;
    @Column(name="broj_letjelica")
    private Long brojLetjelica;

    private Long grupacijaAviokompanijeId;

    public AvioKompanija(){}
}
