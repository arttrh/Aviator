package aeroporto_project.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailDTO(
  @Email
  @NotBlank
  String email
)
{}

