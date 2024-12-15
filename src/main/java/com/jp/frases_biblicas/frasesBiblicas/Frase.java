package com.jp.frases_biblicas.frasesBiblicas;

import jakarta.persistence.*;

@Entity
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "TEXT")
    private String frase;
}
