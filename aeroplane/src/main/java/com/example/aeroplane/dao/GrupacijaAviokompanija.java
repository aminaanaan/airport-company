package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "grupacija_aviokompanija")
public class GrupacijaAviokompanija {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="grupacija_aviokompanija_id")
    private Long grupacijaAviokompanijaId;
private String vrstaAviokompanije;
private Long maksimalniKapacitet;
    public GrupacijaAviokompanija(){}
}
