package com.example.Parcial2.Modelo;

import jakarta.persistence.*;

@Entity
public class EstadisticaJugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstadistica;

    private int minutosJugados;
    private int goles;
    private int asistencias;
    private int tarjetasAmarillas;
    private int tarjetasRojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    private Partido partido;

    public EstadisticaJugador() {

    }

    public EstadisticaJugador(int idEstadistica, int minutosJugados, int goles, int asistencias, int tarjetasAmarillas, int tarjetasRojas, Jugador jugador, Partido partido) {
        this.idEstadistica = idEstadistica;
        this.minutosJugados = minutosJugados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.jugador = jugador;
        this.partido = partido;
    }


    public int getIdEstadistica() {
        return idEstadistica;
    }

    public void setIdEstadistica(int idEstadistica) {
        this.idEstadistica = idEstadistica;
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "EstadisticaJugador{" +
                "idEstadistica=" + idEstadistica +
                ", minutosJugados=" + minutosJugados +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", tarjetasAmarillas=" + tarjetasAmarillas +
                ", tarjetasRojas=" + tarjetasRojas +
                ", jugador=" + jugador +
                ", partido=" + partido +
                '}';
    }
}




