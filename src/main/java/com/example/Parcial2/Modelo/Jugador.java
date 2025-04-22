package com.example.Parcial2.Modelo;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idJugador;

    private String nombre;
    private String posicion;
    private int dorsal;
    private LocalDate fechaNac;
    private String nacionalidad;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private Equipo equipo;

    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    private List<EstadisticaJugador> estadisticas;

    public Jugador() {

    }


    public Jugador(Integer idJugador, String nombre, String posicion, Integer dorsal, LocalDate fechaNac, String nacionalidad, Equipo equipo, List<EstadisticaJugador> estadisticas) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }


    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int  idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int  dorsal) {
        this.dorsal = dorsal;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public List<EstadisticaJugador> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticaJugador> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "idJugador=" + idJugador +
                ", nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", dorsal=" + dorsal +
                ", fechaNac=" + fechaNac +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", equipo=" + equipo +
                ", estadisticas=" + estadisticas +
                '}';
    }


}

