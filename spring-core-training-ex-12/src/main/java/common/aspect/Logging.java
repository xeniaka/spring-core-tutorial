package common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class Logging {

    @Pointcut("@annotation(Loggable)")
    public void log() {

    }

    @AfterReturning(pointcut = "log()", returning = "returnValue")
    public void writeTo(JoinPoint joinPoint, Object returnValue) {
        StringBuilder message = new StringBuilder();
        message.append("Method: ").append(joinPoint.getSignature().getName());
        message.append(", Args Length: ").append(joinPoint.getArgs() == null ? "0" : joinPoint.getArgs().length);

        if (returnValue instanceof Collection) {
            message.append(", Return Type is a Collection");
        }

        System.out.println(message.toString());
    }
}
