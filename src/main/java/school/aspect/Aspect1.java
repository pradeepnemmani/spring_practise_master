package school.aspect;

/**
 * Created by deepu on 29/7/15.
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class Aspect1 {
    public Aspect1() {
        System.out.println("Aspect1 Bean Created...");
    }

    @Pointcut(value = "@annotation(school.annotation.Tx)" )
    public void beforeAnnot()
    {
    }
    @Pointcut( value = "@annotation(school.annotation.Tx)")
    public void aroundAnnt()
    {
    }
    @Before(value = "beforeAnnot()")
    public void logEntry(JoinPoint joinPoint) {
        Long entryTime = System.currentTimeMillis();
        System.out.println("Entering " + joinPoint.getSignature()+ "entryTime In milliseconds==" + entryTime);
    }
}
