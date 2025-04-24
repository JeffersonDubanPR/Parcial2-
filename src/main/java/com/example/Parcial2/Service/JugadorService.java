package com.example.Parcial2.Service;


import com.example.Parcial2.Modelo.Jugador;
import com.example.Parcial2.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {




        @Autowired
        private JugadorRepository jugadorRepository;

        public List<Jugador> getAllJugadores() {
            return jugadorRepository.findAll();
        }

        public Jugador getJugadorById(Integer id) {
            return jugadorRepository.findById(id).orElse(null);
        }

        public Jugador saveJugador(Jugador jugador) {
            return jugadorRepository.save(jugador);
        }

        public Jugador updateJugador(Integer id, Jugador jugador) {
            jugador.setIdJugador(id);
            return jugadorRepository.save(jugador);
        }

        public void deleteJugador(Integer id) {
            jugadorRepository.deleteById(id);
        }
    }


