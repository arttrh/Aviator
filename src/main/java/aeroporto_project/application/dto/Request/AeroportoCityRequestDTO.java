package aeroporto_project.application.dto.Request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AeroportoCityRequestDTO(
  @NotBlank
  String pais,
  @NotBlank
  String codigo,
  @NotNull
  LocalDateTime fuso_horario
) {
}

