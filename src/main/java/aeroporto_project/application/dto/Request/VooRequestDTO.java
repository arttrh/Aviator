package aeroporto_project.application.dto.Request;

import java.time.LocalDateTime;

import aeroporto_project.domain.enums.VooStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record VooRequestDTO(
  @NotBlank
  String aviao,
  @NotBlank
  String origem,
  @NotBlank
  String destino,
  @NotNull
  LocalDateTime partida_em,
  @NotNull
  LocalDateTime chegada_em,
  VooStatus status
) {
}

