package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "incidentDetail")
public class IncidentDetail {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="incident_detail_id")
    private Long incidentDetailId;

    private Long incidentId;
    private String comment;
    private Long userId;

    public IncidentDetail(){}
}
