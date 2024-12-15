package com.jp.frases_biblicas.frasesBiblicas;

import jakarta.persistence.*;

@Entity
public class FraseBiblica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String frase;

    // Getters and setters
}
