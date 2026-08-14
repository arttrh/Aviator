package aeroporto_project.application.dto.Response;

import java.time.LocalDateTime;

import aeroporto_project.domain.enums.VooStatus;

public record ReservaResponseDTO(
  Long client_id,
  Long voo_id,
  String classe,
  String assento,
  VooStatus status,
  LocalDateTime criado_em
) {
}

