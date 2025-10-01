package com.example.aula03.controllers;

import com.example.aula03.models.Artista;
import com.example.aula03.services.ArtistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {
    private final ArtistaService artistaService;

    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping
    public ResponseEntity<List<Artista>> buscarTodos(){
        return ResponseEntity.ok(artistaService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Artista> adicionar(@RequestBody Artista artista){
        return ResponseEntity.ok(artistaService.criar(artista));
    }


}
