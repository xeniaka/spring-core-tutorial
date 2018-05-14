package common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {

    @Pointcut("@annotation(Loggable)")
    public void log() {

    }

    @Before("log()")
    public void writeTo(JoinPoint joinPoint) {
        StringBuilder message = new StringBuilder();
        message.append("Method: ").append(joinPoint.getSignature().getName());
        message.append(", Args Length: ").append(joinPoint.getArgs() == null ? "0" : joinPoint.getArgs().length);
        System.out.println(message.toString());
    }
}
