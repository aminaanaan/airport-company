package com.example.aeroplane.dto;

import lombok.*;

import java.time.*;
@Data
public class IncidentRequest {

    private Long unitId; //flight id ili device id
    private LocalDate datumNastanka;
    private String typeId;
    private Long priorityId;
    private String description;
    private Long userId;

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }
}
