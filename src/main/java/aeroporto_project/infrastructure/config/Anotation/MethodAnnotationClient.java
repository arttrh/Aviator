package aeroporto_project.infrastructure.config.Anotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import aeroporto_project.domain.exceptions.ClientNotFound;
import aeroporto_project.domain.repository.ClientRepositoryJpa;

@Aspect
@Component
public class MethodAnnotationClient {
  private ClientRepositoryJpa repositoryJpa;
  public MethodAnnotationClient(ClientRepositoryJpa repositoryJpa){
    this.repositoryJpa = repositoryJpa;
  }
@Around("@annotation(MethodClientNotFound)")
  public Object clientValidarNotFound(ProceedingJoinPoint joinPoint, Long id) throws Throwable{
    repositoryJpa.findById(id).orElseThrow(() -> new ClientNotFound("Cliente não existe na base de dados"));
    Object resultado = joinPoint.proceed();
    return resultado;
  }
}

