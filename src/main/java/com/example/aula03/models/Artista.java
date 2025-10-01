package com.example.aula03.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String nome;

    private String nacionalidade;

    @ManyToMany(mappedBy = "artistas")
    @JsonIgnoreProperties("artistas")
    private List<Filme> filmes;

    public Artista() {
    }

    public Artista(String id, String nome, String nacionalidade, List<Filme> filmes) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.filmes = filmes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}

