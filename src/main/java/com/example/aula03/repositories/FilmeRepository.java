package com.example.aula03.repositories;

import com.example.aula03.models.Artista;
import com.example.aula03.models.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, String> {

}
