package aeroporto_project.domain.exceptions;

public class EmailException extends RuntimeException{
  public EmailException(String mensagem){
    super(mensagem);
  }
}

