package com.jp.frases_biblicas.frasesBiblicasRepository;

import com.jp.frases_biblicas.frasesBiblicas.FraseBiblica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseBiblicaRepository extends JpaRepository<FraseBiblica, Long> {
    @Query(value = "SELECT * FROM frasesbiblicas ORDER BY rand() LIMIT 1", nativeQuery = true)
    FraseBiblica findRandomFrases();
}