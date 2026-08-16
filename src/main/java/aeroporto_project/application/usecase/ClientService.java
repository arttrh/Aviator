package aeroporto_project.application.usecase;


import java.awt.print.Pageable;

import org.hibernate.query.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import aeroporto_project.application.dto.Request.ClientRequestDTO;
import aeroporto_project.application.dto.Response.Client.ClientReadDTO;
import aeroporto_project.application.usecase.Validation.ValidationEmail;
import aeroporto_project.domain.cors.ClienteEntity;
import aeroporto_project.domain.exceptions.ClientNotFound;
import aeroporto_project.domain.repository.ClientRepositoryJpa;
import aeroporto_project.infrastructure.config.Anotation.MethodClientNotFound;
import jakarta.transaction.Transactional;

@Service
public class ClientService {
  private final ValidationEmail email;
  private final ClientRepositoryJpa jpa;
  private static final Logger log = LoggerFactory.getLogger(ClientService.class); 
  public ClientService(ValidationEmail email, ClientRepositoryJpa jpa){ 
    this.email = email;
    this.jpa = jpa;
  }

  @Transactional
  @MethodClientNotFound
  public ClienteEntity cadastrar(ClienteEntity clienteEntity, ClientRequestDTO dto){
    try{
    email.ValidarClient(dto);
   ClienteEntity saved = jpa.save(clienteEntity);
   return saved;
    } catch (Exception e){
      throw new ClientNotFound("cliente não existe");
    }
  }

  public ClienteEntity buscar(Long id){
    ClienteEntity client = jpa.findById(id).orElseThrow(() -> new ClientNotFound("Cliente não existe"));
   return client;
  }
}

