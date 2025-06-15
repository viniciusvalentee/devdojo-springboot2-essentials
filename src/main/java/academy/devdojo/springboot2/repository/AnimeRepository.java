package academy.devdojo.springboot2.repository;

import academy.devdojo.springboot2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

// CONEXAO COM O BANCO DE DADOS (QUERIES)
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}