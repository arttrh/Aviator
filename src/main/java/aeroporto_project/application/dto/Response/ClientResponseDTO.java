package aeroporto_project.application.dto.Response;

// Adicioanr os pattern DTO
public record ClientResponseDTO(
  Long client_id,
  String nome,
  String email,
  String documento,
  String telefone
) {
}

