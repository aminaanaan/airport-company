package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;
@Entity
@AllArgsConstructor
@Table(name = "grupacija_uredjaja")
public class GrupacijaUredjaja {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="grupacija_uredjaja_id")
    private Long grupacijaUredjajaId;
    private String kategorizacijaUredjaja;
    private Long maksimalniKapacitet;
    public GrupacijaUredjaja(){}
}
