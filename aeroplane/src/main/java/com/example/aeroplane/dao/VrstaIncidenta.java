package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "vrsta_incidenta")
public class VrstaIncidenta {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="vrsta_incidenta_id")
    private Long vrstaIncidentaId;
    @Column(name="kategorizacija_vrste_incidenta")
    private String kategorizacijaVrsteIncidenta;
    private String opis;
public VrstaIncidenta(){}
}
