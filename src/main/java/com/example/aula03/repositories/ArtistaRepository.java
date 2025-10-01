package com.example.aula03.repositories;

import com.example.aula03.models.Artista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface ArtistaRepository extends JpaRepository<Artista, String> {
}
