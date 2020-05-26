package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "uredjaj")
public class Uredjaj {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="uredjaj_id")
    private Long uredjajId;

    private String imeUredjaja;
    private Long incidentId;
    private String vrstaUredjaja;
    private String statusUredjaja;
    private LocalDate datumServisa;

    private Long dodijeljeniRadnikId;
    private Long grupacijaUredjajaId;

    public Long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
    }
}
