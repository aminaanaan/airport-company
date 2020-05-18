package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "grupacija_radnika")
public class GrupacijaRadnika {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="grupacija_radnika_id")
    private Long grupacijaRadnikaId;
    private String odjel;
    private Long maksimalniKapacitet;
    public GrupacijaRadnika(){}
}
