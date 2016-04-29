package school.logging;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by deepu on 29/7/15.
 */
public class Logging {
    public void logEntry(JoinPoint joinPoint) {
        Long entryTime = System.currentTimeMillis();
        System.out.println("Entering " + joinPoint.getSignature()+ "entryTime In milliseconds==" + entryTime);
    }

    public Object timeTaken(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long entryTime = System.currentTimeMillis();
        Object o = proceedingJoinPoint.proceed();
        Long endTime = System.currentTimeMillis();
        ;
        System.out.println("Execution of method - " + proceedingJoinPoint.getSignature() + " took - " + (endTime - entryTime) + " milliseconds.");

        return o;
    }
}
