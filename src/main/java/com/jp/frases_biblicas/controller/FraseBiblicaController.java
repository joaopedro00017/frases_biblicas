package com.jp.frases_biblicas.controller;

import com.jp.frases_biblicas.frasesBiblicas.Frase;
import com.jp.frases_biblicas.frasesBiblicasRepository.FraseBiblicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FraseBiblicaController {
    @Autowired
    private FraseBiblicaRepository fraseBiblicaRepository;

    @GetMapping("/frase")
    public List<Frase> getAllFrases(){
        return fraseBiblicaRepository.findAll();
    }
}

