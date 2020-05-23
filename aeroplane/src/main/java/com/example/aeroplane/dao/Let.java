package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "let")
public class Let {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long letId;

    @Column(name="vrijeme_polaska")
private LocalDateTime vrijemePolaska;

    private String destinacija;
private Long avioKompanijaID;

private String modelAviona;
private Long incidentId;

    public Let(){}
}
