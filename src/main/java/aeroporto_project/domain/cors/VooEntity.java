package aeroporto_project.domain.cors;

import java.time.LocalDateTime;
import java.util.Objects;

import aeroporto_project.domain.enums.VooStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
  private String numero_voo;
  private LocalDateTime partida_em;
  private LocalDateTime chegada_em;
  private VooStatus status;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "origem_id")
  private AeroportoCityEntity origem;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "destino_id")
  private AeroportoCityEntity destino;

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass())
    return false;
    VooEntity voo = (VooEntity) o;
    return Objects.equals(id, voo.id);
  }

  @Override
  public int hashCode(){
    return Objects.hash(id);
  }
}

