package aeroporto_project.infrastructure.config.Anotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MedirTempoAespect {

  @Around("@annotation(MethodCustom)")
  public Object monitorarTempo(ProceedingJoinPoint joinPoint) throws Throwable{
    long inicio = System.currentTimeMillis();
    Object resultado = joinPoint.proceed();
    long fim = System.currentTimeMillis();
    long tempoTotal = fim - inicio;
    String nomeMetodo = joinPoint.getSignature().toShortString();
    System.out.println("Metodo: " + nomeMetodo + " demorou " + tempoTotal);
    return resultado;
  }
}

