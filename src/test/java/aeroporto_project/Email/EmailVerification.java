package aeroporto_project.Email;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import aeroporto_project.application.usecase.Validation.ValidationEmail;

public class EmailVerification {
  @Test
  void VerificarEmailSemOArroba(){
    ValidationEmail email = new ValidationEmail();
    assertThrows(RuntimeException.class, () ->
      email.validarEmail("arthurgmail.com")); }

  @Test
  void VerificarEmailComOArroba(){
    ValidationEmail email = new ValidationEmail();
    assertThrows(RuntimeException.class, () 
    -> email.validarEmail("arthur@gmail.com"));
  }
}

