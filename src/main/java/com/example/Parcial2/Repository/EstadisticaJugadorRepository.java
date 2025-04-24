package com.example.Parcial2.Repository;

import com.example.Parcial2.Modelo.EstadisticaJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EstadisticaJugadorRepository  extends JpaRepository<EstadisticaJugador, Integer> {


    @Query(value = """
        SELECT SUM(ej.goles)
        FROM estadistica_jugador ej
        JOIN jugador j ON ej.id_jugador = j.id_jugador
        WHERE j.id_equipo = :idEquipo
    """, nativeQuery = true)
    Integer totalGolesEquipo(@Param("idEquipo") Integer idEquipo);
}

