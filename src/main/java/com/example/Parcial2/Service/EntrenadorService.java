package com.example.Parcial2.Service;


import com.example.Parcial2.Modelo.Entrenador;
import com.example.Parcial2.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<Entrenador> getAllEntrenadores() {
        return entrenadorRepository.findAll();
    }

    public Entrenador getEntrenadorById(Integer id) {
        return entrenadorRepository.findById(id).orElse(null);
    }

    public Entrenador saveEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public Entrenador updateEntrenador(Integer id, Entrenador entrenador) {
        entrenador.setIdEntrenador(id);
        return entrenadorRepository.save(entrenador);
    }

    public void deleteEntrenador(Integer id) {
        entrenadorRepository.deleteById(id);
    }
}

