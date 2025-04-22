package com.example.Parcial2.Modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPartido;

    private LocalDate fecha;
    private String estadio;
    private int golesLocal;
    private int  golesVisita;

    @ManyToOne
    @JoinColumn(name = "equipo_local")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "equipo_visita")
    private Equipo equipoVisita;

    @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL)
    private List<EstadisticaJugador> estadisticas;

    public Partido() {

    }



    public Partido(Integer idPartido, LocalDate fecha, String estadio, int golesLocal, int  golesVisita, Equipo equipoLocal, Equipo equipoVisita, List<EstadisticaJugador> estadisticas) {
        this.idPartido = idPartido;
        this.fecha = fecha;
        this.estadio = estadio;
        this.golesLocal = golesLocal;
        this.golesVisita = golesVisita;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
        this.estadisticas = estadisticas;
    }


    public Integer getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int  idPartido) {
        this.idPartido = idPartido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int  getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int  golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int  getGolesVisita() {
        return golesVisita;
    }

    public void setGolesVisita(int golesVisita) {
        this.golesVisita = golesVisita;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public List<EstadisticaJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticaJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "idPartido=" + idPartido +
                ", fecha=" + fecha +
                ", estadio='" + estadio + '\'' +
                ", golesLocal=" + golesLocal +
                ", golesVisita=" + golesVisita +
                ", equipoLocal=" + equipoLocal +
                ", equipoVisita=" + equipoVisita +
                ", estadisticas=" + estadisticas +
                '}';
    }
}

