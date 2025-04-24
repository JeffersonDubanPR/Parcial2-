package com.example.Parcial2.Repository;

import com.example.Parcial2.Modelo.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JugadorRepository  extends JpaRepository<Jugador, Integer> {



    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findByEquipoId(@Param("idEquipo") Integer idEquipo);


    @Query(value = """
        SELECT j.* FROM jugador j
        JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador
        GROUP BY j.id_jugador
        HAVING SUM(e.goles) > :goles
    """, nativeQuery = true)
    List<Jugador> findJugadoresConMasDeXGoles(@Param("goles") Integer goles);
}



