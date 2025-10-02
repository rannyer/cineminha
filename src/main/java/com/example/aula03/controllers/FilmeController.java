package com.example.aula03.controllers;

import com.example.aula03.dtos.FilmeDto;
import com.example.aula03.models.Filme;
import com.example.aula03.services.FilmeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @GetMapping
    public ResponseEntity<List<FilmeDto>> buscarTodos(){
        return ResponseEntity.ok(filmeService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<Filme> adicionar(@RequestBody Filme filme){
        return ResponseEntity.ok(filmeService.criar(filme));
    }


}
