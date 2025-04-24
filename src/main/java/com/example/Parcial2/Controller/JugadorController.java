package com.example.Parcial2.Controller;

import com.example.Parcial2.Modelo.Jugador;
import com.example.Parcial2.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

        @Autowired
        private JugadorService jugadorService;

        @GetMapping
        public List<Jugador> getAllJugadores() {
            return jugadorService.getAllJugadores();
        }

        @GetMapping("/{id}")
        public Jugador getJugadorById(@PathVariable Integer id) {
            return jugadorService.getJugadorById(id);
        }

        @PostMapping
        public Jugador createJugador(@RequestBody Jugador jugador) {
            return jugadorService.saveJugador(jugador);
        }

        @PutMapping("/{id}")
        public Jugador updateJugador(@PathVariable Integer id, @RequestBody Jugador jugador) {
            return jugadorService.updateJugador(id, jugador);
        }

        @DeleteMapping("/{id}")
        public void deleteJugador(@PathVariable Integer id) {
            jugadorService.deleteJugador(id);
        }
    }


