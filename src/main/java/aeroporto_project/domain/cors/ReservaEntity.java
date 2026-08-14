package aeroporto_project.domain.cors;

import java.time.LocalDateTime;
import aeroporto_project.domain.enums.VooStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.EnumeratedValue;
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
@NoArgsConstructor
@AllArgsConstructor
public class ReservaEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long client_id;
  private Long voo_id;
  private String classe;
  private String assento;
  @EnumeratedValue(EnumType.STRING)
  private VooStatus status;
  private LocalDateTime criado_em;
}

