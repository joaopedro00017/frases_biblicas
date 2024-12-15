package com.jp.frases_biblicas.frasesBiblicasRepository;

import com.jp.frases_biblicas.frasesBiblicas.FraseBiblica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseBiblicaRepository extends JpaRepository<FraseBiblica, Long> {
    @Query("SELECT f FROM FraseBiblica f ORDER BY RAND() LIMIT 1")
    FraseBiblica findRandomFrase();
}