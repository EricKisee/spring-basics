package eric.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    
    //creating a pointcut
    @Pointcut("@annotation(Loggable)")
    public void executeLogging(){}

}
