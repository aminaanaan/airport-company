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
    private int status;

    public Incident(){}

    public Long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(IncidentStatus incidentStatus) {
        switch (incidentStatus){
            case UNRESOLVED:
                this.status = 0;
                break;
            case RESOLVED:
                this.status = 1;
                break;
            case ESCALATED:
                this.status = 2;
                break;
        }
    }
}
