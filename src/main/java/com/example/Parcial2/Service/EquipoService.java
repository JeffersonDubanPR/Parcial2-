package com.example.Parcial2.Service;

import com.example.Parcial2.Modelo.Equipo;
import com.example.Parcial2.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {


    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> getAllEquipos() {
        return equipoRepository.findAll();
    }

    public Equipo getEquipoById(Integer id) {
        return equipoRepository.findById(id).orElse(null);
    }


    public Equipo saveEquipo(Equipo equipo) {

        return equipo;
    }

    public Equipo updateEquipo(Integer id, Equipo equipo) {

        return equipo;
    }


    public void deleteEquipo(Integer id) {

    }
}
