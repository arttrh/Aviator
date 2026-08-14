package aeroporto_project.application.dto.Response;

import java.time.LocalDateTime;

public record AeroportoCityResponseDTO(
  Long id,
  String pais,
  String codigo,
  LocalDateTime fuso_horario
) {
}

