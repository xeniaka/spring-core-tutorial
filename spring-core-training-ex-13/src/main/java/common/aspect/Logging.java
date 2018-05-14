package common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Aspect
public class Logging {

    @Pointcut("@annotation(Loggable)")
    private void log() {

    }

    @Around("log()")
    private Object writeTo(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object returnValue = joinPoint.proceed();
        long finishTime = System.currentTimeMillis() - startTime;

        StringBuilder message = new StringBuilder();
        message.append("Method: ").append(joinPoint.getSignature().getName());
        message.append(", Args Length: ").append(joinPoint.getArgs() == null ? "0" : joinPoint.getArgs().length);
        message.append(", Execution Time: ").append(finishTime).append(" ms");

        System.out.println(message.toString());

        return returnValue;
    }
}
