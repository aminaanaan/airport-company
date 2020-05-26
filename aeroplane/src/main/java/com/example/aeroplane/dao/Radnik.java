package com.example.aeroplane.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "radnik")
public class Radnik {
    @javax.persistence.Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="radnik_id")
    private Long radnikId;

    private String ime;
    private Long incidentId;
    private String prezime;
    private String vrstaPosla;
    private String trenutniStatus;
    private Long grupacijaRadnikaId;
    private String username;
    private String password;
    public Radnik(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
