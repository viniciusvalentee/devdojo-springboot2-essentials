package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

// CLASSE QUE REPRESENTA O BANCO DE DADOS
@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String name;
}
