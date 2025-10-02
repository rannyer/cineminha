package com.example.aula03.services;

import com.example.aula03.dtos.ArtistaDto;
import com.example.aula03.models.Artista;
import com.example.aula03.repositories.ArtistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    public List<Artista> buscarTodos(){
        return artistaRepository.findAll();
    }

    public Artista criar(ArtistaDto dto){
        Artista artista =  new Artista();
        artista.setNome(dto.nome());
        artista.setNacionalidade(dto.nacionalidade());
        return artistaRepository.save(artista);
    }


}
