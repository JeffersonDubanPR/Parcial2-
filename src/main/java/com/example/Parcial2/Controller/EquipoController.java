package com.example.Parcial2.Controller;


import com.example.Parcial2.Modelo.Equipo;
import com.example.Parcial2.Service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/equipos")

public class EquipoController {



        @Autowired
        private EquipoService equipoService;

        @GetMapping
        public List<Equipo> getAllEquipos() {
            return equipoService.getAllEquipos();
        }

        @GetMapping("/{id}")
        public Equipo getEquipoById(@PathVariable Integer id) {
            return equipoService.getEquipoById(id);
        }

        @PostMapping
        public Equipo createEquipo(@RequestBody Equipo equipo) {
            return equipoService.saveEquipo(equipo);
        }

        @PutMapping("/{id}")
        public Equipo updateEquipo(@PathVariable Integer id, @RequestBody Equipo equipo) {
            return equipoService.updateEquipo(id, equipo);
        }

        @DeleteMapping("/{id}")
        public void deleteEquipo(@PathVariable Integer id) {
            equipoService.deleteEquipo(id);
        }
    }

