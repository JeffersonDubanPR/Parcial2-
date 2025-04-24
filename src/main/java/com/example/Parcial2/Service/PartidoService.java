package com.example.Parcial2.Service;


import com.example.Parcial2.Modelo.Partido;
import com.example.Parcial2.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {




        @Autowired
        private PartidoRepository partidoRepository;

        public List<Partido> getAllPartidos() {
            return partidoRepository.findAll();
        }

        public Partido getPartidoById(Integer id) {
            return partidoRepository.findById(id).orElse(null);
        }

        public Partido savePartido(Partido partido) {
            return partidoRepository.save(partido);
        }

        public Partido updatePartido(Integer id, Partido partido) {
            partido.setIdPartido(id);
            return partidoRepository.save(partido);
        }

        public void deletePartido(Integer id) {
            partidoRepository.deleteById(id);
        }
    }



