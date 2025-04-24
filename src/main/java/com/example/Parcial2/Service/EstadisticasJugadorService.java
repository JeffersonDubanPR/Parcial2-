package com.example.Parcial2.Service;

import com.example.Parcial2.Modelo.EstadisticaJugador;
import com.example.Parcial2.Repository.EstadisticaJugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticasJugadorService {




        @Autowired
        private EstadisticaJugadorRepository estadisticaRepository;

        public List<EstadisticaJugador> getAllEstadisticas() {
            return estadisticaRepository.findAll();
        }

        public EstadisticaJugador getEstadisticaById(Integer id) {
            return estadisticaRepository.findById(id).orElse(null);
        }

        public EstadisticaJugador saveEstadistica(EstadisticaJugador estadistica) {
            return estadisticaRepository.save(estadistica);
        }

        public EstadisticaJugador updateEstadistica(Integer id, EstadisticaJugador estadistica) {
            estadistica.setIdEstadistica(id);
            return estadisticaRepository.save(estadistica);
        }

        public void deleteEstadistica(Integer id) {
            estadisticaRepository.deleteById(id);
        }
    }


