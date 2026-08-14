package aeroporto_project.domain.cors;

import java.time.LocalDateTime;

import aeroporto_project.domain.enums.VooStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VooEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String aviao;
  private String origem;
  private String destino;
  private LocalDateTime partida_em;
  private LocalDateTime chegada_em;
  private VooStatus status; 
}

