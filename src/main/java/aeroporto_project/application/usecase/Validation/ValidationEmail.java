package aeroporto_project.application.usecase.Validation;

import org.springframework.stereotype.Component;

import aeroporto_project.domain.exceptions.EmailException;
import aeroporto_project.infrastructure.config.Anotation.MedirTempoMethod;

@Component
public class ValidationEmail {
  @MedirTempoMethod  
  public void validarEmail(String dto){ 
    String email = dto;
    if(!email.contains("@")){
       throw new EmailException("Email invalido"); 
    }
  }
}

