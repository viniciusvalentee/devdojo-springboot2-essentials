package academy.devdojo.springboot2.requests;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AnimePostRequestBody {
    @NotEmpty(message = "The name of this anime cannot be empty")
    private String name;
}
