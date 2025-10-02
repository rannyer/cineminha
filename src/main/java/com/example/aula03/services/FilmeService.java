package com.example.aula03.services;

import com.example.aula03.dtos.FilmeDto;
import com.example.aula03.models.Artista;
import com.example.aula03.models.Filme;
import com.example.aula03.repositories.ArtistaRepository;
import com.example.aula03.repositories.FilmeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    private final FilmeRepository filmeRepository;
    private final ArtistaRepository artistaRepository;
    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public List<FilmeDto> buscarTodos(){
        List<FilmeDto> filmeDto =  new ArrayList<>();
        filmeRepository.findAll().stream().forEach(f ->{
            FilmeDto dto =  new FilmeDto();
            dto.setId(f.getId());
            dto.setArtistas(f.getArtistas());
            dto.setClassificacao(f.getClassificacao());
            dto.setDuracao(f.getDuracao());
            dto.setGenero(f.getGenero());
            filmeDto.add(dto);
        });

        return filmeDto;
    }

    public Filme criar(Filme filme)
    {
        Optional<Artista> artista = artistaRepository.findById(filme)
        return filmeRepository.save(filme);
    }


}
