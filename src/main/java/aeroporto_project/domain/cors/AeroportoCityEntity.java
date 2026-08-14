package aeroporto_project.domain.cors;

import java.util.Objects;

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
@NoArgsConstructor
@AllArgsConstructor
// Implementar API de mundos
public class AeroportoCityEntity { 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String lata_code;
  private String municipio;
  private String codigo_pais;
  @JoinColumn(name = "destino_id")
  @ManyToOne(fetch = FetchType.LAZY)
  private VooEntity destino;
  @JoinColumn(name = "origem_id")
  @ManyToOne(fetch = FetchType.LAZY)
  private VooEntity origem;
  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    AeroportoCityEntity aeroporto = (AeroportoCityEntity) o;
    return Objects.equals(id, aeroporto.id);
  }

  @Override
  public int hashCode(){
    return Objects.hash(id);
  }
}

