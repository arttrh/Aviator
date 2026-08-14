package aeroporto_project.application.dto.Response;

import aeroporto_project.domain.enums.VooStatus;

public record VooResponseDTO(
  Long voo_id,
  String aviao,
  String destino,
  String partida_em,
  String chegada_em,
  VooStatus status
) {
}

