package aeroporto_project.domain.cors;

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
  private String telefone; // Criar classe responsavel por gerenciar telefone
  
}

