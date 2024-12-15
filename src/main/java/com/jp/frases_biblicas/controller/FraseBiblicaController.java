package com.jp.frases_biblicas.controller;

import com.jp.frases_biblicas.frasesBiblicas.FraseBiblica;
import com.jp.frases_biblicas.frasesBiblicasRepository.FraseBiblicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseBiblicaController {
    @Autowired
    private FraseBiblicaRepository fraseBiblicaRepository;

    @GetMapping("/frase-aleatoria")
    public FraseBiblica getFraseAleatoria() {
        return fraseBiblicaRepository.findRandomFrase();
    }
}

