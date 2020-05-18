package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "prioritet_incidenta")
public class PrioritetIncidenta {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long prioritetIncidentaId;
private String kategorizacijaPrioriteta;
    public PrioritetIncidenta(){}
}
