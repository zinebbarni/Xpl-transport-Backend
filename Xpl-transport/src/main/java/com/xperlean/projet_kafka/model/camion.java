package com.xperlean.projet_kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.xperlean.projet_kafka.model.position;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class camion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToOne
    private  position p;

}
