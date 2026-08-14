package aeroporto_project.application.dto.Request;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import aeroporto_project.domain.enums.VooStatus;

public record ReservaRequestDTO(
  @NotNull
  Long client_id,
  @NotNull
  Long voo_id,
  @NotBlank
  String classe,
  @NotBlank
  String assento,
  @NotNull
  VooStatus status,
  @NotNull
  LocalDateTime criado_em
) {

}

