package aeroporto_project.application.dto.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

// criar o Pattern dos atributos
public record ClientRequestDTO(
  @NotBlank
  String nome,
  @NotBlank
  String email,
  @NotBlank 
  @Pattern(regexp = "\\d{2}\\.\\d{3}\\.\\d{3}-\\d{1}", message = "O Rg deve conter esse padrão: 99.999.999-9")
  String rg,
  @NotBlank
  @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\.\\d{2}", message = "O cpf deve conter esse padrão 000.000.000-00")
  String cpf
) {
}

