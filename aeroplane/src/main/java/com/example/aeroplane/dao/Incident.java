package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "incident")
public class Incident {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long incidentId;
    @Column(name="datum_nastanka")
    private LocalDate datumNastanka;
    private String typeId;
    private Long priorityId;
    private String description;
    private Long userId;
    private Boolean resolve;
    public Incident(){}
}
