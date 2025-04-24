package com.example.Parcial2.Controller;


import com.example.Parcial2.Modelo.EstadisticaJugador;
import com.example.Parcial2.Service.EstadisticasJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estadisticas")
public class EstadisticaJugadorController {

        @Autowired
        private EstadisticasJugadorService estadisticaService;

        @GetMapping
        public List<EstadisticaJugador> getAllEstadisticas() {
            return estadisticaService.getAllEstadisticas();
        }

        @GetMapping("/{id}")
        public EstadisticaJugador getEstadisticaById(@PathVariable Integer id) {
            return estadisticaService.getEstadisticaById(id);
        }

        @PostMapping
        public EstadisticaJugador createEstadistica(@RequestBody EstadisticaJugador estadistica) {
            return estadisticaService.saveEstadistica(estadistica);
        }

        @PutMapping("/{id}")
        public EstadisticaJugador updateEstadistica(@PathVariable Integer id, @RequestBody EstadisticaJugador estadistica) {
            return estadisticaService.updateEstadistica(id, estadistica);
        }

        @DeleteMapping("/{id}")
        public void deleteEstadistica(@PathVariable Integer id) {
            estadisticaService.deleteEstadistica(id);
        }
    }


