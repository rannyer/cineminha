package com.example.aula03.services;

import com.example.aula03.models.Filme;
import com.example.aula03.repositories.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<Filme> buscarTodos(){
        return filmeRepository.findAll();
    }

    public Filme criar(Filme filme){
        return filmeRepository.save(filme);
    }


}
