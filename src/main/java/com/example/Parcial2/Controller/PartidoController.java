package com.example.Parcial2.Controller;

import com.example.Parcial2.Modelo.Partido;
import com.example.Parcial2.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/partidos")
public class PartidoController {


        @Autowired
        private PartidoService partidoService;

        @GetMapping
        public List<Partido> getAllPartidos() {
            return partidoService.getAllPartidos();
        }

        @GetMapping("/{id}")
        public Partido getPartidoById(@PathVariable Integer id) {
            return partidoService.getPartidoById(id);
        }

        @PostMapping
        public Partido createPartido(@RequestBody Partido partido) {
            return partidoService.savePartido(partido);
        }

        @PutMapping("/{id}")
        public Partido updatePartido(@PathVariable Integer id, @RequestBody Partido partido) {
            return partidoService.updatePartido(id, partido);
        }

        @DeleteMapping("/{id}")
        public void deletePartido(@PathVariable Integer id) {
            partidoService.deletePartido(id);
        }
    }

