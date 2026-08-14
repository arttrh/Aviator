package aeroporto_project.application.dto.Request;

import jakarta.validation.constraints.NotBlank;

// criar o Pattern dos atributos
public record ClientRequestDTO(
  @NotBlank
  String nome,
  @NotBlank
  String email,
  @NotBlank
  String documento,
  @NotBlank 
  String telefone
) {
}

