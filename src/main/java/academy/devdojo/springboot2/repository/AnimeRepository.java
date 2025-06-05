package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;

import java.util.List;

// CONEXAO COM O BANCO DE DADOS (QUERIES)
public interface AnimeRepository {
    // private final AnimeRepository animeRepository;
    List<Anime> listAll();
}