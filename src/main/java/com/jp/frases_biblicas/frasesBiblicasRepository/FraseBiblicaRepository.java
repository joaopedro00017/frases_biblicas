package com.jp.frases_biblicas.frasesBiblicasRepository;

import com.jp.frases_biblicas.frasesBiblicas.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseBiblicaRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f from Frase f ORDER BY RAND() LIMIT 1")
    Frase findRamdomFrase();
}