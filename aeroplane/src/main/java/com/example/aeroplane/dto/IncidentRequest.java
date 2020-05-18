package com.example.aeroplane.dto;

import lombok.*;

import java.time.*;
@Data
public class IncidentRequest {
    private Long categoryId;
    private Long unitId;
    private LocalDate datumNastanka;
    private String typeId;
    private Long priorityId;
    private String description;
    private Long userId;


}
