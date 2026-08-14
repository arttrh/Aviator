package aeroporto_project.domain.cors;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity { 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String email; // Criar uma classe responsavel por gerenciar emails
  private String documento; // Criar uma classe responsavel por gerenciar documento 

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    ClienteEntity cliente = (ClienteEntity) o;
    return Objects.equals(id, cliente.id);
  }
  
  @Override
  public int hashCode(){
    return Objects.hash(id);
  } 
}

